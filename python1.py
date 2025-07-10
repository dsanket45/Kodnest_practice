print("python started.....")
list = [1,2,3,4,5,6]
for i,j in enumerate(list): # for loop to get index wise elements
     print(i,"->",j)
     
print("=================================================")
set = {1,2,3,4,4,4,5}
for i,j in enumerate(set): # for loop to get index wise elements
     print(i,"->",j)

print("=================================================")
tuple = ("a","b","c")
for i,j in enumerate(tuple): # for loop to get index wise elements
     print(i,"->",j)

print("=================================================")  
dict = {1:2,2:3,4:44}
for i,j in dict.items():    # for loop to get key ,value wise elements
     print(i,"->",j)

print("=================================================")  
list = [1,2,3,4,5,6,7,8,9]
for i in list:
     if i==4:
          print("hi ",i," skipping")
          continue
     else:
          print(i)
          
          
print("=================================================")  
string = "Ram is a engineer"
print(string[::-1]==string)  #cheking palindrome
print(string[::-1])  #reversing string
print(string.upper())
print(string.lower())
print(string.split(" "))
print(string)

print("=================================================")  

def add(a,b):
     return a+b
print(add(2999,400))

class calc:
     def __init__(self):
          print("sanket")
     
     @staticmethod
     def add(a,b):
          return a+b
res = calc.add(6,8)
print(res)
     

print("=================================================")  






















print("python ended.....")