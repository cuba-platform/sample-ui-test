package com.company.uisample.web.ui

import com.haulmont.masquerade.Wire
import com.haulmont.masquerade.base.Composite
import com.haulmont.masquerade.components.Button
import com.haulmont.masquerade.components.CheckBox
import com.haulmont.masquerade.components.LookupField
import com.haulmont.masquerade.components.PickerField
import com.haulmont.masquerade.components.Table
import com.haulmont.masquerade.components.TextField

/**
 *This class is the abstraction of the User Editor screen and defines all components to be displayed
 */
class UserEditor extends Composite<UserEditor> {
    @Wire
    TextField login

    @Wire
    TextField passw

    @Wire
    TextField confirmPassw

    @Wire
    Button windowCommit
}