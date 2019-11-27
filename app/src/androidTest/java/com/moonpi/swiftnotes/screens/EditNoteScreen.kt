package com.moonpi.swiftnotes.screens

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.moonpi.swiftnotes.R
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.endsWith

class EditNoteScreen {

    companion object {
        private val titleSelector = onView(allOf(withId(R.id.titleEdit), isDisplayed()))
        private val textHintSelector = onView(allOf(withId(R.id.bodyEdit), isDisplayed()))
        private val backToMainScreenButtonSelector = onView(withClassName(endsWith("AppCompatImageButton")))
        private val editScreenMenu = onView(allOf(withContentDescription("More options"), isDescendantOfA(withId(R.id.toolbarEdit))))
        fun checkTitle() {
            titleSelector.check(matches(withHint("Title")))
        }

        fun checkTextHint() {
            textHintSelector.check(matches(withHint("Note")))
        }

        fun clickBackToMainScreenButton() {
            backToMainScreenButtonSelector.perform(click())
        }

        fun clickEditScreenMenu(){
            editScreenMenu.perform(click())
        }
    }
}