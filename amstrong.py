N=int(raw_input())
n=len(str(x))
sum=0
if (N>0):
	digit=x%10
	sum=+digit**n
	x//=10
if (N==sum):
	print("amstrong")
else:
	print("Not")
