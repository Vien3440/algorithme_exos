Algo
===========


#Présentation Projet :

**Exercice 1** : blog sur la photographie avec deux sections : une partie Photo et autre Événement 

**Exercice 2** : dédiée à l'exposition de photo pris par L'admin de PhotoGraff . 

**Exercice 3** : dédiée à l'actualité sur la photo : Rassemblement, Conférence ...

**Exercice 4** : dédiée à l'actualité sur la photo : Rassemblement, Conférence ...

**Exercice 5**

**Exercice 6**

**Exercice 7**

**Exercice 8**
##Navigation :

**Visiteur '' non connecté''**
Il peut juste naviguer sur les deux sections 

**Visiteur '' non connecté''**
Il peut juste naviguer sur les deux sections  

**Admin '' connecté''**
Il a les mêmes droits que les visiteurs avec un espace lui permettant d'ajouter et d'administrer
les postes dans les deux sections (Supprimer/Modifier/Publier/Mettre en brouillon) et avec la possibilité d'éditer
ses informations personnelles.

Nous sommes partis sur une architecture MVC en symfony 3 donc nous utilisons qu'un seul Bundle
**AppBundle** . Nous avons donc trois controllers :

1. Site Controller contient les méthodes qui permettent de renvoyer des vues et avec quelques requêtes pour
l’affichage des vues du visiteur.
2. Admin Controller contient les méthodes qui concernent les vues de l'admin : l’ajout, la suppression et là
mise en brouillon.
3. Login Controller contient les méthodes pour ce qui concerne la sécurité : Vérification , et fabrication
d'un admin.

**Security**
L' authentification se fait grâce à un formulaire qui vient s'appuyer sur une base de données qui contient les
informations du compte.  
 
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








