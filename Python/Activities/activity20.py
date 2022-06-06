"""Use pandas to read data the Excel file
    Print the number of rows and columns
    Print the data in the emails column only
    Sort the data based on FirstName in ascending order and print the data
"""
import pandas	
dataframe = pandas.read_excel("EMP.xlsx", sheet_name="Sheet1")
print("The size of the data : ")	
print(dataframe.shape)
print("The email ids in the EMP table are ")
print(dataframe["Email"])
print("Data sorted in ascending order")
print(dataframe.sort_values('FirstName'))