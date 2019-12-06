package com.company.uisample.web

import com.company.uisample.web.ui.LoginWindow
import org.junit.Test

import static com.codeborne.selenide.Selenide.close
import static com.codeborne.selenide.Selenide.open

import static com.haulmont.masquerade.Conditions.*
import static com.haulmont.masquerade.Selectors.$c

class LoginUiTest {

    @Test
    void loginTest() {
        // open URL of an application
        open("http://localhost:8080/app")

        // obtain UI object
        LoginWindow loginWindow = $c(LoginWindow.class)

        loginWindow.loginField
                .shouldBe(EDITABLE)
                .shouldBe(ENABLED)

        // setting values
        loginWindow.with {
            loginField.setValue("admin")
            passwordField.setValue("admin")

            rememberMeCheckBox.setChecked(true)
        }

        // fluent asserts
        loginWindow.welcomeLabel
                .shouldBe(VISIBLE)

        loginWindow.loginButton
                .shouldBe(VISIBLE)
                .shouldBe(ENABLED)
                .shouldHave(caption("Submit"))

        loginWindow.loginButton.click()

        close()
    }
}