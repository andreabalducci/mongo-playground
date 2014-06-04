package parsers;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import writers.UsersWriter;

import static org.junit.Assert.*;

public class UsersParserTest {
    UsersParser parser;
    UsersWriter writer;

    @Before
    public void setUp() throws Exception {
        MongoClient client = new MongoClient("localhost", 31000);
        DB db = client.getDB("so-demo");

        parser = new UsersParser();
        writer = new UsersWriter(db.getCollection("users"));
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testLoad() throws Exception {
        writer.Drop();
        parser.Load("./italian.stackexchange.com/Users.xml", usr -> {
            System.out.println("User " + usr.getDisplayName());
            writer.Insert(usr);
        });
    }
}