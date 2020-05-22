//Solution to problem https://codeforces.com/contest/1353/problem/A
#include <stdio.h>
#include <stdlib.h>

int main(){
	int cases, length, sum;
	scanf("%d", &cases);
	for(int i = 0; i < cases; i++){
		scanf("%d %d", &length, &sum);
		if(length < 3){
			if(length == 1){
				printf("0\n");
			}else{
				printf("%d\n", sum);
			}
		}else{
			printf("%d\n", (sum * 2));
		}
	}
	
	return 0;
}