package com.monksoft.inventory

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher

fun clickInChild(id: Int): ViewAction {
    return object : ViewAction {
        override fun getConstraints(): Matcher<View> = ViewMatchers.withId(id)

        override fun getDescription(): String = "Child in viewHolder"

        override fun perform(uiController: UiController?, view: View) {
            (view.findViewById(id) as View).performClick()
        }

    }
}