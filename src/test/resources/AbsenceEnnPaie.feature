@ty
Feature: Saisir une absence

  Scenario Outline: Successful Absence
    Given I am on the homepage
    When I login 
    Then User Click On Menu
    Then User Click On Dossier
    Then User Click On Absence
    Then User Click On Saisir une absence
    Then User Type Matricule '<Matricule>'
    Then User Click On Rechercher
    Then User Switch To body
    Then User Type Motif 
    Then User Type DateDebut '<DateDebut>'
    Then User Type DateFin '<DateFin>'
    Then User Click On Soumettre

    Examples: 
   | Matricule | DateDebut | DateFin  |
   | 01010101  | 22/11/18  | 24/11/18 |
