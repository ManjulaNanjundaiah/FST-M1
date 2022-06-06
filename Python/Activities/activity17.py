"""Writing CSV Files"""
import pandas
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Password": ["password", "Charl13", "AllMight"]
}
# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)
# Write the data to a csv file
dataframe.to_csv("idpws.csv",index=False)