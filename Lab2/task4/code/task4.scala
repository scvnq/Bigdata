import org.apache.spark.sql.SparkSession
import org.graphframes.GraphFrame
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.graphframes._
import org.apache.log4j.{Level, Logger}
import org.apache.spark
import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql._
import org.apache.spark.sql.functions.array
import org.apache.spark.sql.functions.struct
import org.apache.spark.graphx._
import org.apache.spark.sql.functions._
import org.graphframes._

object task4 {
  def main(args: Array[String]) {
    //System.setProperty("hadoop.home.dir", "C:\\winutils")
    val spark = SparkSession
      .builder()
      .appName("Task4")
      .config("spark.master", "local")
      .getOrCreate()

    var input= spark.read.format("csv").option("header","true").load("member-edges.csv")

    val df = input.dropDuplicates(input.columns)


    //df.show()

    //create vertices
    val vertices= df.select("member1","weight").
      withColumnRenamed("member1","id").
      withColumnRenamed("weight","weight#1")

    //Naming columns
    val edges = df.select("member1","member2", "weight")
      .withColumnRenamed("member1","src")
      .withColumnRenamed("member2","dst")

    val g=GraphFrame(vertices,edges)
    g.vertices.show()
    g.edges.show()

   // val Data = GraphFrame(vertices, edges)
    //	Vertex in-Degree
   // val in_Degree = Data.inDegrees
   // in_Degree.show(5)

    //	Vertex out-Degree
  //  val out_Degree = Data.outDegrees
   // out_Degree.show()
    //    Page Ranking Algorithm
   //g.find("(a)-[e]->(b)").show()

   val result4 = g.pageRank.resetProbability(0.15).maxIter(3).sourceId(200).run()
  result4.vertices.select("id", "pagerank").show(10)
  //  result4.edges.select("src", "dst", "weight").distinct().show(10)


  }
}