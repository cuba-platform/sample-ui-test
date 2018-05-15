package com.company.uisample.web.ui

import com.haulmont.masquerade.Wire
import com.haulmont.masquerade.base.Composite
import com.haulmont.masquerade.components.Button
import com.haulmont.masquerade.components.PopupButton
import com.haulmont.masquerade.components.Table

class UserBrowser extends Composite<UserBrowser> {

    @Wire
    Button userTableCreateBtn

    @Wire
    Button userTableEditBtn

    @Wire
    Button userTableCopyButton

    @Wire
    Button userTableRemoveBtn

    @Wire
    PopupButton additionalActionsBtn

    @Wire
    Button userTableExcelBtn

    @Wire
    Table usersTable

    UserEditor createUser() {
        userTableCreateBtn.click()
        new UserEditor()
    }
}
