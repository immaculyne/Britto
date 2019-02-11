x,n=map(int,input().split())

for num in range(x,n+1):

  
   
   
   sum = 0

   
   temp = num
   while temp > 0:
       digit = temp % 10
       b=digit**3
       sum=sum+b
       temp //= 10

   if num == sum:
       print(num)

