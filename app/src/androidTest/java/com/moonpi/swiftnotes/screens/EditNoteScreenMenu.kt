package com.moonpi.swiftnotes.screens

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import ru.tinkoff.allure.android.deviceScreenshot
import ru.tinkoff.allure.step

class EditNoteScreenMenu {

    companion object {
        private val noteFontSizeButton = onView(withText("Note font size"))
        private val hideNoteBodyButton = onView(withText("Hide note body in list"))


        fun checkNoteFontSizeButton() {
            step("Проверка наличия кнопки Note font size"){
                noteFontSizeButton.check(matches(isEnabled()))
                deviceScreenshot("page_display")
            }

        }

        fun checkHideNoteBodyButton() {
            step("Проверка наличия кнопки Hide note body in list"){
                hideNoteBodyButton.check(matches(isEnabled()))
                deviceScreenshot("page_display")
            }

        }


    }
}