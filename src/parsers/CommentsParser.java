package parsers;

import model.Comment;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.function.Consumer;

/**
 * Created by andrea on 05/06/14.
 */
public class CommentsParser {
    public void Load(String filename, Consumer<Comment> consumer) throws ParserConfigurationException, SAXException, IOException {
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        DefaultHandler handler = new CommentsHandler(consumer);
        parser.parse(filename, handler);
    }
}
