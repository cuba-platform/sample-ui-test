package com.company.uisample.web.ui

import com.haulmont.cuba.gui.components.Window
import com.haulmont.masquerade.Wire
import com.haulmont.masquerade.base.Composite
import com.haulmont.masquerade.components.Button
import com.haulmont.masquerade.components.CheckBox
import com.haulmont.masquerade.components.Label
import com.haulmont.masquerade.components.LookupField
import com.haulmont.masquerade.components.PasswordField
import com.haulmont.masquerade.components.TextField

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
    LookupField localesSelect

    @Wire
    Label welcomeLabel



    }
