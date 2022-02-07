package com.example.cicdtest

object FunctionUtils {

    private val existingUsers = arrayOf("Jay", "John")

    /**
     *  the input is not valid if...
     *  ...the username/password is empty
     *  ...the username is already taken
     *  ...the confirmed password is not the same as real password
     *  ...the password contains less than 3 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 3) {
            return false
        }
        return true
    }
//    class FunctionUtilsTest {
//
//        @Test
//        fun `Registration Input empty username returns false`() {
//            val result = FunctionUtils.validateRegistrationInput(
//                "",
//                "123",
//                "123"
//            )
//            assertThat(result).isFalse()
//        }
//
//        @Test
//        fun `Registration Input valid username and correctly repeated password returns true`() {
//            val result = FunctionUtils.validateRegistrationInput(
//                "Marry",
//                "1234",
//                "1234"
//            )
//            assertThat(result).isTrue()
//        }
//
//        @Test
//        fun `Registration Input username already exists returns false`() {
//            val result = FunctionUtils.validateRegistrationInput(
//                "John",
//                "123",
//                "123"
//            )
//            assertThat(result).isFalse()
//        }
//
//        @Test
//        fun `Registration Input incorrect confirmed password returns false`() {
//            val result = FunctionUtils.validateRegistrationInput(
//                "",
//                "123",
//                "123gg"
//            )
//            assertThat(result).isFalse()
//        }
//
//        @Test
//        fun `Registration Input empty password returns false`() {
//            val result = FunctionUtils.validateRegistrationInput(
//                "Philip",
//                "",
//                ""
//            )
//            assertThat(result).isFalse()
//        }
//
//        @Test
//        fun `Registration Input less than 3 digit password returns false`() {
//            val result = FunctionUtils.validateRegistrationInput(
//                "Philip",
//                "1asas2",
//                "1asas2"
//            )
//            assertThat(result).isFalse()
//        }
//    }
}