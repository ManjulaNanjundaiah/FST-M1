"""Program to asks the user to enter their name and their age.
Print out a message to tells them the year that they will turn 100 years old."""

username = input("Enter your Name :")
age = input("Enter is your age : ")
hyear = (2022 - int(age))+100
userdetails = "your name is {} and your age is {} you will be 100yrs in the year {}."
print(userdetails.format(username, age, hyear))
