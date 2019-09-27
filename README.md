# springboot-rabbitMQ

#### 项目介绍
springboot集成elk实现日志监测功能

#### 软件架构
软件架构说明


#### 安装教程

1. xxxx
2. xxxx
3. xxxx

#### 使用说明


配置：

1: 配置logstash ，配置logstash的conf文件，注意其中的Input,Output项；
	
2：配置es,  配置es的elasticsearch.yml文件，注意其中的network.host，http.port项；


3：配置kibana,  配置kibana的  kibana.yml文件，注意其中的server.host，server.port，elasticsearch.url项；


启动：

1：进入es 的bin目录，启动 es;

2: 进入logstash的bin目录，启动logstash;  进入conf文件位置，输入命令：logstash -f logstash.conf

3:进入kinaba的bin目录，启动kinaba;

#############elk引入kafka时使用########################
4：启动zookeeper

5：启动kafka,kafka-server-start.bat  ../../config/server.properties

		设置kafka队列，kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic elk-kafka
		
6：进入logstash的bin目录，启动logstash;  进入conf文件位置，输入命令：logstash -f logstash-kafka.conf

#############elk引入kafka时使用########################

配置java项目：

1：引入jar包，
	 <!--elk start-->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.2.3</version>
        </dependency>
        <dependency>
            <groupId>net.logstash.logback</groupId>
            <artifactId>logstash-logback-encoder</artifactId>
            <version>5.2</version>
        </dependency>
        <dependency>
            <groupId>com.github.danielwegener</groupId>
            <artifactId>logback-kafka-appender</artifactId>
            <version>0.1.0</version>
        </dependency>

        <!--elk end-->
        
2:配置logback.xml文件
	2-1：引入elk时，查看springboot-with-elk项目；
	
	2-2：elk引入kafka时，查看  springboot-kafka-elk项目；
