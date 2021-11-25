import re

roman_numeral = input("Enter roman numeral: ")

print(re.match(r'^(?=.*[MCDXIL])M{0,3}(CM|D?C{0,3}|CD)?(XC|L?X{0,3}|XL)?(IX|V?I{0,3}|IV)$', roman_numeral))