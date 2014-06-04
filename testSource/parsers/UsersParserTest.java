package parsers;

import helpers.stackOverflow;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import writers.UsersWriter;

import static org.junit.Assert.*;

public class UsersParserTest {
    UsersParser parser;
    UsersWriter writer;

    @Before
    public void setUp() throws Exception {
        parser = new UsersParser();
        writer = new UsersWriter(stackOverflow.getUsers());
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test @Ignore
    public void testLoad() throws Exception {
        writer.Drop();
        parser.Load("./italian.stackexchange.com/Users.xml", usr -> {
            System.out.println("User " + usr.getDisplayName());
            writer.Insert(usr);
        });
    }
}