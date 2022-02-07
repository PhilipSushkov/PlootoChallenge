#1 Login
Feature: Login in to Plooto portal

  Background: Migration of the front-end codebase from Knockout.js to React
    Given Launch the browser Login

  @Migration_Smoke
  Scenario: Login page. Allows user to authenticate.
  "Sign In" button will navigate user to Company Selection screen
    When Open Login page on your browser "https://app.plooto.com/qa-test-j1K3eVzQ/login.html"
    Then Enter email "testuser@plooto.com" in the email text box
    Then Enter password "Asdfgh@1234" in the password text box
    Then Click "Sign In" button
    And Company Selection page "/company_select.html" should open.