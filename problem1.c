//Solution to https://codeforces.com/contest/1358/problem/A

#include <stdio.h>
#include <stdlib.h>

int main(){
	int cases;
	scanf("%d", &cases);
	int n;
	for(int i = 0; i < cases; i ++){
		scanf("%d", &n);
		int a[n];
		int m = 0, l = 0;
		for(int j = 0; j < n; j++){
			scanf("%d", &a[j]);
		}
		for(int j = 0; j < n; j++){
			if(a[j] <= l && a[j] != 0){
				a[j] = 0;
				l += 1;
			}
		}
		if((n * m) % 2 == 0){
			printf("%d\n",(n*m/2));
		}else{
			printf("%d\n",(((n*m)+1)/2));
		}
	}
	return 0;
}