package parsers;

import helpers.StackOverflow;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import writers.VotesWriter;

/**
 * Created by andrea on 06/06/14.
 */
public class VotesParserTest {
    VotesParser parser;
    VotesWriter writer;

    @Before
    public void setUp() throws Exception {
        parser = new VotesParser();
        writer = new VotesWriter(StackOverflow.getVotes());
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    @Ignore
    public void testLoad() throws Exception {
        writer.Drop();

        parser.Load("./italian.stackexchange.com/Votes.xml", vote -> {
            System.out.println("Vote " + vote.getId());
            writer.Insert(vote);
        });

        System.out.println("Done");
    }

}