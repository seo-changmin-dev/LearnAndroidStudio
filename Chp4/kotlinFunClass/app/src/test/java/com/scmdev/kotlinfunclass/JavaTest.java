package com.scmdev.kotlinfunclass;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {
    @Test
    public void test1() {
        Assert.assertEquals(4, 2+2);
    }

    @Test
    public void testGetterSetter() {

        PersonJava personJava = new PersonJava("John");
        personJava.setAge(20);

        Assert.assertEquals(20, personJava.getAge());
        Assert.assertEquals("John", personJava.getName());

        Person person = new Person("John");
        person.setAge(20);

        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals("John", person.getName());
    }

    @Test
    public void setNickname() {
        PersonJava personJava = new PersonJava("john");
        personJava.setNickname("Apple");

        Assert.assertEquals("apple",personJava.getNickname());

        Person person = new Person("john");
        person.setNickname("Apple");
        Assert.assertEquals("apple",person.getNickname());
    }
}
