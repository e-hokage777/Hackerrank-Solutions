import math

class Complex:
	def __init__(self, real, imaginary):
		self.real = real
		self.imaginary = imaginary

	def __add__(self,no):
		return Complex(self.real+no.real,self.imaginary+no.imaginary)

	def __sub__(self,no):
		return Complex(self.real - no.real, self.imaginary - no.imaginary)

	def __mul__(self,no):
		return Complex(self.real*no.real-(self.imaginary*no.imaginary),(self.real*no.imaginary + self.imaginary*no.real))

	def __truediv__(self,no):
		real = (self.real*no.real+(self.imaginary*no.imaginary))/(no.real**2 + no.imaginary**2)
		imaginary = (-self.real*no.imaginary + self.imaginary*no.real)/(no.real**2 + no.imaginary**2)
		return Complex(real, imaginary)

	def mod(self):
		return Complex(math.sqrt(self.real**2+self.imaginary**2), 0)

	def __str__(self):
		if self.imaginary < 0:
			result = "%.2f-%.2fi" %(self.real,abs(self.imaginary))
		elif self.imaginary >= 0:
			result = "%.2f+%.2fi" %(self.real,self.imaginary)
		
		return result



if __name__ == '__main__':
	first = map(float,input("Real and Imaginary parts of first number: ").split())
	second = map(float,input("Real and Imaginary parts of second number: ").split())

	x = Complex(*first)
	y = Complex(*second)

	print(*map(str,[x+y,x-y,x*y,x/y,x.mod(),y.mod()]), sep="\n")


