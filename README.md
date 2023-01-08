# Java_AL_SC2

## Application Java utilisant Maven et le JDK 19. 

Elle permet de créer des **polygones réguliers**, c'est-à-dire des polygones dont tous les côtés ont la **même longueur**.

Un polygone régulier peut avoir entre _1 et 100_ côtés, et chaque côté peut avoir une longueur com prise entre _1 et 10 000_ cm. 

Par défaut, un polygone régulier est un carré de longueur 1 cm.

Le projet comprend une classe **PolygonRegular** qui permet de créer des instances de cet objet, ainsi que des méthodes pour accéder et modifier ses attributs, calculer son périmètre et vérifier si deux polygones sont égaux. Des tests unitaires sont également inclus pour valider le bon fonctionnement de ces méthodes.

### Extension du projet
Dans le package com.poo.model, nous avons créé :

Les exceptions **PileFullException** et **PileEmptyException**.
- L'interface IPile<T> qui possède les contrats suivants :
  - `public void stack(final T objet) throws PileFullException;`
  - `public T unstack() throws PileEmptyException;`
  - `public T top() throws PileEmptyException;`
  - `public int capacity();`
  - `public int size();`
  - `public boolean isEmpty();`
  - `public boolean isFull();`
  - `public String toString();`
  - `public boolean equals(final Object o);`
  - `public int hashCode();`

Nous avons également défini la constante `DEFAULT_CAPACITY = 6`.

Nous avons créé 3 implémentations différentes héritant de IPile<T> à l'aide de collections, chacune possédant un constructeur par défaut et un constructeur initialisant sa capacité.

Nous avons écrit des tests unitaires pour tester toutes les méthodes (*sauf hashCode*) de ces 3 implémentations avec une pile de polygones réguliers, une pile d'entiers et une pile de chaînes de caractères. 

Ces tests vérifient que :

Une exception `PileFullException` est lancée si on essaie d'empiler un objet alors que la capacité maximale est atteinte.

Une exception `PileEmptyException` est lancée si on essaie de dépiler la pile alors qu'elle est vide, ou si on essaie d'accéder au sommet de la pile alors qu'elle est vide.

Nous avons également créé une classe applicative `PileUsage<T>` contenant un attribut `IPile<T>` et un constructeur naturel prenant en paramètre une `IPile<T>`. Nous avons impl
menté les méthodes suivantes :

- `add`, qui permet d'ajouter tous les éléments d'une pile passée en paramètre à la pile existante (attribut de la classe). 
Elle lance une **exception** `PileFullException` si la pile est pleine.
- `remove`, qui permet de supprimer tous les éléments d'une pile passée en paramètre de la pile existante (attribut de la classe). Elle lance une exception `PileEmptyException` si la pile est vide. 
Elle renvoie une `IPile<T>` des éléments réellement supprimés de la **pile existante**.

- Nous avons écrit des tests doubles pour vérifier le bon fonctionnement de add et remove sans utiliser les implémentations de IPile<T>, mais en utilisant le framework Mockito.

## Prérequis

- JDK 19
- Maven
- IntelliJ ou autre IDE

