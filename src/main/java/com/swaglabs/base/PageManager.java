package com.swaglabs.base;

import com.swaglabs.pages.*;

public class PageManager {
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static ItemPage itemPage;
    public static CartPage cartPage;
    public static CheckOutStepOne checkoutStepOne;
    public static CheckoutStepTwo checkoutStepTwo;

    public static void initializePageObjects(){

        loginPage=new LoginPage();
        homePage=new HomePage();
        itemPage=new ItemPage();
        cartPage=new CartPage();
        checkoutStepOne=new CheckOutStepOne();
        checkoutStepTwo=new CheckoutStepTwo();



    }
}
