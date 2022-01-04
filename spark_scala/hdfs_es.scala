import org.apache.spark.sql.SparkSession
import org.apache.hadoop.fs.{FileSystem, Path}
import org.elasticsearch.spark.sql._
object Main{
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("WriteJSONToES")
      .master("spark://272d6bd6df61:7077")
      .config("spark.es.nodes","172.18.0.6")
      .config("spark.es.port","9200")
      .getOrCreate()
    
    conf = spark.sparkContext.hadoopConfiguration
    conf.set("fs.defaultFS", "hdfs://namenode:9000")

    val fs = FileSystem.get(conf)
    val fileStatus = hdfs.listStatus(new Path("hdfs://namenode:9000/user/hadoop/data/"))
    val fileList = fileStatus.map(x => x.getPath.toString)

    fileList.foreach( fileName => {
        val ticker = fileName.substring(38)
        ticker = ticker.replaceAll(".csv","").toLowerCase()
        val colorsDF = spark.read.csv(fileName)
        colorsDF.saveToEs(ticker)
    })
    
  }

}