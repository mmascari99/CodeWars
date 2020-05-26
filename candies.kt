//Solution to test problem: https://codeforces.com/contest/1347/problem/D

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var candy:Int = reader.nextInt()
		var candies = ArrayList<Int>()
		for(y in 0 until candy){
			candies.add(reader.nextInt())
		}
		var sum:Int = 0
		candies.toIntArray()
		var moves = 0
		var totalAlice:Int = 0
		var totalBob:Int = 0
		while(candies.size > 0){
			var alice:Int = 0
			var bob:Int = 0
			while(alice <= sum && candies.size > 0){
				alice = alice + candies.component1()
				candies.removeAt(0)
			}
			moves++
			totalAlice = totalAlice + alice
			sum = alice
			if(candies.size != 0){
				while(bob <= sum && candies.size > 0){
					bob = bob + candies[candies.size-1]
					candies.removeAt(candies.size-1)
				}
				totalBob = totalBob + bob
				sum = bob
				moves++
			}
			
		}
		println("$moves $totalAlice $totalBob")
	}
}