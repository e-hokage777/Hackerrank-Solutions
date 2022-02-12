def pangrams(s):
    # Write your code here
    if(len(set(s.replace(" ","").lower())) == 26):
        return "pangram"
    else:
        return "not pangram"