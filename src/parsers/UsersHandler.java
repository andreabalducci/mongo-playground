package parsers;


import model.User;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.function.Consumer;

/**
 * Created by andrea on 04/06/14.
 */
public class UsersHandler extends DefaultHandler {
    private Consumer<User> consumer;

    public UsersHandler(Consumer<User> consumer) {

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

//        System.out.println();
//        System.out.println("started " + qName);
//        for (int c = 0; c < attributes.getLength(); c++) {
//            System.out.println("\tName " + attributes.getQName(c) + " value " + attributes.getValue(c));
//        }
//        System.out.println();

        String age = attributes.getValue("Age");
        if(age == null)
            age = "0";

        User usr = new User(
                Integer.parseInt(attributes.getValue("Id")),
                attributes.getValue("DisplayName"),
                attributes.getValue("WebsiteUrl"),
                attributes.getValue("Location"),
                attributes.getValue("AboutMe"),
                Integer.parseInt(attributes.getValue("Reputation")),
                Integer.parseInt(age)
            );

        this.consumer.accept(usr);
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
//        System.out.print(ch);
    }

}
