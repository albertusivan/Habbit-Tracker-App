package com.dicoding.habitapp.ui.list

import android.app.Activity
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.lifecycle.ActivityLifecycleMonitorRegistry
import androidx.test.runner.lifecycle.Stage
import com.dicoding.habitapp.R
import com.dicoding.habitapp.ui.add.AddHabitActivity
import junit.framework.TestCase.assertTrue
import org.junit.Rule
import org.junit.Test

//TODO 16 : Write UI test to validate when user tap Add Habit (+), the AddHabitActivity displayed
class HabitActivityTest {
    @get:Rule
    var activityRule = ActivityScenarioRule(HabitListActivity::class.java)

    @Test
    fun showAddHabit(){
        onView(withId(R.id.rv_habit)).check(matches(isDisplayed()))
        onView(withId(R.id.fab)).check(matches(isDisplayed()))
        onView(withId(R.id.fab)).perform(ViewActions.click())

        onView(withId(R.id.add_ed_title)).check(matches(isDisplayed()))
        onView(withId(R.id.add_ed_minutes_focus)).check(matches(isDisplayed()))
        onView(withId(R.id.sp_priority_level)).check(matches(isDisplayed()))
        onView(withId(R.id.add_tv_start_time)).check(matches(isDisplayed()))

        val addHabit = getAddHabitActivity()
        assertTrue(addHabit is AddHabitActivity)
    }

    private fun getAddHabitActivity(): Activity?{
        var activity: Activity? = null
        InstrumentationRegistry.getInstrumentation().runOnMainSync{
            run{
                activity = ActivityLifecycleMonitorRegistry.getInstance()
                    .getActivitiesInStage(Stage.RESUMED).elementAtOrNull(0)
            }
        }
        return activity
    }
}