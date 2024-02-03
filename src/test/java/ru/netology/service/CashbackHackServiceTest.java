package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

class CashbackHackServiceTest {
    @Test
    public void shouldCalculateBoundaryIfAmountBelow1000() { // сумма меньше 1000
        CashbackHackService service = new CashbackHackService();
        int amount = 950;

        int actual = service.remain(amount);
        int expected = 50;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateBoundaryIfAmountEqual1000() { // сумма равна 1000
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateBoundaryIfAmountAbove1000() { // сумма больше 1000
        CashbackHackService service = new CashbackHackService();
        int amount = 1050;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}