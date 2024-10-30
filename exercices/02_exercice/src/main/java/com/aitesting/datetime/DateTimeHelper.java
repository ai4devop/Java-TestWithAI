package com.aitesting.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeHelper {

  //========================= LocalDate ============================

  /**
   * Prend un objet LocalDate et le transforme au format yyyy-MM-dd et retourne
   * une chaine de caractères
   * @param date Object LocalDate
   * @return chaine de caractère sous format yyyy-MM-dd, ex : "2024-08-31"
   */
  public static String formatDate(LocalDate date) {
    // TODO :: fonction à implémenter
    return null;
  }

  /**
   * Prend une chaine de caractère en entrée au format yyyy-MM-dd pour en faire un
   * object LocalDate.
   *
   * @param dateString chaine de caractère, ex : "2024-08-31"
   * @return object LocalDate
   */
  public static LocalDate parseDate(String dateString) {
    // TODO :: fonction à implémenter
    return null;
  }


  /**
   * Prend un objet LocalDate et le transforme au format donné en entrée si ce dernier est valide
   * @param date Object LocalDate
   * @param pattern le pattern de la date souhaité, ex : yyyy-MM-dd ou dd/MM/YYYY
   * @return chaine de caractère formaté avec le pattern en entrée ex : "31/08/2024
   */
  public static String formatDate(LocalDate date, String pattern) {
    // TODO :: fonction à implémenter
    return null;
  }

  //========================= LocalDateTime ============================


  /**
   * Prend un objet LocalDate et le transforme au format yyyy-MM-ddThh:mm:ss et retourne
   * une chaine de caractères
   * @param date Object LocalDateTime
   * @return chaine de caractère sous format yyyy-MM-ddThh:mm:ss, ex : "2024-08-31T08:46:00"
   */
  public static String formatDateTime(LocalDateTime date) {
    // TODO :: fonction à implémenter
    return null;
  }


  /**
   * Prend une chaine de caractère en entrée au format yyyy-MM-ddThh:mm:ss pour en faire un
   * object LocalDateTime.
   *
   * @param dateTimeString chaine de caractère, ex : "2024-08-31T08:46:00"
   * @return object LocalDateTime
   */
  public static LocalDateTime parseDateTime(String dateTimeString) {
    // TODO :: fonction à implémenter
    return null;
  }


  /**
   * Prend un objet LocalDateTime et le transforme au format souhaité, tant que ce dernier est valide
   * @param dateTime Object LocalDateTime
   * @param pattern le pattern de la LocalDateTime souhaité, ex : yyyy-MM-ddThh:mm:ss
   * @return chaine de caractère formaté avec le pattern en entrée ex : "2024-08-31T08:46:00"
   */
  public static String formatDateTime(LocalDateTime dateTime, String pattern) {
    // TODO :: fonction à implémenter
    return null;
  }
}
