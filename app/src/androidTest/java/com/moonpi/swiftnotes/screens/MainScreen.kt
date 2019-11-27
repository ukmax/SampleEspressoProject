package com.moonpi.swiftnotes.screens


import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.moonpi.swiftnotes.R
import org.hamcrest.CoreMatchers.allOf

class MainScreen {

    companion object {
        private val newNoteButtonSelector = onView(withId(R.id.newNote))
        private val mainScreenTitleSelector = onView(allOf(withText("Swiftnotes"), isDisplayed()))
        private val mainScreenMenu = onView(allOf(withContentDescription("More options"), isDescendantOfA(withId(R.id.toolbarMain))))

        fun clickNewNoteButton() {
            newNoteButtonSelector.perform(click())

        }

        fun checkMainScreenTitle() {
            mainScreenTitleSelector.check(matches(withParent(withId(R.id.toolbarMain))))
        }



        fun clickMainScreenMenu(){
            mainScreenMenu.perform(click())
        }



    }
}