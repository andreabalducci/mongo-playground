package parsers;

import helpers.StackOverflow;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import writers.BadgesWriter;

/**
 * Created by andrea on 06/06/14.
 */
public class BadgesParserTest {
    BadgesParser parser;
    BadgesWriter writer;

    @Before
    public void setUp() throws Exception {
        parser = new BadgesParser();
        writer = new BadgesWriter(StackOverflow.getBadges());
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    @Ignore
    public void testLoad() throws Exception {
        writer.Drop();

        parser.Load("./italian.stackexchange.com/Badges.xml", badge -> {
            System.out.println("Badge " + badge.getId());
            writer.Insert(badge);
        });

        System.out.println("Done");
    }

}
