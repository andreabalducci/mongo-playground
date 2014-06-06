package parsers;

import helpers.StackOverflow;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import writers.UsersWriter;

public class UsersParserTest {
    UsersParser parser;
    UsersWriter writer;

    @Before
    public void setUp() throws Exception {
        parser = new UsersParser();
        writer = new UsersWriter(StackOverflow.getUsers());
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

        System.out.println("Done");
    }

    @Test @Ignore
    public void testLoadStackOverflowDump() throws Exception {
        writer.Drop();
        final int[] counter = {0};

        parser.Load("/Volumes/Macintosh HD 2/Stack Exchange/Users.xml", usr -> {
            if(counter[0]++ % 1000 == 0){
                System.out.println("Done " + counter[0]);
            }
            writer.Insert(usr);
        });

        System.out.println("Done");
    }
}