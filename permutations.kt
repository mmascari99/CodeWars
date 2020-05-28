//Solution to problem: https://codeforces.com/contest/1347/problem/E

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var n:Int = reader.nextInt()
		if(n < 4){
			println("-1")
		}else if(n > 7){
			if(n % 4 == 1){
				print("$n ")
				n = n - 1;	
			}else if(n % 4 == 2){
				print("$n ${n-2} ${n-4} ${n-1} ${n-3} ${n-5} ")
				n = n - 6
			}else if(n % 4 == 3){
				print("$n ${n-2} ${n-4} ${n-6} ${n-3} ${n-1} ${n-5} ")
				n = n - 7
			}
			while(n > 4){
				print("${n - 1} ${n - 3} $n ${n - 2} ")
				n = n - 4;
			}
			println("3 1 4 2")
		}else if(n <=7){
			if(n == 7){
				println("7 5 3 1 4 6 2")
			}else if(n == 6){
				println("6 4 2 5 3 1")
			}else if(n == 5){
				println("5 3 1 4 2")
			}else if(n == 4){
				println("3 1 4 2")
			}
		}

	}
}