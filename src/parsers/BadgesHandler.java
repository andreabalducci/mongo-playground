package parsers;

import model.Badge;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.function.Consumer;

/**
 * Created by andrea on 06/06/14.
 */
public class BadgesHandler extends BaseHandler {
    private Consumer<Badge> consumer;

    public BadgesHandler(Consumer<Badge> consumer) {
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

        Badge badge = new Badge(
            GetInt(attributes.getValue("Id")),
            GetInt(attributes.getValue("UserId")),
            attributes.getValue("Name"),
            GetDate(attributes.getValue("Date"))
        );

        this.consumer.accept(badge);
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
