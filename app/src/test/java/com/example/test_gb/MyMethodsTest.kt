package com.example.test_gb

import org.junit.Assert.*
import org.junit.Test

class MyMethodsTest {

    @Test
    fun factorial_ReturnEquals(){
        assertEquals(MyClassMethodForTest.factorial(8), 40320)
    }

    @Test
    fun factorial_ReturnNotEquals(){
        assertNotEquals(MyClassMethodForTest.factorial(11), 3628800)
    }

    @Test
    fun myClassWithMethodLessTree_Array_Equals(){
        val list = arrayOf(1,2,3,4)
        assertArrayEquals(MyClassMethodForTest.getArray(), list)
    }

    @Test
    fun myClassWithMethodLessTree_PersonNull(){
        assertNull(MyClassMethodForTest.getCats("gjks"))
    }

    @Test
    fun myClassWithMethodLessTree_PersonNotNull(){
        assertNotNull(MyClassMethodForTest.getCats("Train"))
    }

}