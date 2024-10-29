# 💡 Exercice 2 - TDD

## 🎯 Objectif
Cet exercice est conçu pour vous familiariser avec l'utilisation des outils d'IA dans la pratique du développement piloté par les tests (TDD).

Pour rappel, le TDD consiste à rédiger les tests unitaires avant même d'écrire le code. Ces tests définissent le comportement attendu des fonctions. Une fois le code implémenté, les tests permettent de valider son bon fonctionnement.

Dans cet exercice, vous travaillerez avec la classe `DateTimeHelper`, qui offre des fonctions utilitaires pour le traitement des dates avec ou sans heures. Vous allez d'abord rédiger les tests pour les fonctions souhaitées, puis implémenter le code des fonctions.

## 📝 Étapes

### 1. Rédaction de fonctions à partir de tests unitaires
Pour la première partie de cet exercice, vous allez implémenter des fonctions de traitement pour `LocalDate`. Dans la classe `DateTimeHelperTest`, une série de tests unitaires définissent le comportement attendu pour trois fonctions. Utilisez ces tests comme guide pour implémenter les méthodes avec l’aide de Continue.

- **Implémentez la méthode `formatDate(LocalDate date)`** :
  - Utilisez le test `testFormatDate_ValidDate` déjà rédigé dans `DateTimeHelperTest`.
  - Cette méthode doit accepter un objet `LocalDate` et retourner un `String` au format `yyyy-MM-dd`.

- **Implémentez la méthode `parseDate(String date)`** :
  - Utilisez le test `testParseDate_ValidDate` dans `DateTimeHelperTest`.
  - Cette méthode doit accepter un `String` au format `yyyy-MM-dd` et retourner un objet `LocalDate`.

- **Implémentez la méthode `formatDate(LocalDate date, String pattern)`** :
  - Utilisez le test `testFormatDate_WithPattern` dans `DateTimeHelperTest`.
  - Cette méthode doit accepter un objet `LocalDate` et un `String` représentant le format souhaité (par ex. `yyyy-MM-dd`) et retourner un `String` correspondant.

### 2. Rédaction de tests unitaires puis des fonctions
Dans cette seconde partie, vous allez créer des tests pour les méthodes de traitement de `LocalDateTime`, puis implémenter les fonctions pour les faire réussir.

- **Pour la fonction `formatDateTime(LocalDateTime dateTime)`** :
  - Écrivez un premier test `testFormatDateTime_ValidDateTime` qui vérifie que la fonction `formatDateTime` retourne bien une chaîne de caractères au format yyyy-MM-ddThh:mm:ss pour une `LocalDateTime` donnée, par exemple : _"2024-08-31T08:46:00"_.
  - Implémentez ensuite la fonction `formatDateTime(LocalDateTime dateTime)` pour que le test réussisse.

- **Pour la fonction `parseDateTime(String dateTimeString)`** :
  - Écrivez un test `testParseDateTime_ValidDateTime` qui vérifie qu’une chaîne de caractères au format `yyyy-MM-ddThh:mm:ss` est bien convertie en un objet `LocalDateTime`, par exemple : _"2024-08-31T08:46:00"_.
  - Écrivez un test `testParseDateTime_InvalidDateTime` qui vérifie qu’une chaîne au mauvais format produit une exception `DateTimeParseException`, par exemple : _"invalid-date"_.
  - Implémentez ensuite la fonction `parseDateTime(String dateTimeString)` pour faire passer les tests.

- **Pour la fonction `formatDateTime(LocalDateTime dateTime, String pattern)`** :
  - Écrivez un test `testFormatDateTime_WithPattern` qui vérifie qu’une `LocalDateTime` donnée et un modèle de format (par ex. `dd/MM/yyyy HH:mm:ss`) produisent une chaîne formatée, par exemple _"31/08/2024 08:46:00"_.
  - Implémentez ensuite la fonction `formatDateTime(LocalDateTime dateTime, String pattern)` pour faire passer le test.

## ✅ Solution
Vous trouverez dans les classes `DateTimeHelper` et `DateTimeHelperTest` les différents fonctions et tests rédigés dans le cadre de cet exercice


### 🚀 Comment exécuter les tests
Lancez Maven dans le terminal pour exécuter les tests :

```bash
mvn clean test
```