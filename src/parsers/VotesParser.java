package parsers;

import model.Vote;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.function.Consumer;

/**
 * Created by andrea on 06/06/14.
 */
public class VotesParser {
    public void Load(String filename, Consumer<Vote> consumer) throws ParserConfigurationException, SAXException, IOException {
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        DefaultHandler handler = new VotesHandler(consumer);
        parser.parse(filename, handler);
    }
}

