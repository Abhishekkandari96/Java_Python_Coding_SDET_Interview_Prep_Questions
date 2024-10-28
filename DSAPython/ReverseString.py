import string

"""Reverse a String
Problem Statement: Reverse the given string.
Input: "hello"
Expected Result: "olleh" """

str="hello"
strlist=list(str)
i=0
j=len(strlist)-1
while i<j:
    strlist[i],strlist[j]=strlist[j],strlist[i]
    i=i+1
    j=j-1
print("".join(strlist))







arr=[1,2,3,5,7,10]

i=1
j=0
while i<len(arr):
    diff=arr[i]-arr[j]
    if diff>1:
        for k in range(1,diff):
            print(arr[j]+k)
    i+=1
    j+=1


    
    






    



    




    




