Feature: Google Homepage Search

  Scenario: User can search with "Google Search"
    Given Im on the homepage
    When I type "appium" into the search field
    And I click the Google Search button and I go to the search results page
    Then the first result is "Appium: Mobile App Automation Made Awesome."
    When I click on the first result link "Appium: Mobile App Automation Made Awesome."
   Then I go to the "Appium: Mobile App Automation Made Awesome." page

  Scenario: User can search by using the suggestions
    Given Im on the homepage
    When I type "appiu" into the search field
    And the suggestions list is displayed
    And I click on the first result link and I go to the search results page
    Then the first result is "APPIUM Tutorial for Android & iOS Mobile Apps Testing"
    When I click on the first result link "APPIUM Tutorial for Android & iOS Mobile Apps Testing"
   Then I go to the "APPIUM Tutorial for Android & iOS Mobile Apps Testing" page