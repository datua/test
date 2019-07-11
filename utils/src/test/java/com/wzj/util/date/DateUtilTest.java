package com.wzj.util.date;

import com.wzj.date.util.DateUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class DateUtilTest {
    private static final int year = 2030;
    private static final int month = 11;
    private static final int day = 19;
    private static final int hour = 22;
    private static final int min = 33;
    private static final int second = 24;

    @Test
    public void tt() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, min);
        calendar.set(Calendar.SECOND, second);
        Date date = calendar.getTime();

        String year = DateUtil.toString(date, "YYYY-MM-dd HH:mm:ss");
        Assert.assertEquals("2030-12-19 22:33:24", year);
    }
}
