# ui-test-sample

This is a small project based on CUBA platform. This application is designed to show features of the [masquerade](https://github.com/cuba-platform/masquerade) library for the CUBA apps automation UI tests.

The project covers the following aspects:

- Simple login test
   - Example of LoginWindow class as an abstraction of the Login Window screen
- Create a new user in the system
   - Example of UserBrowser and UserEdit classes as an abstractions of the User Browser and User Edit screens

To start application with Gradle, run the following tasks in the terminal:

```
    gradlew setupTomcat deploy createDb start
```

To start the application from Studio, click the *(Re)start* button.

In order to run tests, do the following:

- to run the simple test or the test class you need to edit standard
  test configuration for the test project in IntelliJ. To do so, click the
  *Select Run/Debug Configuration* button and select *Edit Configurations*  in the
  drop-down list. In the VM options field, add the following:

      -Dselenide.browser=chrome -Dwebdriver.chrome.driver=<your_path>/chromedriver.exe

  where `<your_path>` is the path to the chrome driver on your computer.

  After that, select the simple test or the test class you want to run, right
  click on it and select *Debug* option.

- to run all tests from the command line, use the `testUi` Gradle task:

```
    gradlew testUi -Dselenide.browser=chrome -Dwebdriver.chrome.driver=<your_path>/chromedriver.exe
```

   where `<your_path>` is the path to the chrome driver on your computer.