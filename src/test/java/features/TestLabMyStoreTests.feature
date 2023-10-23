Feature: TestLabMyStoreTests

  Scenario: Create New Address
    Given MyStoreOpened
    And UserLoggedIn
    And Addresses page opened
    When Add new address:
      |Alias     |First name|Last name|Company  |VAT number|Address |Address complement|City      |Postal code|Country       |Phone number|
      |My Address|Karolina  |Miękus   |CodersLab|1111      |Widokowa|6                 |Masłomiąca|32-091     |United Kingdom|555666444   |

    Then Addresses created
      |Alias     |First name|Last name|Company  |VAT number|Address |Address complement|City      |Postal code|Country       |Phone number|
      |My Address|Karolina  |Miękus   |CodersLab|1111      |Widokowa|6                 |Masłomiąca|32-091     |United Kingdom|555666444   |




  Scenario: Buy product
    Given MyStoreOpened
    And UserLoggedIn
    And My Store opened
    When Click in product 'Hummingbird printed sweater'
    And Select size 'M' and quantity 5
    And Add product to cart
    And Select address
    And Select delivery option 'Pick up in-store'
    And Select Payment 'Pay by Check'
    And Click order button
    Then Screenshot created