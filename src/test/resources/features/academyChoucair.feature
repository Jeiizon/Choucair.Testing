#Jeison Soler

@stories
Feature: Academy Choucair
  As a user, i want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Andres wants to learn automation at the academy Choucair
      | strUser      | strPassword |
      | 1022391493   | Choucair2021*     |
    When he search for the course on the choucair academy platform
      | strCourse               |
      | Metodología Bancolombia |
    Then he finds the course called resources
      | strCourse               |
      | Metodología Bancolombia |