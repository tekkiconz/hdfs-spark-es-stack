# Crawl dữ liệu

Chạy file [`bigdata_get_ticker.py`](bigdata_get_ticker.py)

```bash
$python bigdata_get_ticker.py
```

Chạy file [`bigdata_crawler.py`](bigdata_crawler.py)

```bash
$python bigdata_crawler.py
```

Đẩy dữ liệu lên `hdfs`

```bash
$docker cp ./data namenode:/data
```

Vào cli của namenode

```bash
$docker exec namenode bash
```

Tạo thư mục hdfs và lưu data

```bash
$hdfs dfs -mkdir /data
$hdfs dfs -put /data /data 
```
