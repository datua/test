package com.wzj.date;

import java.util.Calendar;

public class DateUtil {
    public static int getWeeksInYear() {
        return Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
    }
}
