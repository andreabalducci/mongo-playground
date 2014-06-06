package parsers;

import model.Vote;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.function.Consumer;

/**
 * Created by andrea on 06/06/14.
 */
public class VotesHandler extends BaseHandler {
    private Consumer<Vote> consumer;

    public VotesHandler(Consumer<Vote> consumer) {
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

        Vote vote = new Vote(
            GetInt(attributes.getValue("Id")),
            GetInt(attributes.getValue("PostId")),
            GetInt(attributes.getValue("VoteTypeId")),
            GetDate(attributes.getValue("CreationDate")),
            GetInt(attributes.getValue("UserId"))
        );

        this.consumer.accept(vote);
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
