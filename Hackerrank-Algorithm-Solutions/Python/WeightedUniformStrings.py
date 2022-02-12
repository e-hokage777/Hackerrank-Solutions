from collections import defaultdict

def weightedUniformStrings(s, queries):
    letter_weights = {
                "a":1,
                "b":2,
                "c":3,
                "d":4,
                "e":5,
                "f":6,
                "g":7,
                "h":8,
                "i":9,
                "j":10,
                "k":11,
                "l":12,
                "m":13,
                "n":14,
                "o":15,
                "p":16,
                "q":17,
                "r":18,
                "s":19,
                "t":20,
                "u":21,
                "v":22,
                "w":23,
                "x":24,
                "y":25,
                "z":26
                }

    substring_weights = defaultdict(lambda: "No")
    accumulator = 0
    current_letter = "_"
    answers = []

    for letter in s:
        if letter != current_letter:
            accumulator = 0
            current_letter = letter
        
        accumulator += letter_weights[letter]

        substring_weights[accumulator] = accumulator


    for query in queries:
        answers.append(substring_weights[query] if substring_weights[query]=="No" else "Yes")

    return answers




print(weightedUniformStrings("abccddde",[1,3,12,5,9,10]))

