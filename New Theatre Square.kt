//Solution to problem https://codeforces.com/contest/1359/problem/B

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var height:Int = reader.nextInt()
		var length:Int = reader.nextInt()
		var one:Int = reader.nextInt()
		var two:Int = reader.nextInt()
		var sum:Int = 0;
		for(z in 0 until height){
			var input:String = readLine()!!
			for(y in 0 until length){
				if(one * 2 <= two){
					if(input[y] == '.'){
						sum = sum + one
					}
				}else{
					if(input[y] == '.'){
						if(y != length-1 && input[y+1] == '.'){
							sum = sum + two
						}else if(y != 0 && input[y-1] != '.'){
							sum = sum + one
						}else if(y == 0){
							sum = sum + one
						}
					}
				}

			}
			
		}
		println("$sum")
	}
}