package com.scmdev.kotlinfunclass

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1() {
        Assert.assertEquals(4, 2+2)
    }

    @Test
    fun testGetterSetter() {
        val person = Person("John")
        person.age = 20

        Assert.assertEquals(20, person.age)
        Assert.assertEquals("John",person.name)
    }

    @Test
    fun testSetNickname() {
        val person = Person("john")
        person.nickname = "Apple"

        Assert.assertEquals("apple", person.nickname)
    }
}