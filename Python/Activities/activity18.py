"""Read the CSV made in the previous program:
    Print the values only in the Usernames column
    Print the username and password of the second row
    Sort the Usernames column data in ascending order and print data
    Sort the Passwords column in descending order and print data """

import pandas
dataframe = pandas.read_csv('idpws.csv')
print(dataframe["Usernames"])
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Password"][1])
print(dataframe.sort_values('Usernames'))
print(dataframe.sort_values('Password', ascending=False))	
 