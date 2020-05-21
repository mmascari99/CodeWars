#solution to https://codeforces.com/contest/1353/problem/C
cases = int(input())
while cases > 0:
    sum = 0
    n = int(input())
    while n > 1:
        sum = sum + ((4 * n - 4) * ((n - 1) / 2))
        n = n - 2
    print(int(sum))
    cases = cases - 1
