#count letter
#by fflachet
#beweb



def countLetter(word,letter)

	result = 0
	i = 0
	word = ARGV[0]
	letter = ARGV[1]

	while i < word.length
		if word[i] == letter
			result+=1
		end
	i+=1
	end
	print "le nombre de #{letter} est : #{result}\n"
end

countLetter(ARGV[0], ARGV[1])