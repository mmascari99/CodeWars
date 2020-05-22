//Solution to test problem: https://codeforces.com/contest/1347/problem/A

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var a:Int = reader.nextInt()
		var b:Int = reader.nextInt()
		var c:Int = a + b
		println(c)
	}
}