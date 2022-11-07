package com.example.codingpractice.fragments

import com.example.codingpractice.unitTesting.UnitTestingObject
import org.junit.After
import org.junit.Before
import org.junit.Test

class UnitTestingFragmentTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun username_is_empty() {
        val username = ""
        assert(
            UnitTestingObject.validate(username, "dflja@3", 20)
                    == "please enter username"
        )
    }

    @Test
    fun username_length_less_than_6() {
        val username = "djlfa"
        assert(
            UnitTestingObject.validate(username, "dflja@3", 20)
                    == "very short username"
        )
    }

    @Test
    fun username_length_very_long() {
        val username = "fdlksakjfklafjkjfklkaljfklajfkajfkjasldkjfajlksfjlakjfakl"
        assert(
            UnitTestingObject.validate(username, "dflja@3", 20)
                    == "long username"
        )
    }

    @Test
    fun password_is_empty() {
        val password = ""
        assert(
            UnitTestingObject.validate("dfsfsfeaf", password, 20)
                    == "please enter password"
        )
    }

    @Test
    fun password_length_less_than_8() {
        val password = "asdf"
        assert(
            UnitTestingObject.validate("dfsfsfeaf", password, 20)
                    == "please enter valid password"
        )
    }

    @Test
    fun age_is_0() {
        val age = 0
        assert(
            UnitTestingObject.validate("dfsfsfeaf", "asascdfas", age)
                    == "please enter valid age"
        )
    }

    @Test
    fun age_is_less_than_18() {
        val age = 15
        assert(
            UnitTestingObject.validate("dfsfsfeaf", "asascdfas", age)
                    == "not eligible"
        )
    }
}