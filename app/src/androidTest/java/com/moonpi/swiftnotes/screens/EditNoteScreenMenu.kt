package com.moonpi.swiftnotes.screens

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.moonpi.swiftnotes.R
import org.hamcrest.CoreMatchers.allOf

class EditNoteScreenMenu {

    companion object {
        private val noteFontSizeButton = onView(withText("Note font size"))
        private val hideNoteBodyButton = onView(withText("Hide note body in list"))

        fun checkNoteFontSizeButton() {
            noteFontSizeButton.check(matches(isEnabled()))
        }

        fun checkHideNoteBodyButton() {
            hideNoteBodyButton.check(matches(isEnabled()))
        }


    }
}