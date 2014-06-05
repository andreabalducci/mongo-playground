package parsers;

import model.Post;
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
public class PostsParser {
    public void Load(String filename, Consumer<Post> consumer) throws ParserConfigurationException, SAXException, IOException {
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        DefaultHandler handler = new PostsHandler(consumer);
        parser.parse(filename, handler);
    }
}
