object stringTest extends App{

  //문자열
  var str1 = "hello world"
  println(str1)

  var str2 =
    """hello
    World
    test
    """
  println(str2)

  //s접두어
  var str3 = s"접두어s $str1"
  println(str3)
  var str4 = s"2*3 = ${2*3}"
  println(str4)

  def minus(x: Int, y:Int) = x-y
  println(s"${Math.pow(2,3)}")
  println(s"${minus(2,3)}")

  // f 접두어
  // 포맷팅 처리
  val height:Double = 182.3
  val name = "James"
  println(f"$name%s is $height%2.2f meters tall")

  // raw 접두어
  val rawStr = raw"가\n나"
  println(rawStr)
}
