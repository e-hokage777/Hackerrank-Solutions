def designerPdfViewer(heights, word):
	letters = "abcdefghijklmnopqrstuvwxyz"
	letter_heights = {}

	for i in range(len(letters)):
		letter_heights[letters[i]] = heights[i]

	return max([letter_heights[letter] for letter in word])*len(word)

if __name__ == "__main__":
	heights = list(map(int, input("Character heights: ").split()))
	word = input("Word: ")
	print(designerPdfViewer(heights, word))
