package com.moonpi.swiftnotes.test

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.Espresso.pressBack
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.AppCompatImageButton
import com.moonpi.swiftnotes.MainActivity
import com.moonpi.swiftnotes.R
import com.moonpi.swiftnotes.rule.SwiftnotesRule
import org.hamcrest.CoreMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.tinkoff.allure.android.deviceScreenshot
import ru.tinkoff.allure.annotations.DisplayName
import ru.tinkoff.allure.step


@RunWith(AndroidJUnit4::class)
@DisplayName("Проверка экрана создания заметки")
class SwiftnotesTests : AbstractSwiftnotesTest() {

    @get:Rule
    val rule = SwiftnotesRule(MainActivity::class.java, false)

    @Test
    @DisplayName("Проверка экрана создания заметки")
    fun checkNewNoteInfo() {
        rule.launchActivity()
        step("Проверяем отображение страницы создания заметки") {
            onView(withId(R.id.newNote)).perform(click())
            onView(allOf(withId(R.id.titleEdit), isDisplayed())).check(matches(withHint("Title")))
            onView(allOf(withId(R.id.bodyEdit), isDisplayed())).check(matches(withHint("Note")))
            deviceScreenshot("page_display")
        }
        step("Проверяем окно Save changes") {
            pressBack()
            pressBack()
//            onView(withClassName(instanceOf(android.widget.ImageButton())))
            onView(allOf(withText("Yes"), isClickable()))
            onView(allOf(withText("No"), isClickable()))
            onView(withText("No")).perform(click())
            deviceScreenshot("page_display")
        }
        step("Проверяем отображение главной страницы") {
            onView(allOf(withText("Swiftnotes"), isDisplayed()))
            deviceScreenshot("page_display")
        }

    }
}
