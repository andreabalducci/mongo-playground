package parsers;

import model.Post;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.Set;
import java.util.function.Consumer;

/**
 * Created by andrea on 05/06/14.
 */
public class PostsHandler extends BaseHandler {
    private Consumer<Post> consumer;

    public PostsHandler(Consumer<Post> consumer) {

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

        String tagsAsString = attributes.getValue("Tags");
        String tags[] = new String[0];

        if(tagsAsString != null){
            tagsAsString = tagsAsString.replace("><",",").replace("<","").replace(">","");
            tags = tagsAsString.split(",");
        }

        Post post = new Post(
            GetInt(attributes.getValue("Id")),
            attributes.getValue("Title"),
            attributes.getValue("Body"),
            GetInt(attributes.getValue("PostTypeId")),
            GetInt(attributes.getValue("AcceptedAnswerId")),
            GetInt(attributes.getValue("Score")),
            GetInt(attributes.getValue("ViewCount")),
            GetInt(attributes.getValue("OwnerUserId")),
            GetInt(attributes.getValue("LastEditorUserId")),
            GetInt(attributes.getValue("AnswerCount")),
            GetInt(attributes.getValue("CommentCount")),
            GetInt(attributes.getValue("FavoriteCount")),
            tags,
            GetDate(attributes.getValue("CreationDate")),
            GetDate(attributes.getValue("LastEditDate"))
        );

        this.consumer.accept(post);
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
