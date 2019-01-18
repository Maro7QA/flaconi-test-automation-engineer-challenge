# Automated test example in Java with Cucumber and Selenium WebDriver #

This project is created to fulfill the Flaconi test automation engineer code challenge.
The test scenario covers to the following user journey:

1. user visits https://www.flaconi.de
2. user wants to buy perfume
3. user adds perfume to cart
4. verify perfume is shown on cart page


Test scenario is described in feature file "Add_perfum_to_cart" located here ./src/test/resources/com/automatedtest.


## Installation ##

You need to have [Java 8 JDK](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html) installed along with [maven](https://maven.apache.org/).

To run the tests locally with Chrome, install ChromeDriver from (http://chromedriver.chromium.org) and add its location to your system PATH.

To install all dependencies, run

```console
$ mvn clean install
```

## Running tests ##

```console
$ mvn test
```

By default, tests will run on Chrome. 

You can also select specific scenarios to execute using `-Dcucumber.options="--tags @your_tag"`.


