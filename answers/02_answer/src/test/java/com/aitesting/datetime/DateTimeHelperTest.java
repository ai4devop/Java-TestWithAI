package com.aitesting.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateTimeHelperTest {

  //========================= LocalDate ============================
  @Test
  public void testFormatDate_ValidDate() {
    LocalDate date = LocalDate.of(2024, 10, 28);
    String formattedDate = DateTimeHelper.formatDate(date);
    assertEquals("2024-10-28", formattedDate);
  }

  @Test
  public void testParseDate_ValidDate() {
    LocalDate date = DateTimeHelper.parseDate("2024-10-11");
    assertEquals(LocalDate.of(2024, 10, 11), date);
  }

  @Test
  public void testParseDate_InvalidDate() {
    assertThrows(DateTimeParseException.class, () ->
            DateTimeHelper.parseDate("invalid-date")
    );
  }

  @Test
  public void testFormatDate_WithPattern() {
    LocalDate date = LocalDate.of(2024, 10, 28);
    String formattedDate1 = DateTimeHelper.formatDate(date, "dd/MM/yyyy");
    String formattedDate2 = DateTimeHelper.formatDate(date, "yyyy-MM-dd");
    assertEquals("28/10/2024", formattedDate1);
    assertEquals("2024-10-28", formattedDate2);

  }


  //========================= LocalDateTime ============================

  @Test
  public void testFormatDateTime_ValidDateTime() {
    LocalDateTime dateTime = LocalDateTime.of(2024, 8, 31, 8, 46, 0);
    String formattedDateTime = DateTimeHelper.formatDateTime(dateTime);
    assertEquals("2024-08-31T08:46:00", formattedDateTime);
  }

  @Test
  public void testParseDateTime_ValidDateTime() {
    LocalDateTime dateTime = DateTimeHelper.parseDateTime("2024-08-31T08:46:00");
    assertEquals(LocalDateTime.of(2024, 8, 31, 8, 46, 0), dateTime);
  }

  @Test
  public void testParseDateTime_InvalidDateTime() {
    assertThrows(DateTimeParseException.class, () ->
            DateTimeHelper.parseDateTime("invalid-date-time")
    );
  }


  @Test
  public void testFormatDateTime_WithPattern() {
    LocalDateTime dateTime = LocalDateTime.of(2024, 8, 31, 8, 46, 0);
    String formattedDateTime1 = DateTimeHelper.formatDateTime(dateTime, "dd/MM/yyyy HH:mm:ss");
    String formattedDateTime2 = DateTimeHelper.formatDateTime(dateTime, "yyyy-MM-dd HH:mm");
    assertEquals("31/08/2024 08:46:00", formattedDateTime1);
    assertEquals("2024-08-31 08:46", formattedDateTime2);
  }

}
