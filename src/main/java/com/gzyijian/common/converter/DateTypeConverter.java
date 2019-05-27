package com.gzyijian.common.converter;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/**
 * @author zmjiangi
 * @date 2019-5-27
 */
public class DateTypeConverter extends StrutsTypeConverter {
    ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy/MM/dd"));

    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {

        if (Objects.isNull(values) || values.length == 0) {
            return null;
        }

        if (toClass == Date.class) {
            try {
                return simpleDateFormatThreadLocal.get().parse(values[0]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }

    @Override
    public String convertToString(Map context, Object o) {

        if (Objects.isNull(o)) {
            return null;
        }

        if (o instanceof Date) {
            return simpleDateFormatThreadLocal.get().format(o);
        }
        return null;
    }

}
