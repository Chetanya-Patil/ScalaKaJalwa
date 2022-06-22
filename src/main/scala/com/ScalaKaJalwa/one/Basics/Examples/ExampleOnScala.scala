// Databricks notebook source
// MAGIC %fs ls /FileStore/tables/Customer.csv

// COMMAND ----------

val Data = spark.read
                .format("csv")
                .option("inferSchema",true)
                .option("header",true)
                .option("path","dbfs:/FileStore/tables/Customer.csv").load()

// COMMAND ----------

Data.createOrReplaceTempView("CustomerTable")

// COMMAND ----------

if (1 == 0)
{
  Data.printSchema()
}
else
{
  display(spark.sql("select * from CustomerTable"))
}

// COMMAND ----------


