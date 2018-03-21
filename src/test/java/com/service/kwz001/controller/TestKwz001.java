package com.service.kwz001.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestKwz001 {

        Kwz001Delegate kwz001Delegate = new Kwz001Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = kwz001Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}