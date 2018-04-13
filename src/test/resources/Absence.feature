@ty
Feature: Saisir une absence

  Scenario Outline: Successful Absence
    Given User Is On HomePage
    Then user enters '<loginid>' and '<password>'
    Then I click Button "hrportal-self-submit-center" Located By ClassName
    Then User Click On Menu
    Then User Click On Dossier
    Then User Click On Absence
    Then User Click On Saisir une absence
    Then User Type Matricule '<Matricule>'
    Then User Click On Rechercher
    Then User Switch To body
    Then User Type Motif '<Motif>'
    Then User Type DateDebut '<DateDébut>'
    Then User Type DateFin '<DateFin>'
    Then User Check HorsPaie
    Then User Click On Soumettre

    Examples: 
       | loginid | password| Matricule | Motif | DateDébut | DateFin  |
       | TYOUSFI  | HRA    | 01010101  | ABR   | 22/11/18  | 24/11/18 |
