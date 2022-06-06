numbers = list(input("Enter the list of numbers:").split(","))
print("Given list of numbers are  ", numbers)
firstnum = numbers[0]
lastnum = numbers[-1]
if (firstnum == lastnum):
    print(True)
else :    
    print (False)