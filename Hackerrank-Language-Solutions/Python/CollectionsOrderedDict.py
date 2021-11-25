from collections import OrderedDict
import re

number_of_items = int(input("Number of items: "))

items = OrderedDict()

for i in range(number_of_items):
	item, price = re.split(r'(?<=[A-Z])\s(?=\d)' ,input("Item and price: "))
	items[item] = items.get(item, 0) + int(price)

for item_name, total_price in items.items():
	print(item_name, total_price)



