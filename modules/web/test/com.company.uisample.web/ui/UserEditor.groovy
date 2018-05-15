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
    TextField firstName

    @Wire
    TextField middleName

    @Wire
    TextField lastName

    @Wire
    TextField name

    @Wire
    TextField email

    @Wire
    PickerField group

    @Wire
    TextField position

    @Wire
    LookupField language

    @Wire
    LookupField timeZone

    @Wire
    TextField permittedIpMask

    @Wire
    CheckBox active

    @Wire
    Table substTable

    @Wire
    Button substTableAddBtn

    @Wire
    Button substTableEditBtn

    @Wire
    Button substTableRemoveBtn

    @Wire
    Button windowCommit

    @Wire
    Button windowClose

    @Wire
    Button rolesTableAddBtn

    @Wire
    Table rolesTable
}
