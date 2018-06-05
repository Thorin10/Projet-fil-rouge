## Projet Fil-Rouge



### Missions

L'entreprise OLCorp est un acteur français majeur dans la fourniture de services informatiques sur mesure.

Vous avez réussi à décrocher votre stage dans cette entreprise et êtes missioné pour créer  **une application mobile permettant de réaliser les tâches d'administration courantes d'un Active Directory**.

### Enjeux & objectifs

-   Mettre en application les connaissances de différentes matières
-   Étudier un cahier des charges pour en faire ressortir un produit fini
-   Respecter des contraintes fonctionnelles, techniques et temporelles

B2A - Choix de groupeGroup choice](https://moodle.ynov.com/mod/choicegroup/view.php?id=979)
    
Les groupes sont composés de 3 à 4 membres. Un des membres sera le chef de projet.
    
    Les inscriptions seront closes le vendredi 15 décembre 2017.

### Règles du jeu

Vous choisissez librement les fonctions à intégrer au système. Toutefois, celles présentées ci-après sont obligatoires :

-   Lister et administrer les utilisateurs, les groupes et les unités organisationnelles
-   Visualiser le compte d'un utilisateur qui procède à une authentification par badge sur un dispositif IOT
-   Activer ou désactiver le compte d'un utilisateur dont le badge s'authentifie sur un dispositif IOT

Le travail devra s’effectuer par  **groupes de 3 à 4 étudiants**. Les groupes définis en début de projet resteront inchangés jusqu’au rendu final.

Le projet sera divisé en quatre phases, détaillées plus bas :

-   [Phase 1 - Déploiement de l'architecture système](https://moodle.ynov.com/course/view.php?id=2549#section-3)
-   [Phase 2 - Développement d'un service Web pour procéder à l'administration basique Active Directory](https://moodle.ynov.com/course/view.php?id=2549#section-4)
-   [Phase 3 - Développement d'une application mobile pour procéder à l'administration basique Active Directory](https://moodle.ynov.com/course/view.php?id=2549#section-5)
-   [Phase 4 - Mettre en place une interaction avec un module IOT](https://moodle.ynov.com/course/view.php?id=2549#section-6)


### Livrables

L’intégralité des développements et des documentations seront à centraliser dans un projet Git, de manière régulière. Chaque étudiant du groupe devra participer à la mise en ligne des ressources (chaque action est nominative et horodatée).  
Avant le début du projet, vous devrez :

-   [Créer un compte sur Github](https://github.com/)
-   [Activer l'offre « Student Pack »](https://education.github.com/)
-   [Accès GitHubAssignment](https://moodle.ynov.com/mod/assign/view.php?id=1313)
-   Fournir l'adresse du dépôt GitHub correspondant à votre projet pour le vendredi 22 décembre.
-   À la fin de chaque phase, un livrable sera attendu.

### Phase 1 : livraison de l’infrastructure

![](https://moodle.ynov.com/pluginfile.php/29255/course/section/3232/Phases1.PNG)

#### Objectifs

-   Maîtriser un environnement Windows Server (DHCP / DNS)
-   Construire et organiser un annuaire Active Directory  
    
-   Mesurer les impacts de la disponibilité du service Active Directory au sein d’une entreprise

#### Travail à faire et livrables

-   Installer et configurer un environnement Windows Server 2016 (avec RODC)
-   Déterminer une configuration réseau et une convention de nommage des serveurs optimisées

Vous procèderez à l'installation de deux serveurs Active Directory sous Windows Server 2016, l’un principal et l’autre répliqua RODC. Le serveur principal sera localisé sur le site principal, tandis que le serveur répliqua sera localisé sur un site déporté. Les rôles DHCP et DNS devront être installés et configurés.

Vous rédigerez une documentation contenant toutes les informations pertinentes décrivant l'infrastructure choisie, et notamment les noms des serveurs, leurs identifiants et mots de passe, le plan d'adressage, la convention de nommage, et les systèmes d'exploitation utilisés.

L'application Web décrite en phase 2 sera à réaliser en langage Java ; vous devrez mettre en place une infrastructure permettant d'héberger des applicatifs Java et réaliser une documentation complète de son processus d'installation. Les choix techniques liés à cette infrastructure d'hébergement Java sont laissés à votre libre choix.

-   Remise sur Moodle de deux documents :  
    

-   Documentation de l'infrastructure choisie  
    
-   Documentation d'installation de l'infrastructure d'hébergement Java  
    

-   Date limite de rendu : vendredi 9 février 2018

-  [Livrables Infrastructure ](https://moodle.ynov.com/mod/assign/view.php?id=1315)
    
### Phase 2 : livraison de l’API Java

![](https://moodle.ynov.com/pluginfile.php/29255/course/section/3233/Phases2.PNG)

#### Objectifs

-   Comprendre les avantages de l’utilisation d’une API (REST)
-   Sécuriser et protéger des données accessibles par le Web  
    

  

#### Travail à faire et livrables

-   Réaliser une API en JAVA pour récupérer des informations pour appliquer des modifications sur Active Directory

Vous réaliser une API, en utilisant éventuellement un framework de votre choix, afin de proposer des fonctionnalités pour la future application mobile. Cette API devra, a minima, prendre en charge les fonctionnalités suivantes :

-   Lister l'ensemble des unités organisationnelles, des groupes et des utilisateurs
-   Créer, modifier ou supprimer une unité organisationnelle
-   Créer ou modifier un groupe en choisissant son unité organisationnelle
-   Supprimer un groupe
-   Créer ou modifier un utilisateur en choisissant son groupe et son unité organisationnelle
-   Supprimer un utilisateur
-   Ajouter un utilisateur existant à un groupe
-   Enlever un utilisateur existant d'un groupe
-   Ajouter/enlever un utilisateur à un groupe  
    

**Bonus :** intégrer des fonctionnalités complémentaires.

Vous sécuriserez les accès à cette API à l'aide d'une méthode d'authentification.

Vous procèderez à l'écriture d'une documentation complète en anglais de l'API permettant son exploitation, de type [http://apidocjs.com](http://apidocjs.com/) ou similaire.

-   Remise sur Moodle d'un document :  
    

-   Documentation en anglais de l'API créée

-   Date limite de rendu : vendredi 16 mars 2018

-   [Livrables API JavaAssignment](https://moodle.ynov.com/mod/assign/view.php?id=1316)
    

### Phase 3 : livraison de l’application mobile

![](https://moodle.ynov.com/pluginfile.php/29255/course/section/3234/Phases3.PNG)

#### Objectifs

-   Comprendre la notion d’application hybride et native  
    
-   Sécuriser les échanges entre l’API et l’application par le biais d’une authentification  
    
-   Utiliser un langage mobile (Swift, Java, AngularJS, ReactJS,…)  
    
-   Piloter des applicatifs métiers à l’aide d’une application mobile  
    

  

#### Travail à faire et livrables

-   Réaliser une application mobile multiplateforme (iOS et Android) permettant la réalisation de toutes les fonctionnalités décrites précédemment

Vous expliquerez votre choix de procéder à un mode de développement hybride ou natif, et mettrez à disposition sur Git l'ensemble des sources du projet.

**Bonus :** vous procèderez à l'implémentation de tests unitaires.

-   Remise sur Moodle d'un document :  
    

-   Document d'explication du mode de développement choisi

-   Remise sur Git de l'ensemble des sources du projet
-   Date limite de rendu : vendredi 21 avril 2018

-   [Livrables Application MobileAssignment](https://moodle.ynov.com/mod/assign/view.php?id=1317)
    
### Phase 4 : Livraison d’un module IOT

![](https://moodle.ynov.com/pluginfile.php/29255/course/section/3235/Phases4.PNG)

#### Objectifs

-   Comprendre l'intérêt des technologies IOT  
    
-   Utiliser des technologies orientées IOT (nodeJS, lecteurs de badges MiFare, arduino)

  

#### Travail à faire et livrables

-   Réaliser une application console permettant de récupérer le profil LDAP d'un utilisateur associé à un badge MiFare

Vous développerez une application console permettant, lorsqu'un utilisateur passe son badge sur un lecteur MiFare, de récupérer et d'afficher les informations relatives à son compte, stockées dans Active Directory (nom d'affichage, adresse, numéro de téléphone,…). L'application devra être réalisée en nodeJS et échanger des données avec l'API de façon sécurisée.

L'application devra également permettre de désactiver ou de réactiver le compte d'un utilisateur après qu'il ait passé son badge sur un lecteur.

**Bonus :** vous procèderez au développement d'une application Web à la place d'une application console.

**Bonus :** vous réaliserez une fonctionnalité d'association d'un badge neuf à un utilisateur déjà existant, en identifiant celui-ci par le biais de ses identifiant et mot de passe de domaine.

-   Remise sur Git de l'ensemble des sources du projet
-   Date limite de rendu : vendredi 11 mai 2018

-   [Livrables module IOTAssignment](https://moodle.ynov.com/mod/assign/view.php?id=1326)
