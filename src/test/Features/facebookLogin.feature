Feature: Login success into facebook
  Scenario Outline: To verify facebook login using email id and password
    Given I am chrome user
    When I access <websiteName> website
    Then I see "<websiteTitle>" websiteName

    Examples:
    |websiteName|websiteTitle|
    |facebook|Facebook    |
    |Google|Google      |
    |Booking|Booking     |

