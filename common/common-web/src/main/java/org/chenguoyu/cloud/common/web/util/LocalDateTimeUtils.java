package org.chenguoyu.cloud.common.web.util;

import org.springframework.util.Assert;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

/**
  * 
  * @author 陈国钰 on 2020-7-9.
  * @version 1.0
  */
public class LocalDateTimeUtils {
    public static final DateTimeFormatter YYYY_MM_DD_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter YYYY_MM_DD_HH_MM_SS_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * LocalDateTime转为Date
     *
     * @param localDateTime
     * @return Date
     */
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        Assert.notNull(localDateTime, "日期不能为空!");
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * LocalDate转为Date
     *
     * @param localDate
     * @return
     */
    public static Date localDateToDate(LocalDate localDate) {
        Assert.notNull(localDate, "日期不能为空!");
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * 格式化LocalDate
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String format(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    /**
     * 默认格式化
     *
     * @param date
     * @return
     */
    public static String defaultFormat(LocalDate date) {
        return date.format(LocalDateTimeUtils.YYYY_MM_DD_FORMATTER);
    }

    /**
     * 格式化LocalDateTime
     *
     * @param time
     * @param pattern
     * @return
     */
    public static String format(LocalDateTime time, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return time.format(formatter);
    }

    /**
     * 默认格式化
     *
     * @param time
     * @return
     */
    public static String defaultFormat(LocalDateTime time) {
        return time.format(LocalDateTimeUtils.YYYY_MM_DD_HH_MM_SS_FORMATTER);
    }

    /**
     * 将字符串转化为LocalDate
     *
     * @param dateStr
     * @param pattern
     * @return
     */
    public static LocalDate parseLocalDate(String dateStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateStr, formatter);
    }

    /**
     * 将字符串转化为LocalDateTime
     *
     * @param dateStr
     * @param pattern
     * @return
     */
    public static LocalDateTime parseLocalDateTime(String dateStr, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateStr, formatter);
    }

    /**
     * 将时间戳转成LocalDateTime
     *
     * @param timestamp
     * @return
     */
    public static LocalDateTime getDateTimeFromTimestamp(long timestamp) {
        if (timestamp == 0) {
            return null;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), TimeZone.getDefault().toZoneId());
    }

    /**
     * 将时间戳转化陈日期
     *
     * @param timestamp
     * @return
     */
    public static LocalDate getDateFromTimestamp(long timestamp) {
        LocalDateTime date = getDateTimeFromTimestamp(timestamp);
        return date == null ? null : date.toLocalDate();
    }

    /**
     * 将LocalDateTime转成时间戳
     *
     * @param date
     * @return
     */
    public static long localDateToTimestamp(LocalDateTime date) {
        return Timestamp.valueOf(date).getTime();
    }

    /**
     * 获得今天的 00:00:00
     *
     * @return
     */
    public static LocalDateTime getStartOfToday() {
        LocalDate localDate = LocalDate.now();
        return localDate.atStartOfDay();
    }

    /**
     * 获得今天的 23:59:59
     *
     * @return
     */
    public static LocalDateTime getEndOfToday() {
        LocalDate localDate = LocalDate.now();
        return localDate.atTime(23, 59, 59);
    }
}
