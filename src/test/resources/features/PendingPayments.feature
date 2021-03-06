#5 Pending Payments
Feature: Displays ongoing payments

  Background: Migration of the front-end codebase from Knockout.js to React
    Given Launch the browser Pending Payments

  @Migration_Smoke
  Scenario: Pending Payments page. Displays ongoing payments.
  Payment to Cavages will navigate to a Payment Approval page
    When Open Pending Payments page on your browser "https://app.plooto.com/qa-test-j1K3eVzQ/pending_payments.html"
    Then 10 ongoing payments items "displayName" should be displayed on the page

    When Click "Cavages" item in Pending Payments list
    Then Check "/payment_approval.html" page opens with "Sent Payment Details" label
    And Finish Pending Payments test