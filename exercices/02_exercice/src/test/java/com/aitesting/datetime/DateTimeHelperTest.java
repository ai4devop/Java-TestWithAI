package com.aitesting.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
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
    // TODO :: Test to implement: takes a LocalDateTime as input
    // and returns a String in the format yyyy-MM-ddThh:mm:ss
  }

  @Test
  public void testParseDateTime_ValidDateTime() {
    // TODO :: Test to implement: takes a String as input
    // in the format yyyy-MM-ddThh:mm:ss and returns a LocalDateTime
  }

  @Test
  public void testParseDateTime_InvalidDateTime() {
    // TODO :: Test to implement: takes a String as input
    // in an invalid format, e.g., "invalid-date-time", and throws a DateTimeParseException
  }

  @Test
  public void testFormatDateTime_WithPattern() {
    // TODO :: Test to implement: takes a LocalDateTime as input
    // and a String pattern. If the pattern is valid, it corresponds to the desired dateTime format, e.g., "yyyy-MM-ddThh:mm:ss".
    // The function returns a String in the specified format.
  }

}
