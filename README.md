# ahlamchakraneFiguresExercice
Le choix des Design Pattern :
1- le pattern stratégie :
        Puisque nous voudrons que la méthode « traiter » puisse traiter le contenu du dessin en utilisant une
        famille d’algorithmes qui sont interchangeables dynamiquement, et puisque chaque algorithme peut évoluer indépendamment de la classe
        qui les utilise.
2- le pattern observer :
        Vu que nous voudrons qu’à chaque fois que l’état de l'objet paramètré change, 
        toutes les figures doivent être notifiées pour se mettre à jour.
3- le pattern Composite :
        Car nous voudrons Donner la possibilité de Créer un groupe de figures et dans Chaque groupe 
        on peut trouver d’autres groupes.
Le diagramme de classe :
        ![![screen](/Users/Ahlam/IdeaProjects/AhlamChakrane/CompteRendu/DiagrammeClasse.JPG)]
Le Test de l'application:
![![screen](/Users/Ahlam/IdeaProjects/AhlamChakrane/CompteRendu/Test1.JPG)]
![![screen](/Users/Ahlam/IdeaProjects/AhlamChakrane/CompteRendu/Test2.JPG)]
![![screen](/Users/Ahlam/IdeaProjects/AhlamChakrane/CompteRendu/Test3.JPG)]
