#  Apache Flink 学习笔记

- Apache Flink 是一个框架和分布式处理引擎，用于对无界（*unbounded*）和有界（*bounded*）数据流进行状态计算。
- Flink 设计为在所有常见的集群环境中运行，以内存速度和任何规模执行计算。



##  Process Unbounded and Bounded Data

1. **Unbounded streams** have a start but no defined end. 
2. **Bounded streams** have a defined start and end. 

如图所示：

![bounded](https://github.com/JiaoXR/Framework/blob/master/pics/flink/bounded-unbounded.png)



###  Streaming

###  Batch



## Levels of Abstraction

![](https://github.com/JiaoXR/Framework/blob/master/pics/flink/levels_of_abstraction.svg)



- [DataStream API](https://ci.apache.org/projects/flink/flink-docs-release-1.7/dev/datastream_api.html) (bounded/unbounded streams)

- [DataSet API](https://ci.apache.org/projects/flink/flink-docs-release-1.7/dev/batch/index.html) (bounded data sets)



## Programs and Dataflows

![](https://github.com/JiaoXR/Framework/blob/master/pics/flink/program_dataflow.svg)



###  Data Source

- 基于集合
- 基于文件
- 基于 Socket
- 自定义
  - 继承 *RichSourceFunction* 类



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





PS: *UserBehavior.csv* 文件可以通过下面命令下载。

```bash
$ curl https://raw.githubusercontent.com/wuchong/my-flink-project/master/src/main/resources/UserBehavior.csv > UserBehavior.csv
```



> 参考链接：
>
> 1. http://www.54tianzhisheng.cn/tags/Flink/
> 2. http://wuchong.me/


