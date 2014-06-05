package parsers;

import model.Comment;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.function.Consumer;

/**
 * Created by andrea on 05/06/14.
 */
public class CommentsHandler extends BaseHandler {
    private Consumer<Comment> consumer;

    public CommentsHandler(Consumer<Comment> consumer) {
        this.consumer = consumer;
    }

    @Override
    public void startDocument() throws SAXException {
    }

    @Override
    public void endDocument() throws SAXException {
    }

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        if (qName != "row")
            return;

        Comment comment = new Comment(
            GetInt(attributes.getValue("Id")),
            GetInt(attributes.getValue("PostId")),
            GetInt(attributes.getValue("Score")),
            attributes.getValue("Text"),
            GetDate(attributes.getValue("CreationDate")),
            GetInt(attributes.getValue("UserId"))
        );

        this.consumer.accept(comment);
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
    }

    // To take specific actions for each chunk of character data (such as
    // adding the data to a node or buffer, or printing it to a file).
    @Override
    public void characters(char ch[], int start, int length)
            throws SAXException {
    }

}
