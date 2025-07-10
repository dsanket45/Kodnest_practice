a= list(map(int ,input("Enter numbers : ").split()))
b=int(input("enter number : "))
for i ,e in enumerate(a):
    if b == e:
        print("element found at " ,i)
        break
else:
    print("not found")


    
