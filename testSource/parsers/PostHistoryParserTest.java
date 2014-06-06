package parsers;

import helpers.StackOverflow;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import writers.PostHistoryWriter;

/**
 * Created by andrea on 06/06/14.
 */
public class PostHistoryParserTest {
    PostHistoryParser parser;
    PostHistoryWriter writer;

    @Before
    public void setUp() throws Exception {
        writer = new PostHistoryWriter(StackOverflow.getPostHistory());
        parser = new PostHistoryParser();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    @Ignore
    public void testLoad() throws Exception {
        writer.Drop();
        parser.Load("./italian.stackexchange.com/PostHistory.xml", postHistory -> {
            System.out.println("PostHistory " + postHistory.getId());
            writer.Insert(postHistory);
        });
    }
}