num_english = int(input("Number of English subscribers: "))
english = set(map(int, input("English subscribers: ").split()))
num_french = int(input("Number of French subscribers: "))
french = set(map(int, input("French subscribers: ").split()))
print(len(english.symmetric_difference(french)))
