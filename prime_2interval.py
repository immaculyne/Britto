x,n=map(int,input().split())
k=0
for num in range(x,n+1):
    if (num>1):
        for i in range(2,num):
            if(num%i==0):
                break
        else:
            print(num,end=" ")

