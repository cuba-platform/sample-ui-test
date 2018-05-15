package com.company.uisample.web

import com.company.uisample.web.ui.LoginWindow
import com.company.uisample.web.ui.UserBrowser
import com.company.uisample.web.ui.UserEditor
import com.haulmont.masquerade.components.AppMenu

import org.junit.Test

import static com.codeborne.selenide.Condition.visible
import static com.codeborne.selenide.Selenide.close
import static com.codeborne.selenide.Selenide.open
import static com.haulmont.masquerade.Components._$
import static com.haulmont.masquerade.Selectors.withText


class UserUiTest {


    @Test
    void createSimpleUser() {
        // open URL of an application
        open("http://localhost:8080/app")

        // login to the application
        _$(LoginWindow.class).loginButton.click()

        // open application menu item
        _$(AppMenu).openItem('administration', 'sec$User.browse')

        // run the user creation method from the UserBrowser class
        _$(UserBrowser).createUser()

        // fill required fields in the user editor screen
        _$(UserEditor).with {
            login.setValue('createdLogin')
            passw.setValue('qO4Hn6o')
            confirmPassw.setValue('qO4Hn6o')

            windowCommit.click()
        }

        // check that the newly created user appears in the table
        _$(UserBrowser).usersTable
                .getCell(withText('createdLogin'))
                .shouldBe(visible)

        // close the browser tab
        close()
    }

}
