"""Find First Repeating Element
Problem Statement: Find the first repeating element in the array.
Input: [1, 2, 3, 2, 1]
Expected Result: 1"""


arr=[1, 2, 3, 2, 1]

hm={}
for i,r in enumerate(arr):
    hm[r]=hm.get(r,0)+1
    print(f"{i}:{r}")
ans=""
for k ,v in hm.items():
    if v==2:
        ans=k
        break
print(ans)  