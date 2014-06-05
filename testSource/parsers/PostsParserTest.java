package parsers;

import helpers.StackOverflow;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import writers.PostsWriter;

public class PostsParserTest {
    PostsParser parser;
    PostsWriter writer;

    @Before
    public void setUp() throws Exception {
        writer = new PostsWriter(StackOverflow.getPosts());
        parser = new PostsParser();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test @Ignore
    public void testLoad() throws Exception {
        writer.Drop();
        parser.Load("./italian.stackexchange.com/Posts.xml", post -> {
            System.out.println("Post " + post.getId());
            writer.Insert(post);
        });
    }
}