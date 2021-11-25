from collections import OrderedDict

number_of_words = int(input("Number of words: "))

words = OrderedDict()

for i in range(number_of_words):
	word = input("Word: ")
	words[word] = words.get(word,0) + 1


print("Number of distinct words:", len(words))

for count in words.values():
	print(count, end=" ")
