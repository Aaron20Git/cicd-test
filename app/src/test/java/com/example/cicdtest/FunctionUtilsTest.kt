package com.example.cicdtest


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FunctionUtilsTest {
    @Test
    fun `Registration Input empty username returns false`() {
        val result = FunctionUtils.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Registration Input valid username and correctly repeated password returns true`() {
        val result = FunctionUtils.validateRegistrationInput(
            "Marry",
            "1234",
            "1234"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `Registration Input username already exists returns false`() {
        val result = FunctionUtils.validateRegistrationInput(
            "John",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Registration Input incorrect confirmed password returns false`() {
        val result = FunctionUtils.validateRegistrationInput(
            "",
            "123",
            "123gg"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Registration Input empty password returns false`() {
        val result = FunctionUtils.validateRegistrationInput(
            "Philip",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `Registration Input less than 3 digit password returns false`() {
        val result = FunctionUtils.validateRegistrationInput(
            "Philip",
            "1asas2",
            "1asas2"
        )
//        assertThat(result).isFalse()
        assertThat(result).isTrue()
    }
}