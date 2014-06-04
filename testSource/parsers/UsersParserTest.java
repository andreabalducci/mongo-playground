package parsers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersParserTest {
    UsersParser parser;


    @Before
    public void setUp() throws Exception {
        parser = new UsersParser();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testLoad() throws Exception {
        parser.Load("./italian.stackexchange.com/Users.xml", usr -> {
            System.out.println("User "+usr.getDisplayName());
        });
    }
}