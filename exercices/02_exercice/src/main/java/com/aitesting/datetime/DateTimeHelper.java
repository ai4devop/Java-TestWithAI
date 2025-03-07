package com.aitesting.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeHelper {

  //========================= LocalDate ============================

  /**
   * Takes a LocalDate object, formats it to yyyy-MM-dd, and returns it as a string
   * @param date LocalDate object
   * @return string in the format yyyy-MM-dd, e.g., "2024-08-31"
   */
  public static String formatDate(LocalDate date) {
    // TODO :: function to implement
    return null;
  }

  /**
   * Takes a string in the format yyyy-MM-dd and converts it to a LocalDate object.
   *
   * @param dateString string, e.g., "2024-08-31"
   * @return LocalDate object
   */
  public static LocalDate parseDate(String dateString) {
    // TODO :: function to implement
    return null;
  }

  /**
   * Takes a LocalDate object and formats it using the given pattern if it is valid
   * @param date LocalDate object
   * @param pattern the desired date pattern, e.g., yyyy-MM-dd or dd/MM/yyyy
   * @return formatted string based on the input pattern, e.g., "31/08/2024"
   */
  public static String formatDate(LocalDate date, String pattern) {
    // TODO :: function to implement
    return null;
  }

  //========================= LocalDateTime ============================

  /**
   * Takes a LocalDateTime object, formats it to yyyy-MM-ddThh:mm:ss, and returns it as a string
   * @param date LocalDateTime object
   * @return string in the format yyyy-MM-ddThh:mm:ss, e.g., "2024-08-31T08:46:00"
   */
  public static String formatDateTime(LocalDateTime date) {
    // TODO :: function to implement
    return null;
  }

  /**
   * Takes a string in the format yyyy-MM-ddThh:mm:ss and converts it to a LocalDateTime object.
   *
   * @param dateTimeString string, e.g., "2024-08-31T08:46:00"
   * @return LocalDateTime object
   */
  public static LocalDateTime parseDateTime(String dateTimeString) {
    // TODO :: function to implement
    return null;
  }

  /**
   * Takes a LocalDateTime object and formats it using the desired pattern, if valid
   * @param dateTime LocalDateTime object
   * @param pattern the desired LocalDateTime pattern, e.g., yyyy-MM-ddThh:mm:ss
   * @return formatted string based on the input pattern, e.g., "2024-08-31T08:46:00"
   */
  public static String formatDateTime(LocalDateTime dateTime, String pattern) {
    // TODO :: function to implement
    return null;
  }
}
