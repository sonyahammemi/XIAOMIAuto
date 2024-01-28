#Author: your.email@your.domain.com
Feature: Maison connectée

  Scenario: 
    Given utilisateur accédé a la page maison connectée
    When utilisateur affectué la tri "Tri par tarif croissant"
    And utilisateur clique sur le produit "Mi Temperature and Humidity Monitor Pro"
    Then la page de produit est affichée "Mi Temperature and Humidity Monitor Pro"
