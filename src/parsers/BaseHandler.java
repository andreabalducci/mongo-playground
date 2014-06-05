package parsers;

import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by andrea on 05/06/14.
 */
public abstract class BaseHandler extends DefaultHandler {

    protected int GetInt(String value){
        return GetInt(value, 0);
    }

    protected int GetInt(String value, int defaultValue){
        if(value == null)
            return defaultValue;

        return Integer.parseInt(value);
    }
}
