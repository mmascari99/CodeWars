
//Solution to https://codeforces.com/contest/1353/problem/B
//Please ignore the hackathon type code. I had an easy solution and would not need it again.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	int cases;
	scanf("%d", &cases);
	int n, k;
	int lower, high, eye, jay, temp, sum;
	for(int i = 0; i < cases; i ++){
		scanf("%d %d", &n, &k);
		int a[n];
		int b[n];
		for(int j = 0; j < n; j++){
			scanf("%d", &a[j]);
		}
		for(int j = 0; j < n; j++){
			scanf("%d", &b[j]);
		}
		for(int i = 0; i < k; i++){
			lower = 201;
			high = 0;
			eye = 0;
			jay = 0;
			for(int j = 0; j < n; j++){
				if(a[j] < lower){
					lower = a[j];
					eye = j;
				}
				if(b[j] > high){
					high = b[j];
					jay = j;
				}
			}
			if(b[jay] > a[eye]){
				temp = b[jay];
				b[jay] = a[eye];
				a[eye] = temp;
			}
		}
		sum = 0;
		for(int i = 0; i < n; i++){
			sum += a[i];
		}
		printf("%d\n", sum);
	}
	return 0;
}