
@Bulletin
Feature: Visualiser Bulletin de paie

Scenario: VisualiserBulletin
Scenario Outline: VisualiserBulletin 
    Given I am on the homepageB
    When I loginB 
    Then User Click On MenuB
    Then User Click On PaieB
    Then User Click On VoirTousLesResultatB 
    Then User Click On BulletinB
    Then User Type MatriculeB '<Matricule>'
    Then User Click On RechercherB
    Then User Switch To BBulletin
    Then User Recupere NetAPayerB 
    

  Examples: 
   | Matricule | 
   | 00000108  | 
