package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test

    public void testHasCity() {
        CustomList list = new CustomList(null, new ArrayList<City>());

        City city = new City("Edmonton", "AB");
        list.addCity(city);

        assertTrue(list.hasCity(city));

        City otherCity = new City("Calgary", "AB");
        assertFalse(list.hasCity(otherCity));
    }

}

