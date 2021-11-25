import re

string = input()

substring = input()
pattern = re.compile(substring)

spans = {}

for i in range(1,len(string)):
    match = pattern.search(string)

    if match is not None:
        spans[match.start()] = (match.end()-1)

    
    string = '#'*i + string[i:]

if len(spans) < 1:
    print((-1,-1))

for start, end in spans.items():
    print((start, end))