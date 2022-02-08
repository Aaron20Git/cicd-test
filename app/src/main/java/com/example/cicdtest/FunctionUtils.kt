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
}