alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" # A string that contains all the letters of the alphabet in english

def getIds (w):
    ids = [] # An array for the id's 

    for i in range(len(w)): # Loop for the length of the word
        # For each letter in the word
        if(w[i] in alphabet): # If that letter is in the alphabet 
            ids.append(alphabet.index(w[i])) # Get the id of that letter in the alphabet
        else: # If the letter is not part of the alphabet
            ids.append(len(alphabet)) # Get the length id of the alphabet
        
    return ids # Return the list of id's

def getArt (ids, l, az):
    art = "" # String that will have the ASCII art of the letters of the word

    for i in range(len(ids)): # Loop over the list of id's
        index1 = ids[i] * l # Will store the first index of each letter
        index2 = index1 + l # Will store the last indes of each letter

        art += az[index1:index2] # Add the string of the letter in question
    
    return art # Return the ASCII art of this height of the word

l = int(input()) # The length of each letter
h = int(input()) # The height of each letter
t = input() # The word to print in ASCII art
word = t.upper() # The word in uppercase
ids = getIds(word) # Get the id's of each letter in the alphabet's order

for i in range(h): # Loop for the height of the letters
    az = input() # Input of the string of each height of all the letter's ASCII art in alphabetical order
    print(getArt(ids, l, az)) # Get the art of this height of the letter's of the word in order
