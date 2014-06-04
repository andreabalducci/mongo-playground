package gettingStarted;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class greeterTest {
    Greeter tutorial;

    @Before
    public void setUp() throws Exception {
        tutorial = new Greeter();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHello() throws Exception {
        assertEquals("Hello", tutorial.Hello());
    }
}