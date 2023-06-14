alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 

def getIds (w):
    ids = [] 

    for i in range(len(w)):
        if(w[i] in alphabet): # Apply to each letter of the word
            ids.append(alphabet.index(w[i])) 
        else: 
            ids.append(len(alphabet)) 
        
    return ids 

def getArt (ids, l, az):
    art = "" 

    for i in range(len(ids)): 
        index1 = ids[i] * l # Stores first index of each letter
        index2 = index1 + l # Stores last index of each letter

        art += az[index1:index2]
    
    return art 

l = int(input()) # The length of each letter
h = int(input()) # The height of each letter
t = input() # The word requested in ASCII art
word = t.upper()
ids = getIds(word) # Stores the id's of each letter in the alphabet

for i in range(h): 
    az = input() # The ASCII Art string
    print(getArt(ids, l, az)) 
