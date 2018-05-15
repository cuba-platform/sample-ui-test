package com.company.uisample.web

import com.company.uisample.web.ui.LoginWindow
import com.haulmont.masquerade.components.Untyped
import org.junit.Test

import static com.codeborne.selenide.Selenide.close
import static com.codeborne.selenide.Selenide.open
import static com.haulmont.masquerade.Components._$
import static com.haulmont.masquerade.Components.wire
import static com.haulmont.masquerade.Conditions.*

class LoginUiTest {


    @Test
    void loginTest() {
        // open URL of an application
        open("http://localhost:8080/app")

        // obtain UI object
        LoginWindow loginWindow = _$(LoginWindow.class)

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

        // get values from Component
        String caption = loginWindow.loginButton.getCaption()
        boolean enabled = loginWindow.loginButton.is(ENABLED)

        Untyped loginFormLayout = wire(Untyped.class, "loginFormLayout")
        loginFormLayout.shouldBe(VISIBLE)

        loginWindow.loginButton.click()

        close()
    }
}
