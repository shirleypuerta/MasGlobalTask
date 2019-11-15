Feature: Google Homepage Search

  Scenario: User can search with "Google Search"
    Given Im on the homepage
    When I type "The name of the wind" into the search field
    And I click the Google Search button and I go to the search results page
    Then the first result is "The Name of the Wind by Patrick Rothfuss - Goodreads"
    When I click on the first result link "The Name of the Wind by Patrick Rothfuss - Goodreads"
   Then I go to the "The Name of the Wind by Patrick Rothfuss" page

  Scenario: User can search by using the suggestions
    Given Im on the homepage
    When I type "The name of the w" into the search field
    And the suggestions list is displayed
    And I click on the first result link and I go to the search results page
    Then the first result is "The Name of the Wind by Patrick Rothfuss - Goodreads"
    When I click on the first result link "The Name of the Wind by Patrick Rothfuss - Goodreads"
   Then I go to the "The Name of the Wind by Patrick Rothfuss" page