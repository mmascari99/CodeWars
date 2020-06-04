//Solution to problem: https://codeforces.com/contest/1362/problem/A

#include <stdio.h>
#include <stdlib.h>

int main(){
	int cases;
	long long a, b;
	scanf("%d", &cases);
	for(int i = 0; i < cases; i++){
		scanf("%ld %ld", &a, &b);
		int sum = 0;
		if(b > a){
			if(b % a == 0){
				while(a != b){
					if(b == a * 4 || b == a * 2 || b == a * 8){
						printf("%d\n", (sum + 1));
						a = b;
					}else{
						a = a * 8;
						sum = sum + 1;
					}			
				}
			}else{
				printf("-1\n");
			}
		}else if(b < a){
			if(a % b == 0){
				while(a != b){
					if(a % 2 == 1){
						printf("-1\n");
						a = b;
					}else if(b == a / 4 || b == a / 2 || b == a / 8){
						printf("%d\n",(sum + 1));
						a = b;
					}else{
						a = a / 8;
						sum = sum + 1;
					}	
				}
			}else{
				printf("-1\n");
			}
		}else{
			printf("0\n");
		}
		
	}
}