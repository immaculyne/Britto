N=int(raw_input())
k=0
for i in range(2,a//2+1):
	if(N%i==0):
		k=k+1
if(k<=0):
	print("yes")
else:
	print("no")
	
