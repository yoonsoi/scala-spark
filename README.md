# **spark+scala+sbt 개발환경**

**1. Intellij 설정** <br>
- plugins : scala, sbt 
- scala : web dwonload ->  path 설정 
- 프로젝트 생성 : SBT

**2. spark-scala 버전확인 - build.sbt** <br>
- libraryDependencies spark-core 추가<br>
- Spark 2.4 added an experimental Scala 2.12 support. 지원되는 버전을 확인한다.

**3. Hadoop 설정** <br>
- 시스템변수 HADOOP_HOME에 hadoop path를 설정한다.<br>
- PATH에 HADOOP_HOME/bin; 설정<br>
- https://github.com/karthikj1/Hadoop-2.7.1-Windows-64-binaries/releases

**4. ERROR**
 - 하둡 시스템변수 설정 에러<br>
 util.Shell: Failed to locate the winutils binary in the hadoop binary path java.io.IOException: Could not locate executable.. 

 - file중복 에러<br>Output directory file:/tmp/shakespeareWordCount already exists<br>
 conf.set("spark.hadoop.validateOutputSpecs", "false")

