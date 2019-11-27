package com.moonpi.swiftnotes.screens

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.moonpi.swiftnotes.R
import org.hamcrest.CoreMatchers.allOf

class SaveChangesPopup {

    companion object {
        private val yesButtonSelector = onView(allOf(withText("Yes"), isClickable()))
        private val noButtonSelector = onView(allOf(withText("No"), isClickable()))

        fun checkYesButton() {
            yesButtonSelector.check(matches(withId(android.R.id.button1)))
        }

        fun checkNoButton() {
            noButtonSelector.check(matches(withId(android.R.id.button2)))
        }

        fun clickNoButton() {
            noButtonSelector.perform(click())
        }


    }
}