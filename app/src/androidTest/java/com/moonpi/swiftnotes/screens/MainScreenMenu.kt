package com.moonpi.swiftnotes.screens


import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.moonpi.swiftnotes.R
import org.hamcrest.CoreMatchers.allOf

class MainScreenMenu {

    companion object {
        private val backupNotesButton = onView(withText("Backup notes"))
        private val restoreNotesButton = onView(withText("Restore notes"))
        private val rateAppButton = onView(withText("Rate app"))


        fun checkBackupNotesButton() {
            backupNotesButton.check(matches(isEnabled()))
        }

        fun checkRestoreNotesButton() {
            restoreNotesButton.check(matches(isEnabled()))
        }


        fun checkRateAppButton() {
            rateAppButton.check(matches(isEnabled()))
        }


    }
}