#2 Company Selection
Feature: Displays list of companies and their status

  Background: Migration of the front-end codebase from Knockout.js to React
    Given Launch the browser Company Selection

  @Migration_Smoke
  Scenario: Company Selection page. Displays list of companies (and their status) available to the user.
  Only "Plooto Inc" company will lead to Dashboard
    When Open Company Selection page on your browser "https://app.plooto.com/qa-test-j1K3eVzQ/company_select.html"
    Then Displays list of companies and their status available to the user more than 40 with more 2 symbols
    And Only "Plooto Inc" company will lead to Dashboard "dashboard.html"