package com.swaglabs.stepdefinitions;


import com.swaglabs.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.jsoup.Connection;

public class Hooks {

    @Before
    public void setUp(){
        BasePage.initializeDriver();
    }

    @After
    public void tearDown(){
        BasePage.tearDown();
    }
}
