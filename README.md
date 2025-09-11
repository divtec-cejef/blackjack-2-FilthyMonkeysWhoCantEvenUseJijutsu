# 🃏 Projet Java — Blackjack procédural

Le but est d’écrire un programme Java qui simule une partie de **Blackjack** entre un joueur et la **banque (croupier)**.

---

## 🎯 But du jeu

Obtenir une main **dont la valeur se rapproche le plus possible de 21**, **sans dépasser** (sinon c’est "bust" = perdu).

---

## 🕹️ Déroulement

- Le **jeu utilise un seul paquet** de 52 cartes.
- Les **valeurs des cartes** :
    - Cartes chiffrées (2 à 10) → valeur numérique
    - Figures (Valet, Dame, Roi) → **10**
    - As → **1 ou 11** selon ce qui avantage le joueur
- Le joueur reçoit **2 cartes**, le croupier reçoit **2 cartes** (une seule visible).

---

## 🎮 Tour du **joueur**

- Le joueur peut choisir :
    - **Hit** → tirer une nouvelle carte
    - **Stand** → rester et passer au croupier
- Si le joueur dépasse 21 → il perd immédiatement.

---

## 🤖 Tour du **croupier (automatique)**

- Le croupier **pioche automatiquement** tant que sa main est **strictement inférieure à 17**.
- Puis il **s’arrête** (> =17).

---

## ✅ Conditions de victoire

- Si le joueur fait **plus de 21** → *il perd*.
- Si le croupier fait **plus de 21** → *le joueur gagne*.
- Sinon, celui dont la main est **la plus proche de 21** gagne.
- **Égalité** → *match nul*.

--- 


## 💡 Plan d’avancement du projet *Blackjack procédural*

---

### 🟦 JALON 1 — Tirer une carte

🎯 *Objectif : utiliser le générateur aléatoire pour simuler une carte*

- Écrire une fonction permettant de tirer *une carte aléatoire* (valeur numérique simplifiée entre 2 et 11).
- Afficher cette carte à l’écran.

---

### 🟦 JALON 2 — Main de départ du joueur

🎯 *Objectif : addition de cartes + affichage*

- Tirer **2 cartes** pour le joueur.
- Afficher ses deux cartes et leur **somme**.

---

### 🟦 JALON 3 — Tour complet du joueur (Hit / Stand)

🎯 *Objectif : interaction + boucle*

- Redemander au joueur continuellement s’il souhaite **Hit** (piocher) ou **Stand**.
- Afficher *à chaque tirage* la carte obtenue et le **total actuel**.
- Arrêter automatiquement si :
    - le joueur choisit *Stand*
    - ou atteint **exactement 21** (*stand forcé*)
    - ou dépasse **21** (*bust*)

---

### 🟦 JALON 4 — Tour automatique de la banque (croupier)

🎯 *Objectif : automatisation + affichage progression*

- Tirer **2 cartes** pour la banque.
- Afficher son total de départ.
- Tant que la banque a **strictement moins que 17**, elle pioche automatiquement.
- Après chaque tirage → afficher la *nouvelle carte* et *le total actualisé*.
- Une fois ≥17 → afficher que la banque *s’arrête*.

---

### 🟦 JALON 5 — Détermination du gagnant

🎯 *Objectif : logique de décision finale*

- Si le joueur bust (>21) → il perd.
- Si la banque bust (>21) → le joueur gagne.
- Sinon → comparer les totaux et afficher *victoire / défaite / égalité*.

---

### 🟦 JALON 6 — Enchaînement de parties

🎯 *Objectif : boucle de jeu complète*

- Après la fin d’une partie, demander : **“Rejouer ? (o/n)”**
- Si oui → recommencer une partie complète depuis le début.
- Si non → afficher un message de fin.

---

## 📘 Objectifs pédagogiques du projet

- Maîtriser l’utilisation de **tableaux (ou ArrayList)** pour gérer des jeux de cartes.
- Manipuler le tirage aléatoire, les boucles et les conditions.
- Structurer un **tour de jeu procédural propre** avant la version orientée objet.
