object currying extends App{

    def filter(xs: List[Int], p: Int => Boolean): List[Int] =
      if (xs.isEmpty) xs
      else if (p(xs.head)) xs.head :: filter(xs.tail, p)
      else filter(xs.tail, p)

    def modN(n: Int)(x: Int) = ((x % n) == 0)

    val nums = List(1, 2, 3, 4, 5, 6, 7, 8)

  //modN(2) 호출시 -> 새로 만들어진 함수가 p: Int=>Boolean 의 자리에 들어간다.
  //새로운 함수 : def modN(x: Int) = ((x%2)==0)
    println(filter(nums, modN(2)))
    println(filter(nums, modN(3)))

  }
