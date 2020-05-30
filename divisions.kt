//Solution to https://codeforces.com/contest/1346/problem/A

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var a:Long = reader.nextLong()
		var b:Long = reader.nextLong()
		var one:Long = a % b
		if(one > 0){
			println("$one ${one * b} ${one * b * b} ${one * b * b * b}")
		}else{
			one = b
			println("$one ${one * b} ${one * b * b} ${one * b * b * b}")
		}
	}
}