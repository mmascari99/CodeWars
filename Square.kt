//Solution to test problem: https://codeforces.com/contest/1347/problem/B

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var a:Int = reader.nextInt()
		var b:Int = reader.nextInt()
		var c:Int = reader.nextInt()
		var d:Int = reader.nextInt()
		if(a > b && a == c){
			if(b + d == a){
				println("YES")
			}else{
				println("NO")
			}
		}else if(a > b && a == d){
			if(b + c == a){
				println("YES")
			}else{
				println("NO")
			}
		}else if(b > a && b == c){
			if(a + d == b){
				println("YES")
			}else{
				println("NO")
			}
		}else if(b > a && b == d){
			if(a + c == b){
				println("YES")
			}else{
				println("NO")
			}
		}else{
			println("NO")
		}

	}
}