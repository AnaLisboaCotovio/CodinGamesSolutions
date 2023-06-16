alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 

with open("Test Sets/test1.txt") as file: # Paste Source path of the txt file of the input
    lines = file.readlines()
line = [x[:-1] for x in lines]

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

l = int(line[0]) # The length of each letter
h = int(line[1]) # The height of each letter
t = str(line[2]) # The word requested in ASCII art
word = t.upper()
ids = getIds(word) # Stores the id's of each letter in the alphabet

print("\n")
print("String we want to transform: ", t)
print("String transformmed:")

for i in range(h): 
    az = str(line[3+i]) # The ASCII Art string
    print(getArt(ids, l, az)) 
