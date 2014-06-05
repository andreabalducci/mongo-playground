package parsers;

import helpers.StackOverflow;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import writers.CommentsWriter;

/**
 * Created by andrea on 05/06/14.
 */
public class CommentsParserTest {
    CommentsParser parser;
    CommentsWriter writer;

    @Before
    public void setUp() throws Exception {
        writer = new CommentsWriter(StackOverflow.getComments());
        parser = new CommentsParser();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    @Ignore
    public void testLoad() throws Exception {
        writer.Drop();
        parser.Load("./italian.stackexchange.com/Comments.xml", comment -> {
            System.out.println("Comment " + comment.getId());
            writer.Insert(comment);
        });
    }
}