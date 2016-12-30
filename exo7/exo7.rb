#exercises on string
#by fflachet
#beweb

def palindrome(word)
	flag = false
	i = 0
	j = word.length-1

	print "#{word}\n"

	while i < word.length	 
		if word[i] == word[j]
			j-=1
			i+=1
			flag = true
		else
			flag = false
			break
		end
	end
	if flag == true
		print "ce mot est un palindrome\n"
	else
		print "ce mot n'est pas un palindrome\n"
	end
end

def countLetter(word)
	i = 0
	j = 0
	nbLetter = 0
	alpha = "azertyuiopqsdfghjklmwxcvbnAZERTYUIOPQSDFGHJKLMWXCVBN"

	while i < word.length
    	while j < alpha.length
        	if alpha[j] == word[i]
            	nbLetter+=1
            	break
        	end
        	j+=1
    	end
    	j= 0
    	i+=1
	end
	print "#{nbLetter}\n"
end

def replaceLetter(word, charA, charB)
	i = 0
	print "mot original : #{word}\n"

	while i < word.length
		if word[i] == charA[0]
			word[i] = charB[0]

		end
		i+=1
	end
	puts "Lettre a modifier : "+charA+"Nouvelle lettre : "+charB+"resulat : "+word
end

def cutWord(text)
	i = 0
	space = " " 
	print "#{text}\n"

	while i < text.length
		if text[i] == space 
			text[i] = "\n"
		end
		i+=1
	end
	print "#{text}"
end

def main()
	print "Bienvenue,"
	flag = false
	while flag == false
		print "\nVeuillez entrer une phrase ou un mot :\n"
		word = gets.chomp
		print "\nVeuillez choisir une action a effectuer\nTapez 1 pour verifier si le mot ou phrase est un palindrome\nTapez 2 pour nombres de caractere alphabetique dans le mot ou phrase\nTapez 3 pour remplacer un caractere par un autre\nTapez 4 pour decouper la phrase\nTapez 5 pour resaisir le mot ou la phrase a traiter\nTapez q pour quitter\n\n"
		mode = gets.chomp


		if mode == '1'
			palindrome(word)
		elsif mode == '2'
			countLetter(word)
		elsif mode == '3'
			print "Veuillez entrez la lettre a modifier\n"
			charA = gets
			print("Veuillez entrez la nouvelle lettre\n")
			charB = gets
			replaceLetter(word, charA, charB)
		elsif mode == '4'
			cutWord(word)
		elsif mode == '5'
			word
		elsif mode == 'q'
			exit
			abort("Merci d'avoir utilise notre application, a bientot")
		else
			print "Try again"
		end
	end
end

main()