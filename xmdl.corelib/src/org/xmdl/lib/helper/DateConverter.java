package org.xmdl.lib.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.sql.Timestamp;

import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;


/**
 * This class is converts a java.util.Date to a String
 * and a String to a java.util.Date. 
 * 
 * <p>
 * <a href="DateConverter.java.html"><i>View Source</i></a>
 * </p>
 * 
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class DateConverter implements Converter {
    private static final Log LOGGER = LogFactory.getLog(DateConverter.class);

    public static final String TS_FORMAT = DateUtil.getDatePattern() + " HH:mm:ss.S";

    @SuppressWarnings("unchecked")
	public Object convert(Class type, Object value) {
        LOGGER.debug("type = " + type);
        LOGGER.debug("value = " + value);
        if (value == null) {
            return null;
        } else if (type == Timestamp.class) {
            String timeStampFormat = TS_FORMAT;
            LOGGER.debug("timeStampFormat = " + timeStampFormat);
            return convertToDate(type, value, timeStampFormat);
        } else if (type == Date.class) {
            String datePattern = DateUtil.getDatePattern();
            LOGGER.debug("datePattern = " + datePattern);
            return convertToDate(type, value, datePattern);
        } else if (type == String.class) {
            return convertToString(type, value);
        }

        throw new ConversionException("Could not convert " +
                                      value.getClass().getName() + " to " +
                                      type.getName());
    }

    protected Object convertToDate(Class<?> type, Object value, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        if (value instanceof String) {
            try {
                if ("null".equals(value) || StringUtils.isEmpty(value.toString())) {
                    return null;
                }

                Date date = df.parse((String) value);
                if (type.equals(Timestamp.class)) {
                    return new Timestamp(date.getTime());
                }
                return date;
            } catch (Exception pe) {
                pe.printStackTrace();
                throw new ConversionException("Error converting String to Date");
            }
        }

        if(value instanceof Date) {
            return value;
        }
        throw new ConversionException("Could not convert " +
                                      value.getClass().getName() + " to " +
                                      type.getName());
    }

    protected Object convertToString(Class<?> type, Object value) {        

        if (value instanceof Date) {
            DateFormat df = new SimpleDateFormat(DateUtil.getDatePattern());
            LOGGER.debug("dateformat = " + df);
            if (value instanceof Timestamp) {
                df = new SimpleDateFormat(TS_FORMAT);
            } 
    
            try {
                return df.format(value);
            } catch (Exception e) {
                e.printStackTrace();
                throw new ConversionException("Error converting Date to String");
            }
        } else {
            return value.toString();
        }
    }
}
