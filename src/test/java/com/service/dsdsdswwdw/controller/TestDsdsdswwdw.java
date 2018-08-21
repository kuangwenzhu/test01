package com.service.dsdsdswwdw.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDsdsdswwdw {

        DsdsdswwdwDelegate dsdsdswwdwDelegate = new DsdsdswwdwDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = dsdsdswwdwDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}