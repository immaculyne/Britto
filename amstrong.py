x=int(raw_input())
n=len(str(x))
sum=0
if (x>0):
	digit=x%10
	sum=+digit**n
	x//=10
if x==sum:
	print("amstrong")
else:
	print("Not")
