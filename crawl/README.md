# Crawl dữ liệu.

Chạy file [`bigdata_get_ticker.py`](bigdata_get_ticker.py)

```
$ python bigdata_get_ticker.py
```

Chạy file [`bigdata_crawler.py`](bigdata_crawler.py)

```
$ python bigdata_crawler.py
```

Đẩy dữ liệu lên `hdfs`
```
$ docker cp ./data namenode:/data
```

Vào cli của namenode
```
$ docker exec namenode bash
```

Tạo thư mục hdfs và lưu data
```
$ hdfs dfs -mkdir /data
$ hdfs dfs -put /data /data 
```

