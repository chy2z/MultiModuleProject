package cn.chy;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by chy on 2017/12/6.
 */
public class DateTimeUtil {

    public static String time(String format) {

        if (null == format) {
            format = "yyyy-MM-dd HH:mm:ss";
        }

        DateTimeFormatter formatter = DateTimeFormat.forPattern(format);

        return DateTime.now().toString(formatter);
    }

}
