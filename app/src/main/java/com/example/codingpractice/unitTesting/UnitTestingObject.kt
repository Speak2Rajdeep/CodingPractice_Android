package com.example.codingpractice.unitTesting

object UnitTestingObject {
    fun validate(username: String, password: String, age: Int): String? {
        if (username.isEmpty()) return "please enter username"
        if (username.length < 6) return "very short username"
        if (username.length > 20) return "long username"

        if (password.isEmpty()) return "please enter password"
        if (password.length < 8) return "please enter valid password"

        if (age == 0) return "please enter valid age"
        if (age < 18) return "not eligible"

        return null
    }
}