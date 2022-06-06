"""# In the Given tuple
Print elements that are divisible by 5 """

num_tuple = input("Enter the numbers:").split(",")
# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)