dividend = int(input("Dividend => "))
divisor = int(input("Divisor => "))
div_mod = divmod(dividend, divisor)
print(*div_mod, div_mod, sep="\n")