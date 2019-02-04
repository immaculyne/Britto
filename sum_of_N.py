N,K=map(int,input().split())
x=list(map(int,input().split()))
if N>=K:
	if len(x)==N:
		summ=0
		for i in range (K):
			summ=summ+x[i]
		print(summ)
	else:
		print("Check for len(x)")
else:
	print("Check for N,K")
