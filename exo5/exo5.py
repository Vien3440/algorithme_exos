#exercices on string
#by fflachet
#beweb
import sys

def palindrome(word) :
	flag = False
	i = 0
	j = len(word)-1

	print word

	while i < len(word):
		if word[i] == word[j]:
			j-=1
			i+=1
			flag = True
		else:
			flag = False
			break
	if flag == True :
		print "ce mot est un palindrome"
	else:
		print "ce mot n'est pas un palindrome"


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
	print "nombre de lettres alpha : " +str(nbLetter)


def replaceLetter(word,charA,charB) :
	i = 0

	print word

	while i < len(word):
		if word[i] == charA :
			word=word[:i]+charB+word[i+1:]
		i+=1
	print "la lettre "+charA+" est remplace par la lettre "+charB+" resulat : "+word


def cutWord(text) :
	i = 0
	space = " " 
	print text

	while i < len(text):
		if text[i] == space:
			text= text[:i]+"\n"+text[i+1:]
		i+=1
	print text

def main(argv):

	word = argv[1]
	if (argv[2] == '1'):
		palindrome(word)
	elif (argv[2] == '2'):
		countLetter(word)
	elif (argv[2] == '3'):
		replaceLetter(word,argv[3],argv[4])
	elif (argv[2] == '4'):
		cutWord(word)
	else:
		print "Try again"

main(sys.argv)