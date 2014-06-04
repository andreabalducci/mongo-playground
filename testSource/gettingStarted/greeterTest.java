package gettingStarted;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class greeterTest {
    Greeter greeter;

    @Before
    public void setUp() throws Exception {
        greeter = new Greeter();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHello() throws Exception {
        assertEquals("Hello", greeter.Hello());
    }

    @Test
    public void testCount() {
        assertEquals(1, greeter.Count());

    }

}