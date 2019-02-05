a=int(input())
K=0
for i in range(2,a//2+1):
	if(a%i==0):
		K=K+1
		
if(K<=0):
	print(a "is prime number")
else:
	print("Not a prime number") 
