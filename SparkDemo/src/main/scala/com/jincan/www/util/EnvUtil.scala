package com.jincan.www.util

/**
	* @Author: Larkin
	* @Date: 2021/8/31 9:50
	*/
import org.apache.hadoop.conf.Configuration
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object EnvUtil {
	val conf = new Configuration()

	val sparkConf =new SparkConf()
	sparkConf.set("hive.metastore.uris","thrift://10.10.63.211:9083")
	val spark: SparkSession =SparkSession.builder()
		.config(sparkConf)
		.master("local[*]")
		.getOrCreate()
	spark.sparkContext.setLogLevel("WARN")
	def getSparkSession:SparkSession={
		spark
	}
}
