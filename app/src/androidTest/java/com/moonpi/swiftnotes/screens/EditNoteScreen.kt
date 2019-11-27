package com.moonpi.swiftnotes.screens

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.moonpi.swiftnotes.R
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.endsWith
import ru.tinkoff.allure.android.deviceScreenshot
import ru.tinkoff.allure.step

class EditNoteScreen {

    companion object {
        private val titleSelector = onView(allOf(withId(R.id.titleEdit), isDisplayed()))
        private val textHintSelector = onView(allOf(withId(R.id.bodyEdit), isDisplayed()))
        private val backToMainScreenButtonSelector = onView(withClassName(endsWith("AppCompatImageButton")))
        private val editScreenMenu = onView(allOf(withContentDescription("More options"), isDescendantOfA(withId(R.id.toolbarEdit))))

        fun checkTitle() {
            step("Проверка хинта заголовка") {
                titleSelector.check(matches(withHint("Title")))
                deviceScreenshot("page_display")
            }
        }

        fun checkTextHint() {
            step("Проверка хинта текста") {
                textHintSelector.check(matches(withHint("Note")))
                deviceScreenshot("page_display")
            }
        }

        fun clickBackToMainScreenButton() {
            step("Нажание кнопки Назад") {
                backToMainScreenButtonSelector.perform(click())
                deviceScreenshot("page_display")
            }
        }

        fun clickEditScreenMenu() {
            step("Нажатие на кнопку меню на экране редактирования") {
                editScreenMenu.perform(click())
                deviceScreenshot("page_display")
            }
        }
    }
}