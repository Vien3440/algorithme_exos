#exercices on string
#by fflachet
#beweb
import sys

def palindrome(word) :
	flag = False
	i = 0
	j = len(word)-1

	print word+"\n"

	while i < len(word):
		if word[i] == word[j]:
			j-=1
			i+=1
			flag = True
		else:
			flag = False
			break
	if flag == True :
		print "ce mot est un palindrome\n"
	else:
		print "ce mot n'est pas un palindrome\n"


def countLetter(word) :
	i = 0
	nbLetter = 0

	print word

	while i < len(word) :
		if word[i].isalpha() :
			nbLetter+=1
			i+=1
		else :
			i+=1
	print "nombre de lettres alpha : " +str(nbLetter)+"\n"


def replaceLetter(word,charA,charB) :
	i = 0

	print "mot de base : "+word+"\n"

	while i < len(word):
		if word[i] == charA :
			word=word[:i]+charB+word[i+1:]
		i+=1
	print "la lettre "+charA+" est remplace par la lettre "+charB+"\nresulat : "+word+"\n"


def cutWord(text) :
	i = 0
	space = " " 
	print text

	while i < len(text):
		if text[i] == space:
			text= text[:i]+"\n"+text[i+1:]
		i+=1
	print text

def main():

	print "Bienvenue,"
	flag = False
	while(flag == False):

		word = raw_input("\nVeuillez entrer une phrase ou un mot :\n")
		print("\nVeuillez choisir une action a effectuer\n")
		mode = raw_input("Tapez 1 pour verifier si le mot ou phrase est un palindrome\nTapez 2 pour nombres de caractere alphabetique dans le mot ou phrase\nTapez 3 pour remplacer un caractere par un autre\nTapez 4 pour decouper la phrase\nTapez 5 pour resaisir le mot ou la phrase a traiter\nTapez q pour quitter\n\n")

		if(mode == '1'):
			palindrome(word)
		elif(mode == '2'):
			countLetter(word)
		elif (mode == '3'):
			charA =raw_input("Veuillez entrez la lettre a modifier\n")
			charB =raw_input("Veuillez entrez la nouvelle lettre\n")
			replaceLetter(word,charA,charB)
		elif(mode == '4'):
			cutWord(word)
		elif(mode == '5'):
			word
		elif(mode == 'q'):
			print ("Merci d'avoir utilise notre application, a bientot")
			sys.exit(0)
		else:
			print "Try again"

main()