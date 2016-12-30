Algo
===========


#Présentation Exo :

**Exercice 1** :
Test de la sortie standard
o Affecter une variable message avec la valeur « hello world »
o Afficher la valeur sur la sortie standard.
**Exercice 2** : 
Tri dans un tableau par ordre descendant.
o Initialiser un tableau avec des entiers dans un ordre aléatoire
o Effectuer un tri par ordr descendant en affichant chacune des modifications jusqu’au tableau trié.
**Exercice 3** :
Comptage du nombre de caractères.
o Passer en paramètre au programme la chaine de caractère + le caractère à trouver
o Affichage sur la sortie standard : « le nombre de caractereRecherche est : nombre ».
**Exercice 4** : 
Triangle de pascal.
o Créer un triangle de pascal
o Donner en paramètre la hauteur du triangle puis
o Donner en paramètre la valeur max du triangle.
**Exercice 5** :
Travail sur les chaines.
o Passez une chaine + une valeur correspondant à l’opération à effectuer sur la chaine
 1 : Vérification palindrome
 2 : Comptage du nombre de caractères alphabet dans la chaine
 3 : remplacement d’une valeur par une autre
 4 : découpage des mots.
**Exercice 6** :
Perroquet
o Mettre le programme en attente d’une entrée (saisie utilisateur)
o Afficher ce que l’utilisateur a écrit
o Permettre à l’utilisateur de quitter le programme.
**Exercice 7** :
Travail sur les chaines :
o Reprendre l’exercice 5 avec les interactions, l’utilisateur doit :
 Pouvoir ajouter une chaine à traiter
 Choisir les opérations à effectuer (dont choisir une autre chaine)
 Paramétrer les opérations (genre fournir le caractère à remplacer)
 Quitter le programme.
**Exercice 8** :
Le triangle
o Reprendre l’exercice 4 avec un affichage « dynamique » du triangle selon les choix de l’utilisateur.
o Peut choisir de dessiner un triangle en choisissant la hauteur et le caractère à
afficher.

 
---


|   Langage     |
| ------------- |
|     php       |
|     python    |
|     ruby      |
|     java      |



#Installation :  

  * installer les dépendances via composer : right-click project -> composer -> install (dev) sous ubuntu via netbeans.
  * Mettre un nom de base de données dans app -> config -> parameters.yml -> database_name: mettez votre votre mot de passe si vous en avez mis un au préalable.
  * Créer la base de données via ligne de commande : "php bin/console doctrine:database:create".
  * création base de données via doctrine "php bin/console doctrine:schema:create".
  * création du compte admin en rajoutant /add apres web/app.php dans la barre dans l'url.
  * le compte admin par défaut est "Email: admin@admin.fr ; Mot de passe: admin"








