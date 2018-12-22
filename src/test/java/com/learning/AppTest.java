package com.learning;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    String msg = "jeifk wefk wef w";
    App app = new App(msg);
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(msg,app.printMessage());
    }
}
