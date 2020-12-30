Feature: Practice Assertion karate way

  Scenario: Simple assertion for number

  Given  def num1 = 10
  And    def num2 = 20
  When  assert num1+num2 == 30
    
  * print 'Hello World!' , num1
  * print 'Hello World!' + num2
  * print 'Hello World!'


  Scenario: Working with Simple Json
    * def myJson = { name: 'Tucky', nums: [11, 22, 33] }
    
    * print 'Whole Json is ', myJson

    * print 'The name is ', myJson.name

    * print 'The Second Number is ' , myJson.nums[1]

    * assert  myJson.name == 'Tucky'
    * assert  myJson.nums[2] == 33
    * match  myJson.nums[2] == 33