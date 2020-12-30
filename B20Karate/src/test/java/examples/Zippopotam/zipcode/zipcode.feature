Feature: User should be able to city info by zipcode

  Background:
    * url 'https://api.zippopotam.us'
    
  Scenario: get city info using zipcode
    
    Given path 'us/22030'
    When  method get
    Then  status 200

