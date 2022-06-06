"""Given a two list of numbers 
create a new list such that new list should contain only odd numbers from the first list and 
even numbers from the second list."""

List1 = list(input("Enter the list1:").split(","))
List2 = list(input("Enter the list2:").split(","))
#print("List 1 is  ", List1)
#print("List 2 is  ", List2)
List3 = []
for num in List1 :
    if (int(num) % 2 != 0) :
        List3.append(num)

for num in List2:
        if(int(num)%2 == 0):
            List3.append(num)
print("list 3")
print (List3)