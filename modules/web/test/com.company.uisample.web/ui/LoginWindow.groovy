package com.company.uisample.web.ui

import com.haulmont.masquerade.Wire
import com.haulmont.masquerade.base.Composite
import com.haulmont.masquerade.components.Button
import com.haulmont.masquerade.components.CheckBox
import com.haulmont.masquerade.components.Label
import com.haulmont.masquerade.components.LookupField
import com.haulmont.masquerade.components.PasswordField
import com.haulmont.masquerade.components.TextField

/**
 *This class is the abstraction of the Login Window screen and defines all components to be displayed
 */
class LoginWindow extends Composite<LoginWindow> {
    @Wire
    TextField loginField

    @Wire
    PasswordField passwordField

    @Wire
    CheckBox rememberMeCheckBox

    @Wire
    Button loginButton

    @Wire
    Label welcomeLabel
}