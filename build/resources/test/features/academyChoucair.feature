@stories
  Feature: Academy Choucair
    AS USWE
  Scenario Outline: Search for automation course
    Given  than brandons wants to learns automation at the academy choucair
    | strUser    |  strPassword          |
    | <strUser>  |  <strPassword>         |
    When he search for the course on the choucair academy plataform
    | strCourse          |
    | <strCourse> |
    Then he finds the course called resources
    | strCourse          |
    | <strCourse> |

    Examples:
    | strUser   | strPassword   | strCourse          |
    | 1006206400| Choucair2021* | Foundation Express |