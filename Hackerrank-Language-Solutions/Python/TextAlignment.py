c = 'H'
#width = int(input('Width: '))
width = 5

#for top cone
for i in range(width):
	print((c*i).rjust(width-1)+c+(c*i).ljust(width-1))

#for two pillars
for i in range(width+1):
	print((c*width).center(width*2)+(c*width).center(width*6))

#for horizotal bar
for i in range(width-2):
	print((c*width*5).center(width*6))

#bottom pillars
for i in range(width+1):
	print((c*width).center(width*2)+(c*width).center(width*6))

#Bottom cone
for i in range(width):
	print(((c*(width-i-1)).rjust(width)+c+(c*(width-i-1)).ljust(width)).rjust(width*6))