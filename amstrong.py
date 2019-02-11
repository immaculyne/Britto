N=int(raw_input())
k=N
sum=0
if (N>0):
	digit=x%10
	sum=+digit**3
	x//=10
if (k==sum):
	print("yes")
else:
	print("no")
