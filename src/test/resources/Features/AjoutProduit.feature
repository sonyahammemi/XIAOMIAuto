#Author: your.email@your.domain.com
Feature: Ajouter un produit au panier

  Scenario: 
    Given utilisateurest sur la page du produit
    When utilisateur clique sur le bouton pour ajouter un produit  au panier
    Then le produit ajouter à la liste "Mi Temperature and Humidity Monitor Pro"
