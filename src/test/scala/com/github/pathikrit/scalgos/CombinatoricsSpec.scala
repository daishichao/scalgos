package com.github.pathikrit.scalgos

import org.specs2.mutable.Specification

import Combinatorics._

class CombinatoricsSpec extends Specification {

  "combinations" should {
    "work for 0 or 1 length" in todo

    "match the bitmask version" in todo

    "work for arbitrary input" in {
      val s = Seq(1, 2, 3)
      val result = combinations(s, (i: Seq[Int]) => i mkString ("[", ",", "]"))
      result.length must be equalTo 1<<s.length
      result mkString " " must be equalTo "[] [1] [2] [3] [1,2] [1,3] [2,3] [1,2,3]"
    }
  }

  "nextPermutation" should {

    "work for 0 or 1 length" in todo

    "match the standard library version" in todo

    "work with duplicate items" in todo

    "operate in lexicographic order" in {
      var s: Option[Seq[Int]] = Some(Seq(1,2,3,4))
      do {
        val permutation = s.get
        //println(permutation mkString " ")
        s = nextPermutation(permutation)
      } while(s.isDefined)
    }
  }

  "factorial" should {
    "fail for negative numbers" in todo

    "match known sequence" in todo
  }

  "fibonacci" should {
    "fail for engative numbers" in todo

    "match known sequence" in {
      val expected: List[BigInt] = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
      ((0 to 10) map fibonacci).toList must be equalTo expected
      fibonacci(99) must be equalTo BigInt("218922995834555169026")
    }
  }

  "catalan" should {
    "fail for engative numbers" in todo

    "match known sequence" in {
      val expected: List[BigInt] = List(1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796)
      ((0 to 10) map catalan).toList must be equalTo expected
    }
  }
}