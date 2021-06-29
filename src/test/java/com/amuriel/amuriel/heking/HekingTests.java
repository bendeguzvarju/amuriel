package com.amuriel.amuriel.heking;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class HekingTests {

    @Test
    public void testMultiplierProcess() {
        //GIVEN

        //WHEN
        Multiplicator multiplicator = new Multiplicator(4);
        long result = multiplicator.process(7);
        //THEN
        assertEquals(28,result);
    }

    @Test
    public void testDividerProcess() {
        //GIVEN

        //WHEN
        Divider divider = new Divider(3);
        long result = divider.process(21);
        //THEN
        assertEquals(7,result);
    }
}
