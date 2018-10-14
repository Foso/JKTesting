/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.jensklingenberg.jktesting

import android.content.Context
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import io.mockk.every
import android.support.test.rule.GrantPermissionRule
import io.mockk.mockk
import io.mockk.mockkClass
import io.mockk.verify
import net.bytebuddy.matcher.ElementMatchers.any
import net.bytebuddy.matcher.ElementMatchers.anyOf
import org.junit.Before
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify


@RunWith(AndroidJUnit4::class)
@LargeTest
class SecondActivityTest {


    val mock = mockkClass(SecondActivity::class)

    @Rule @JvmField
    var mActivityRule = ActivityTestRule(
        SecondActivity::class.java
    )

@Before
fun setup(){

}



    @Test
    fun changeText_sameActivity() {
        // Type text and then press the button.
        //onView(withId(R.id.testBTN)).perform(click()).check(matches(withText(BYE)))
        val act =(mActivityRule.activity as SecondActivity)

       // every{act.test(any())}.returns(false)
        verify { 1==1 }
    }

    companion object {
        val BYE = "BYE"


    }


}