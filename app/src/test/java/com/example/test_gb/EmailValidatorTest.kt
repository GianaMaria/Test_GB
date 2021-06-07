package com.example.test_gb

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {
    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    //практическое
    @Test
    fun emailValidator_Reverse_ReturnFalse(){
        assertFalse(EmailValidator.isValidEmail("com.list@name"))
    }

    @Test
    fun emailValidator_ReverseEmail_ReturnFalse(){
        assertFalse(EmailValidator.isValidEmail("list@name.com"))
    }

    @Test
    fun emailValidator_ALotOfDomain_ReturnFalse(){
        assertFalse(EmailValidator.isValidEmail("name@list.comcomcomcomcomcomcomcomcomcom"))
    }

    @Test
    fun emailValidator_MaxNameSize_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(
            "gjklkfwjebsd,.f,srgnepyr[skdb,dgjkrgxdf" +
                    "vildufyskhfkhcvkhvhidfidfyoidfvhxkhzvhvdxkhzvhvdha" +
                    "kla;fejgbwnebvjbdffnmslkdfhwjrbtsnm,dfsldkfhrdkjtb" +
                    "jfgjbfeklz;kebjjbgifjnfsldkfhubksldfjlejbtpzfkgjrb" +
                    "ttttrname@list.com"))
    }

    @Test
    fun emailValidator_InvalidCharStart_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("*#name@list.com"))
    }

}