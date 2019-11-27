package com.moonpi.swiftnotes.screens

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.CoreMatchers.allOf
import ru.tinkoff.allure.android.deviceScreenshot
import ru.tinkoff.allure.step

class SaveChangesPopup {

    companion object {
        private val yesButtonSelector = onView(allOf(withText("Yes"), isClickable()))
        private val noButtonSelector = onView(allOf(withText("No"), isClickable()))

        fun checkYesButton() {
            step("Проверка кнопки Yes в диалоге сохранения") {
                yesButtonSelector.check(matches(withId(android.R.id.button1)))
                deviceScreenshot("page_display")
            }
        }

        fun checkNoButton() {
            step("Проверка кнопки No в диалоге сохранения") {
                noButtonSelector.check(matches(withId(android.R.id.button2)))
                deviceScreenshot("page_display")
            }
        }

        fun clickNoButton() {
            step("Нажатие кнопки No в диалоге сохранения") {
                noButtonSelector.perform(click())
                deviceScreenshot("page_display")
            }
        }

    }
}