import cmath

complex_num = input("Enter your complex number: ")

print(abs(complex(complex_num)))
print(cmath.phase(complex(complex_num)))