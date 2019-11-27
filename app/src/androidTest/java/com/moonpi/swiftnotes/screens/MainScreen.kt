package com.moonpi.swiftnotes.screens

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.moonpi.swiftnotes.R
import org.hamcrest.CoreMatchers.allOf
import ru.tinkoff.allure.android.deviceScreenshot
import ru.tinkoff.allure.step

class MainScreen {

    companion object {
        private val newNoteButtonSelector = onView(withId(R.id.newNote))
        private val mainScreenTitleSelector = onView(allOf(withText("Swiftnotes"), isDisplayed()))
        private val mainScreenMenu = onView(allOf(withContentDescription("More options"), isDescendantOfA(withId(R.id.toolbarMain))))

        fun clickNewNoteButton() {
            step("Нажатие на кнопку добавления заметки") {
                newNoteButtonSelector.perform(click())
                deviceScreenshot("page_display")
            }
        }

        fun checkMainScreenTitle() {
            step("Проверка заголовка Swiftnotes") {
                mainScreenTitleSelector.check(matches(withParent(withId(R.id.toolbarMain))))
                deviceScreenshot("page_display")
            }
        }

        fun clickMainScreenMenu() {
            step("Нажание на кнопку меню") {
                mainScreenMenu.perform(click())
                deviceScreenshot("page_display")
            }
        }

    }
}