@ABSHP
Feature: Saisir une absence hors Paie

  Scenario Outline: Successful AbsenceHP
     Given I am on the homepageHP
    When I loginHP 
    Then User Click On MenuHP
    Then User Click On DossierHP
    Then User Click On AbsenceHP 
    Then User Click On Saisir une absenceHP
    Then User Type MatriculeHP '<Matricule>'
    Then User Click On RechercherHP
    Then User Switch To bodyHP
    Then User Click On AjouterOccurenceHP
    Then User Switch To NewFrame
    Then User Type MotifHP 
    Then User Type DateDebutHP '<DateDébut>'
    Then User Type DateFinHP '<DateFin>'
    Then User Check HP
    Then User Click On SoumettreHP

    Examples: 
   | Matricule | DateDebut | DateFin  |
   | 01010101  | 22/11/18  | 24/11/18 |
