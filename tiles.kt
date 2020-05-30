//Solution to https://codeforces.com/contest/1346/problem/B

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var n:Int = reader.nextInt()
		var k1:Int = reader.nextInt()
		var k2:Int = reader.nextInt()
		var input:String = readLine()!!
		
		var sum:Long = 0
		var flag:Int = 0
		for(i in 0 until n){
			if(input[i] == '1'){
				if(i != 0){
					if(flag == 0){
						sum = sum + k1
						flag = 1
					}else if(flag == 1){
						if(k1 + k1 > k2){
							sum = sum + (k2 - k1)
							flag = 2
						}else{
							sum = sum + k1
							flag = 1
						}
					}else if(flag == 2){
						sum = sum + k1
						flag = 1
					}
				}else if(i == 0){
					sum = sum + k1
					flag = 1
				}
			}else{
				flag = 0
			}
		}
		println(sum)
	}
}