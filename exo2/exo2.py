#sort descending
#by fflachet
#beweb

tab = [42,8,10,34,94,2,75,29]
tmp = 0
sorted = False

print (tab)

while sorted == False :
    i = 0
    moved = 0

    while i < len(tab)-1 :
        if tab[i] < tab[i+1] :
            tmp = tab[i+1]
            tab[i+1] = tab[i]
            tab[i] = tmp
            moved+=1
        i+=1
    print (tab)
    if moved == 1 :
        sorted = True