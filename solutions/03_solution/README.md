# 💡 Exercice 3 - TU + Mocking

## 🎯 Objectifs
Dans cet exercice, vous travaillerez avec une petite application de gestion de comptes clients, _crm_. Cette application est un POC simplifié, avec un nombre limité de fonctionnalités.

Dans la classe `UserService`, deux méthodes sont déjà implémentées : la recherche et la création d'utilisateurs. Le but de cet exercice est d'explorer les tests unitaires en utilisant JUnit et Mockito pour simuler les parties non gérées dans l'application.

🔍 **Note** : Cette application n'utilise ni framework ni base de données, il vous sera donc demandé de _"mocker"_ les composants non contrôlés dans vos tests.

## 🛠️ Étapes

### 1. Implémentation des tests unitaires dans `UserServiceTest`

- Dans `UserServiceTest`, un setup est déjà présent pour écrire des tests unitaires sur différentes fonctions de `UserService`.
- Vous trouverez des squelettes de tests à compléter avec une description de ce qui est attendu.
- Utilisez ces indications et Continue pour rédiger les tests unitaires nécessaires.
- N'oubliez pas de simuler (_mock_) les appels à `userRepository`.
- Lancez les tests et assurez-vous qu'ils passent avec succès.

### 2. Ajout de la fonctionnalité `deleteUser` dans `UserService`

- Nous souhaitons ajouter une méthode `void deleteUser(Long id)` qui respecte les règles suivantes :
  - Si aucun utilisateur n'est associé à cet identifiant, aucune action n'est effectuée.
  - Si l'utilisateur existe et a le rôle Admin, l'opération doit échouer en renvoyant une exception `NotAllowedException` avec le message _"You cannot delete an admin user"_.
  - La méthode `deleteUser(id)` dans `UserRepository` ainsi que l'exception existent déjà.
  - Une fois cette méthode implémentée, rédigez les tests unitaires pour couvrir ces cas dans `UserServiceTest`.


## ✅ Solution
Vous trouverez dans les classes `UserServiceTest` et `UserService` les différents tests unitaires et fonctions attendus.

### 🚀 Comment exécuter les tests
Lancez Maven dans le terminal pour exécuter les tests :

```bash
mvn clean test
```
