#  Apache Flink 学习笔记

- Apache Flink 是一个框架和分布式处理引擎，用于对无界（*unbounded*）和有界（*bounded*）数据流进行状态计算。
- Flink 设计为在所有常见的集群环境中运行，以内存速度和任何规模执行计算。



## Process Unbounded and Bounded Data

1. **Unbounded streams** have a start but no defined end. 
2. **Bounded streams** have a defined start and end. 





> 官网：https://flink.apache.org/
>
> GitHub：https://github.com/apache/flink



###  Data Source

- 基于集合
- 基于文件
- 基于 Socket
- 自定义



###  Data Sink

- Kafka, Elasticsearch, Socket, RabbitMQ, JDBC, Cassandra POJO、File、Print 等



###  Data transformation

- Map
- FlatMap
- Filter
- KeyBy
- Reduce
- Aggregation
- Window
- WindowAll
- Union
- WindowJoin
- Split



###  Time

- Processing Time
- Event Time
- Ingestion Time





> 参考链接：http://www.54tianzhisheng.cn/tags/Flink/



