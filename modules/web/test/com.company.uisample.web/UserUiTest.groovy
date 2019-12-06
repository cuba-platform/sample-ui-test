package com.company.uisample.web

import com.company.uisample.web.ui.LoginWindow
import com.company.uisample.web.ui.UserBrowser
import com.company.uisample.web.ui.UserEditor
import com.haulmont.masquerade.components.AppMenu

import org.junit.Test

import static com.codeborne.selenide.Condition.visible
import static com.codeborne.selenide.Selenide.close
import static com.codeborne.selenide.Selenide.open
import static com.haulmont.masquerade.Selectors.$c
import static com.haulmont.masquerade.Selectors.withText

class UserUiTest {

    @Test
    void createSimpleUser() {
        // open URL of an application
        open("http://localhost:8080/app")

        // login to the application
        $c(LoginWindow.class).loginButton.click()

        // open application menu item
        $c(AppMenu).openItem('administration', 'sec$User.browse')

        // run the user creation method from the UserBrowser class
        $c(UserBrowser).createUser()

        // fill required fields in the user editor screen
        $c(UserEditor).with {
            login.setValue('createdLogin')
            passw.setValue('qO4Hn6o')
            confirmPassw.setValue('qO4Hn6o')

            windowCommit.click()
        }

        // check that the newly created user appears in the table
        $c(UserBrowser).usersTable
                .getCell(withText('createdLogin'))
                .shouldBe(visible)

        // close the browser tab
        close()
    }
}