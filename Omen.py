from math import sqrt

try:
    n = int(input("Enter an integer:"))
    if n <= 1:
        print("False")
    else:
        prime_flag = 0
        for i in range(2, int(sqrt(n)) + 1):
            if n % i == 0:
                prime_flag = 1
                break
        if prime_flag == 0:
            print("True")
        else:
            print("False")
except ValueError:
    print("Invalid input: Please enter an integer.")