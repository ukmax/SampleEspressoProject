package com.moonpi.swiftnotes.screens

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import ru.tinkoff.allure.android.deviceScreenshot
import ru.tinkoff.allure.step

class MainScreenMenu {

    companion object {
        private val backupNotesButton = onView(withText("Backup notes"))
        private val restoreNotesButton = onView(withText("Restore notes"))
        private val rateAppButton = onView(withText("Rate app"))


        fun checkBackupNotesButton() {
            step("Проверка наличия кнопки Backup notes") {
                backupNotesButton.check(matches(isEnabled()))
                deviceScreenshot("page_display")
            }
        }

        fun checkRestoreNotesButton() {
            step("Проверка наличия кнопки Restore notes") {
                restoreNotesButton.check(matches(isEnabled()))
                deviceScreenshot("page_display")
            }
        }


        fun checkRateAppButton() {
            step("Проверка наличия кнопки Rate app") {
                rateAppButton.check(matches(isEnabled()))
                deviceScreenshot("page_display")
            }

        }
    }
}