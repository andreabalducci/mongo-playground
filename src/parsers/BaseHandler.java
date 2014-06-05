package parsers;

import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by andrea on 05/06/14.
 */
public abstract class BaseHandler extends DefaultHandler {

    private SimpleDateFormat dateParser;

    protected BaseHandler() {
        dateParser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    protected int GetInt(String value){
        return GetInt(value, 0);
    }

    protected int GetInt(String value, int defaultValue){
        if(value == null)
            return defaultValue;

        return Integer.parseInt(value);
    }

    protected Date GetDate(String value)  {
        if(value == null)
            return null;

        try {
            return dateParser.parse(value+"+0000");
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
