number = int(input("Enter a number: "))

less = number -1
for count in range(1,number + 1):
	number = number * less

print(number)	