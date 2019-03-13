import org.apache.spark.{SparkConf, SparkContext}

//싱글톤 객체(object)가 def main 함수를 구현
//싱글톤 객체(object)가 App 트레잇을 상속 (내부적으로 main() 함수를 구현하기 때문에 동일한 방식)
object count extends App {


    var logFile = "README.md"

    var conf = new SparkConf().setAppName("count Application").setMaster("local")

    var sc = new SparkContext(conf)

    var logData = sc.textFile(logFile, 2).cache()

    var lineCount = logData.count()

    println(lineCount)

    sc.stop()
}
