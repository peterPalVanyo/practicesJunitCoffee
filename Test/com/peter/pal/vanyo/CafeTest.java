package com.peter.pal.vanyo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    public void canBrewEspresso(){

        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //isEspresso
        //noMilk
        //enoughCoffee

        //(expected, what we check)
        assertEquals(CoffeeType.Espresso, coffee.getType());
        assertEquals(0, coffee.getMilk());
        assertEquals(7, coffee.getBeans());


    }

    @Test
    void brew() {
    }

    @Test
    void brew1() {
    }
}