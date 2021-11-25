import re

pattern = re.compile(r'(#[0-9a-f]{3}|#[0-9a-f]{6})[;,)]', re.IGNORECASE)

num_code_lines = int(input("Number of code lines: "))

for i in range(num_code_lines):
	found = pattern.findall(input("Enter line of code: "))

	if len(found) > 0:
		for match in found:
			print(match)
