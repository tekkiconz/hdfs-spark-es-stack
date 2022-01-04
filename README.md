# Big Data Project (done by Big Data)

Đây là bài tập lớn big dât của nhóm, nhóm thực hiện triển khai một stack hdfs, spark, elasticsearch và kibana để lưu trữ và xử lý dữ liệu.

Dưới đây là các bước triển khai.

## 1. Triển khai các cluster

Các tệp liên quan đến docker deployment được lưu trong folder [`/docker`](./docker)

Thực hiện theo các bước trong folder

## 2. Crawl và lưu dữ liệu vào hdfs

Các tệp liên quan đến dữ liệu crawl về sẽ được đặt trong folder [`/crawl`](./crawl)

Thực hiện theo các bước trong folder

## 3. Thực hiện spark job

File để build spark job sẽ dược đặt trong folder [`/spark_scala`](./spark_scala)

Đẩy file [`hdfs_es.jar`](./spark_scala/hdfs_es.jar) lên máy `spark-master` 

```
$ docker cp ./spark_scala/hdfs_es.jar spark-master:/hdfs_es.jar
```

Vào cli của spark-master

```
$ docker exec spark-master bash
```

Chạy spark job

```
$ spark-submit hdfs_es.jar
```

Kiểm tra spark job và thực hiện visualize trên `Kibana`
# Tham khảo

Dự án được thực hiện và lấy ý tưởng dựa trên một số dự án sau:
- [Big Data Europe](https://github.com/big-data-europe)
- [ElasticSearch](https://www.elastic.co/guide/en/elasticsearch/reference/current/docker.html)