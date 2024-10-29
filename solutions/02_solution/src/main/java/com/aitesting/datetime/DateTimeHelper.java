package com.aitesting.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeHelper {

  //========================= LocalDate ============================
  private static final DateTimeFormatter DEFAULT_DATE_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE; // yyyy-MM-dd

  /**
   * Prend un objet LocalDate et le transforme au format yyyy-MM-dd et retourne
   * une chaine de caractères
   * @param date Object LocalDate
   * @return chaine de caractère sous format yyyy-MM-dd, ex : "2024-08-31"
   */
  public static String formatDate(LocalDate date) {
    return date.format(DEFAULT_DATE_FORMATTER);
  }

  /**
   * Prend une chaine de caractère en entrée au format yyyy-MM-dd pour en faire un
   * object LocalDate.
   *
   * @param dateString chaine de caractère, ex : "2024-08-31"
   * @return object LocalDate
   */
  public static LocalDate parseDate(String dateString) {
    return LocalDate.parse(dateString, DEFAULT_DATE_FORMATTER);
  }


  /**
   * Prend un objet LocalDate et le transforme au format donné en entrée si ce dernier est valide
   * @param date Object LocalDate
   * @param pattern le pattern de la date souhaité, ex : yyyy-MM-dd ou dd/MM/YYYY
   * @return chaine de caractère formaté avec le pattern en entrée ex : "31/08/2024
   */
  public static String formatDate(LocalDate date, String pattern) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    return date.format(formatter);
  }

  //========================= LocalDateTime ============================

  private static final DateTimeFormatter DEFAULT_DATE_TIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // yyyy-MM-ddThh:mm:ss

  /**
   * Prend un objet LocalDate et le transforme au format yyyy-MM-ddThh:mm:ss et retourne
   * une chaine de caractères
   * @param date Object LocalDateTime
   * @return chaine de caractère sous format yyyy-MM-ddThh:mm:ss, ex : "2024-08-31T08:46:00"
   */
  public static String formatDateTime(LocalDateTime date) {
    return date.format(DEFAULT_DATE_TIME_FORMATTER);
  }


  /**
   * Prend une chaine de caractère en entrée au format yyyy-MM-ddThh:mm:ss pour en faire un
   * object LocalDateTime.
   *
   * @param dateTimeString chaine de caractère, ex : "2024-08-31T08:46:00"
   * @return object LocalDateTime
   */
  public static LocalDateTime parseDateTime(String dateTimeString) {
    return LocalDateTime.parse(dateTimeString, DEFAULT_DATE_TIME_FORMATTER);
  }


  /**
   * Prend un objet LocalDateTime et le transforme au format souhaité, tant que ce dernier est valide
   * @param dateTime Object LocalDateTime
   * @param pattern le pattern de la LocalDateTime souhaité, ex : yyyy-MM-ddThh:mm:ss
   * @return chaine de caractère formaté avec le pattern en entrée ex : "2024-08-31T08:46:00"
   */
  public static String formatDateTime(LocalDateTime dateTime, String pattern) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
    return dateTime.format(formatter);
  }
}
