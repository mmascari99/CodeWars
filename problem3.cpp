//Solution to https://codeforces.com/contest/1358/problem/C

#include <iostream>
using namespace std;

long long gauss(long long a, long long b){
	return b * (b + 1) / 2 - (a - 1) * a / 2;
}

int main(){
	int t = 1;
	cin >> t;
	for(;t; --t){
		long long a,b,c,d;
		cin >> a >> c >> b >> d;
		if(a == b || c == d){
			cout << 1 << endl;
		}else{
			long long sum1 = (d - c + 1) * a + gauss(a+1,b);
			long long sum2 = gauss(a, b) + (d - c) * b;
			
			cout << abs(sum1 - sum2) + 1 << endl;
		}
	}
	return 0;
}