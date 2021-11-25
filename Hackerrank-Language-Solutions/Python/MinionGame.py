import re

def minion_game(string):
    # your code goes here
    Stuart = 0
    Kevin = 0
    counter = 0
    string_len = len(string)

    s = string

    for i in s:
        if re.match(r'[^AEIOU]',i):
            Stuart+=(string_len - counter)
        else:
            Kevin+=(string_len - counter)

        counter+=1
    
    if Stuart > Kevin:
        print('Stuart',Stuart)
    elif Kevin > Stuart:
        print('Kevin',Kevin)
    else:
        print('Draw')

minion_game('BANANA')