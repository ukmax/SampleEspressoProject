package com.moonpi.swiftnotes.test

import android.support.test.espresso.Espresso.pressBack
import android.support.test.runner.AndroidJUnit4
import com.moonpi.swiftnotes.MainActivity
import com.moonpi.swiftnotes.rule.SwiftnotesRule
import com.moonpi.swiftnotes.screens.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.tinkoff.allure.android.deviceScreenshot
import ru.tinkoff.allure.annotations.DisplayName


@RunWith(AndroidJUnit4::class)
@DisplayName("Проверка экрана создания заметки")
class SwiftnotesTests : AbstractSwiftnotesTest() {

    @get:Rule
    val rule = SwiftnotesRule(MainActivity::class.java, false)

    @Test
    @DisplayName("Проверка экрана создания заметки")
    fun checkNewNoteInfo() {
        rule.launchActivity()

        MainScreen.clickNewNoteButton()
        EditNoteScreen.checkTitle()
        EditNoteScreen.checkTextHint()
        EditNoteScreen.clickBackToMainScreenButton()
        SaveChangesPopup.checkYesButton()
        SaveChangesPopup.checkNoButton()
        SaveChangesPopup.clickNoButton()
        MainScreen.checkMainScreenTitle()

    }

    @Test
    @DisplayName("Проверка пунктов меню")
    fun checkMenuInfo() {
        rule.launchActivity()

        MainScreen.clickMainScreenMenu()
        MainScreenMenu.checkBackupNotesButton()
        MainScreenMenu.checkRestoreNotesButton()
        MainScreenMenu.checkRateAppButton()
        pressBack()
        MainScreen.clickNewNoteButton()
        EditNoteScreen.clickEditScreenMenu()
        EditNoteScreenMenu.checkNoteFontSizeButton()
        EditNoteScreenMenu.checkHideNoteBodyButton()

        deviceScreenshot("page_display")


    }
}
