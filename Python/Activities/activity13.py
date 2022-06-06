"""Write a function sum() such that it can accept a list of elements and print the sum of all elements"""
# function to calculate sum
def calculateSum(numbers):
    sum=0
    for number in numbers :
       sum += number 
       return sum
   
# Call calculatesum function
numlist = [1, 4, 6, 9]
result = calculateSum(numlist)
print("sum of the numbers")
print(result)