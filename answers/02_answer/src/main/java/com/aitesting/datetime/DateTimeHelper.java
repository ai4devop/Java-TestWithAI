package com.aitesting.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeHelper {

  //========================= LocalDate ============================
  private static final DateTimeFormatter DEFAULT_DATE_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE; // yyyy-MM-dd

  /**
   * Takes a LocalDate object, formats it to yyyy-MM-dd, and returns it as a string
   * @param date LocalDate object
   * @return string in the format yyyy-MM-dd, e.g., "2024-08-31"
   */
  public static String formatDate(LocalDate date) {
    return date.format(DEFAULT_DATE_FORMATTER);
  }

  /**
   * Takes a string in the format yyyy-MM-dd and converts it to a LocalDate object.
   *
   * @param dateString string, e.g., "2024-08-31"
   * @return LocalDate object
   */
  public static LocalDate parseDate(String dateString) {
    return LocalDate.parse(dateString, DEFAULT_DATE_FORMATTER);
  }


  /**
   * Takes a LocalDate object and formats it using the given pattern if it is valid
   * @param date LocalDate object
   * @param pattern the desired date pattern, e.g., yyyy-MM-dd or dd/MM/yyyy
   * @return formatted string based on the input pattern, e.g., "31/08/2024"
   */
  public static String formatDate(LocalDate date, String pattern) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    return date.format(formatter);
  }

  //========================= LocalDateTime ============================

  private static final DateTimeFormatter DEFAULT_DATE_TIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // yyyy-MM-ddThh:mm:ss

  /**
   * Takes a LocalDateTime object, formats it to yyyy-MM-ddThh:mm:ss, and returns it as a string
   * @param date LocalDateTime object
   * @return string in the format yyyy-MM-ddThh:mm:ss, e.g., "2024-08-31T08:46:00"
   */
  public static String formatDateTime(LocalDateTime date) {
    return date.format(DEFAULT_DATE_TIME_FORMATTER);
  }


  /**
   * Takes a string in the format yyyy-MM-ddThh:mm:ss and converts it to a LocalDateTime object.
   *
   * @param dateTimeString string, e.g., "2024-08-31T08:46:00"
   * @return LocalDateTime object
   */
  public static LocalDateTime parseDateTime(String dateTimeString) {
    return LocalDateTime.parse(dateTimeString, DEFAULT_DATE_TIME_FORMATTER);
  }


  /**
   * Takes a LocalDateTime object and formats it using the desired pattern, if valid
   * @param dateTime LocalDateTime object
   * @param pattern the desired LocalDateTime pattern, e.g., yyyy-MM-ddThh:mm:ss
   * @return formatted string based on the input pattern, e.g., "2024-08-31T08:46:00"
   */
  public static String formatDateTime(LocalDateTime dateTime, String pattern) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    return dateTime.format(formatter);
  }
}
