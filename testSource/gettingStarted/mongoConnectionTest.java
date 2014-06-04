package gettingStarted;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andrea.balducci on 04/06/2014.
 */
public class mongoConnectionTest {
    MongoClient client;
    DB database;

    @Before
    public void setUp() throws Exception {
        client = new MongoClient();
        database = client.getDB("playground");
    }

    @After
    public void tearDown() throws Exception {
        client.close();
    }


    @Test
    public void doit(){
        for (String cname: database.getCollectionNames()){
            System.out.println(cname);
        }
    }
}
