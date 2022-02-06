Feature: Displays all the details about payment

  Background: To Launch the browser
    Given Launch the browser Payment Approval

  @Smoke
  Scenario: Payment Approval page. Displays all the details about payment, its approval process and audit trail
    When Open Payment Approval page on your browser "https://app.plooto.com/qa-test-j1K3eVzQ/payment_approval.html"
    Then "Sent Payment Details" span section is displayed
    Then div sections are displayed
      | Payment Attachments | Payment Approval History | Audit Trail | Payment Line Items | Additional Details | Recent Transactions |

    Then "Cavages" is displayed in Contact field

    Then values are displayed
      | payment.amount | payment.sourceCurrency | payment.exchangeRate | payment.date | payment.displayStatus |

    Then values are displayed
      | PaymentInitiatedBy | estimatedDate | approval.DisplayName | ApprovalStatus | auditLog.description |

    Then values are displayed
      | paymentLineItem.amount | payment.createdDate | payment.payeeAccount | payment.source |

    Then href buttons are displayed
      | Export to PDF | Edit Payment | Delete Payment |

    Then buttons are displayed
      | RejectPayment | ApprovePayment |

    And Finish Payment Approval test