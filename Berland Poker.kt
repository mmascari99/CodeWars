

import java.util.Scanner

fun main(args: Array<String>){
	val reader = Scanner(System.`in`)
	val cases:Int = reader.nextInt()
	for(x in 0 until cases){
		var cards:Int = reader.nextInt()
		var jokers:Int = reader.nextInt()
		var players:Int = reader.nextInt()
		if(cards/players >= jokers){
			println("$jokers")
		}else{
			var temp = players;
			temp--;
			jokers = jokers - (cards/players)
			var y = 0;
			var x = players - 1
			while(jokers >= x){
				temp--;
				jokers = jokers - x
				y++;
			}
			if(jokers > 0){
				println("${(cards/players) - (y+1)}")
			}else{
				println("${(cards/players) - y}")
			}
			
		}

	}
}