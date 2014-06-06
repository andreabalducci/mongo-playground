package parsers;

import model.PostHistory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.function.Consumer;

/**
 * Created by andrea on 06/06/14.
 */
public class PostHistoryHandler extends BaseHandler {
    private Consumer<PostHistory> consumer;

    public PostHistoryHandler(Consumer<PostHistory> consumer) {
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

        PostHistory postHistory = new PostHistory(
                GetInt(attributes.getValue("Id")),
                GetInt(attributes.getValue("PostHistoryTypeId")),
                GetInt(attributes.getValue("PostId")),
                GetInt(attributes.getValue("UserId")),
                attributes.getValue("Text"),
                attributes.getValue("RevisionGUID"),
                GetDate(attributes.getValue("CreationDate"))
        );

        this.consumer.accept(postHistory);
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