//Solution to test problem: https://codeforces.com/contest/1347/problem/C

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var a:Int = reader.nextInt()
		var b:Int = a
		var count:Int = 0;
		while(b > 0){
			if(b % 10 != 0){
				count++
			}
			b = b / 10
		}
		println(count)
		var zero:String = ""
		do{
		b = a % 10
		if(b != 0){
			print("$b$zero ")
		}
		a = a / 10
		zero = zero + "0"
		}while(a >= 10)
		if(a != 0){
		println("$a$zero")
		}else{
		println("")
		}
	}
}