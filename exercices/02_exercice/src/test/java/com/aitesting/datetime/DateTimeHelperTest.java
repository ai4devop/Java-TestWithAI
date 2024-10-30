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
    // TODO :: test à implémenter, prendre en entrée une LocalDateTime
    // et en sortir une String au format yyyy-MM-ddThh:mm:ss
  }

  @Test
  public void testParseDateTime_ValidDateTime() {
    // TODO :: test à implémenter, prendre en entrée une String
    //  format yyyy-MM-ddThh:mm:ss et en sort une LocalDateTime
  }

  @Test
  public void testParseDateTime_InvalidDateTime() {
    // TODO :: test à implémenter, prendre en entrée une String
    //  format invalid, ex : "invalid-date-time" et renvoit une exception DateTimeParseException
  }


  @Test
  public void testFormatDateTime_WithPattern() {
    // TODO :: test à implémenter, prendre en entrée une LocalDateTime
    // et une String pattern. Le pattern, si valide correpond au format de dateTime voulu, ex :  "yyyy-MM-ddThh:mm:ss"
    // La fonction renvera une String au format donnée en entrée
   }

}
