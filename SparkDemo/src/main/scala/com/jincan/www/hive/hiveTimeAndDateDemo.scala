package com.jincan.www.hive

import com.jincan.www.util.EnvUtil

/**
	* @Author: Larkin
	* @Date: 2021/8/31 9:51
	*/
object hiveTimeAndDateDemo {
	def main(args: Array[String]): Unit = {
		val spark =EnvUtil.getSparkSession
		spark.sql(
			"""
				|select now()
			""".stripMargin).show(truncate = false)
		/*
		|current_timestamp()   |
    +----------------------+
    |2021-08-31 09:53:17.88|
    +----------------------+
		* */
		spark.sql(
			"""
				|select now(),current_date,date_add(current_date(), 1),date_sub(current_date(), 5),from_utc_timestamp(current_date(), 'Asia/Seoul')
			""".stripMargin).show(truncate = false)
	}
}
