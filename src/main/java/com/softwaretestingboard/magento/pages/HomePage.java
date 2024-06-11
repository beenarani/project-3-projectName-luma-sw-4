package com.softwaretestingboard.magento.pages;
/**
 * 6.Write down the following test into ‘GearTest’ class
 * 1. userShouldAddProductSuccessFullyToShoppingCart()
 * * Mouse Hover on Gear Menu
 * * Click on Bags
 * * Click on Product Name ‘Overnight Duffle’
 * * Verify the text ‘Overnight Duffle’
 * * Change Qty 3
 * * Click on ‘Add to Cart’ Button.
 * * Verify the text
 * ‘You added Overnight Duffle to your shopping cart.’
 * * Click on ‘shopping cart’ Link into message
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the Qty is ‘3’
 * * Verify the product price ‘$135.00’
 * * Change Qty to ‘5’
 * * Click on ‘Update Shopping Cart’ button
 * * Verify the product price ‘$225.00’
 */

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenuLink = By.xpath("//span[normalize-space()='Women']");
    By topMenu = By.id("ui-id-9");
    By jacketsLink = By.id("ui-id-11");
    By menMenu = By.id("ui-id-5");
    By bottoms = By.id("ui-id-18");
    By pantsLink = By.id("ui-id-23");
    By gearMenu = By.id("ui-id-6");
    By bags = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenuLink);
    }

    public void mouseHoverOntopMenu() {
        mouseHoverToElement(topMenu);
    }

    public void clickOnJacketLink() {
        clickOnElement(jacketsLink);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomMenu() {
        mouseHoverToElement(bottoms);
    }

    public void clickOnPantsLink() {
        clickOnElement(pantsLink);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBagsLink() {
        clickOnElement(bags);
    }
}