package com.wzj.date.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DateUtil {
    private static final ThreadLocal<Map<String, SimpleDateFormat>> dateFormatMap = new ThreadLocal<Map<String, SimpleDateFormat>>() {
        @Override
        protected Map<String, SimpleDateFormat> initialValue() {
            return new ConcurrentHashMap<>();
        }
    };


    public static int getWeeksInYear() {
        return Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
    }

    public static String toString(Date date, String format) {
        SimpleDateFormat simpleDateFormat = dateFormatMap.get().get(format);
        if (null == simpleDateFormat) {
            SimpleDateFormat newDateFormat = new SimpleDateFormat(format);
            dateFormatMap.get().put(format, newDateFormat);
            return newDateFormat.format(date);
        } else {
            return simpleDateFormat.format(date);
        }
    }

    public static void main(String[] args) {
        System.out.println(getWeeksInYear());
    }
}
