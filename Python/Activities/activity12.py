"""Write a recursive function to calculate the sum of numbers from 0 to 10"""

# function to calculate sum
def calculateSum(num):
  if num:
    print(num)  
    return num + calculateSum(num-1)
  else:
    return 0

# Call calculatesum function
result = calculateSum(10)
print("sum of the numbers")
print(result)