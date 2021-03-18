@stories
  Feature: Academy Choucair
    AS USWE
  Scenario: Search for automation course
    Given  than brandons wants to learns automation at the academy choucair
    | strUser    |  strPassword          |
    | 1006206400 |  Choucair2021*        |
    When he search for the course on the choucair academy plataform
    | strCourse          |
    | Foundation Express |
    Then he finds the course called resources
    | strCourse          |
    | Foundation Express |