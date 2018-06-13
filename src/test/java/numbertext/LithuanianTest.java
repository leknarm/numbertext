package numbertext;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.numbertext.Numbertext;

public class LithuanianTest {

  @Test
  public void testMoneytext() {
    assertEquals("Nulis eurų", money("0"));
    assertEquals("Vienas euras", money("1"));
    assertEquals("Du eurai", money("2"));
    assertEquals("Trys eurai", money("3"));
    assertEquals("Keturi eurai", money("4"));
    assertEquals("Penki eurai", money("5"));
    assertEquals("Šeši eurai", money("6"));
    assertEquals("Septyni eurai", money("7"));
    assertEquals("Aštuoni eurai", money("8"));
    assertEquals("Devyni eurai", money("9"));
    assertEquals("Vienuolika eurų", money("11"));
    assertEquals("Dvylika eurų", money("12"));
    assertEquals("Trylika eurų", money("13"));
    assertEquals("Keturiolika eurų", money("14"));
    assertEquals("Penkiolika eurų", money("15"));
    assertEquals("Šešiolika eurų", money("16"));
    assertEquals("Septyniolika eurų", money("17"));
    assertEquals("Aštuoniolika eurų", money("18"));
    assertEquals("Devyniolika eurų", money("19"));
    assertEquals("Dešimt eurų", money("10"));
    assertEquals("Dvidešimt eurų", money("20"));
    assertEquals("Trisdešimt eurų", money("30"));
    assertEquals("Keturiasdešimt eurų", money("40"));
    assertEquals("Penkiasdešimt eurų", money("50"));
    assertEquals("Šešiasdešimt eurų", money("60"));
    assertEquals("Septyniasdešimt eurų", money("70"));
    assertEquals("Aštuoniasdešimt eurų", money("80"));
    assertEquals("Devyniasdešimt eurų", money("90"));
    assertEquals("Dvidešimt vienas euras", money("21"));
    assertEquals("Trisdešimt septyni eurai", money("37"));
    assertEquals("Keturiasdešimt trys eurai", money("43"));
    assertEquals("Penkiasdešimt aštuoni eurai", money("58"));
    assertEquals("Šešiasdešimt devyni eurai", money("69"));
    assertEquals("Septyniasdešimt šeši eurai", money("76"));
    assertEquals("Aštuoniasdešimt du eurai", money("82"));
    assertEquals("Devyniasdešimt penki eurai", money("95"));
    assertEquals("Šimtas eurų", money("100"));
    assertEquals("Du šimtai eurų", money("200"));
    assertEquals("Trys šimtai eurų", money("300"));
    assertEquals("Keturi šimtai eurų", money("400"));
    assertEquals("Penki šimtai eurų", money("500"));
    assertEquals("Šeši šimtai eurų", money("600"));
    assertEquals("Septyni šimtai eurų", money("700"));
    assertEquals("Aštuoni šimtai eurų", money("800"));
    assertEquals("Devyni šimtai eurų", money("900"));
    assertEquals("Šimtas vienuolika eurų", money("111"));
    assertEquals("Du šimtai septyniasdešimt du eurai", money("272"));
    assertEquals("Trys šimtai aštuoniasdešimt septyni eurai", money("387"));
    assertEquals("Keturi šimtai keturiasdešimt aštuoni eurai", money("448"));
    assertEquals("Penki šimtai šešiasdešimt devyni eurai", money("569"));
    assertEquals("Šeši šimtai dvidešimt penki eurai", money("625"));
    assertEquals("Septyni šimtai septyniasdešimt septyni eurai", money("777"));
    assertEquals("Septyni šimtai aštuoniasdešimt du eurai", money("782"));
    assertEquals("Aštuoni šimtai devyniasdešimt penki eurai", money("895"));
    assertEquals("Devyni šimtai devyniasdešimt devyni eurai", money("999"));
    assertEquals("Tūkstantis eurų", money("1000"));
    assertEquals("Du tūkstančiai eurų", money("2000"));
    assertEquals("Trys tūkstančiai eurų", money("3000"));
    assertEquals("Keturi tūkstančiai eurų", money("4000"));
    assertEquals("Penki tūkstančiai eurų", money("5000"));
    assertEquals("Septyni tūkstančiai šeši šimtai trisdešimt keturi eurai", money("7634"));
    assertEquals("Vienuolika tūkstančių eurų", money("11000"));
    assertEquals("Penkiolika tūkstančių eurų", money("15000"));
    assertEquals("Dvidešimt vienas tūkstantis eurų", money("21000"));
    assertEquals("Dvidešimt du tūkstančiai eurų", money("22000"));
    assertEquals("Dvidešimt keturi tūkstančiai šimtas devyniasdešimt eurų", money("24190"));
    assertEquals("Šeši šimtai penkiasdešimt trys tūkstančiai eurų", money("653000"));
    assertEquals("Du šimtai vienuolika tūkstančių eurų", money("211000"));
    assertEquals("Šimtas dvidešimt trys tūkstančiai keturi šimtai penkiasdešimt keturi eurai",
        money("123454"));
    assertEquals("Septyni šimtai tūkstančių eurų", money("700000"));
    assertEquals(
        "Septyni šimtai penkiasdešimt vienas tūkstantis du šimtai dvidešimt vienas euras",
        money("751221"));
    assertEquals(
        "Devyni šimtai devyniasdešimt devyni tūkstančiai devyni šimtai devyniasdešimt devyni "
            + "eurai",
        money("999999"));
    assertEquals("Vienas milijonas eurų", money("1000000"));
    assertEquals("Du milijonai eurų", money("2000000"));
    assertEquals("Penki milijonai eurų", money("5000000"));
    assertEquals("Septyni milijonai du šimtai vienuolika tūkstančių eurų", money("7211000"));
    assertEquals(
        "Dvidešimt trys milijonai keturi šimtai trisdešimt septyni tūkstančiai du šimtai "
            + "devyniolika eurų",
        money("23437219"));
    assertEquals("Šimtas milijonų eurų", money("100000000"));
    assertEquals(
        "Šimtas dvidešimt trys milijonai keturi šimtai penkiasdešimt šeši tūkstančiai septyni "
            + "šimtai aštuoniasdešimt devyni eurai",
        money("123456789"));
    assertEquals(
        "Trys šimtai dvidešimt du milijonai aštuoniasdešimt devyni tūkstančiai aštuoni šimtai "
            + "devyniasdešimt eurų",
        money("322089890"));
    assertEquals("Vienas milijardas eurų", money("1000000000"));
    assertEquals(
        "Du milijardai šimtas keturiasdešimt septyni milijonai keturi šimtai aštuoniasdešimt "
            + "trys tūkstančiai šeši šimtai keturiasdešimt septyni eurai",
        money("2147483647"));
  }

  @Test
  public void testNumbertext() {
    assertEquals("Nulis", number("0"));
    assertEquals("Vienas", number("1"));
    assertEquals("Du", number("2"));
    assertEquals("Trys", number("3"));
    assertEquals("Keturi", number("4"));
    assertEquals("Penki", number("5"));
    assertEquals("Šeši", number("6"));
    assertEquals("Septyni", number("7"));
    assertEquals("Aštuoni", number("8"));
    assertEquals("Devyni", number("9"));
    assertEquals("Vienuolika", number("11"));
    assertEquals("Dvylika", number("12"));
    assertEquals("Trylika", number("13"));
    assertEquals("Keturiolika", number("14"));
    assertEquals("Penkiolika", number("15"));
    assertEquals("Šešiolika", number("16"));
    assertEquals("Septyniolika", number("17"));
    assertEquals("Aštuoniolika", number("18"));
    assertEquals("Devyniolika", number("19"));
    assertEquals("Dešimt", number("10"));
    assertEquals("Dvidešimt", number("20"));
    assertEquals("Trisdešimt", number("30"));
    assertEquals("Keturiasdešimt", number("40"));
    assertEquals("Penkiasdešimt", number("50"));
    assertEquals("Šešiasdešimt", number("60"));
    assertEquals("Septyniasdešimt", number("70"));
    assertEquals("Aštuoniasdešimt", number("80"));
    assertEquals("Devyniasdešimt", number("90"));
    assertEquals("Dvidešimt vienas", number("21"));
    assertEquals("Trisdešimt septyni", number("37"));
    assertEquals("Keturiasdešimt trys", number("43"));
    assertEquals("Penkiasdešimt aštuoni", number("58"));
    assertEquals("Šešiasdešimt devyni", number("69"));
    assertEquals("Septyniasdešimt šeši", number("76"));
    assertEquals("Aštuoniasdešimt du", number("82"));
    assertEquals("Devyniasdešimt penki", number("95"));
    assertEquals("Šimtas", number("100"));
    assertEquals("Du šimtai", number("200"));
    assertEquals("Trys šimtai", number("300"));
    assertEquals("Keturi šimtai", number("400"));
    assertEquals("Penki šimtai", number("500"));
    assertEquals("Šeši šimtai", number("600"));
    assertEquals("Septyni šimtai", number("700"));
    assertEquals("Aštuoni šimtai", number("800"));
    assertEquals("Devyni šimtai", number("900"));
    assertEquals("Šimtas vienuolika", number("111"));
    assertEquals("Du šimtai septyniasdešimt du", number("272"));
    assertEquals("Trys šimtai aštuoniasdešimt septyni", number("387"));
    assertEquals("Keturi šimtai keturiasdešimt aštuoni", number("448"));
    assertEquals("Penki šimtai šešiasdešimt devyni", number("569"));
    assertEquals("Šeši šimtai dvidešimt penki", number("625"));
    assertEquals("Septyni šimtai septyniasdešimt septyni", number("777"));
    assertEquals("Septyni šimtai aštuoniasdešimt du", number("782"));
    assertEquals("Aštuoni šimtai devyniasdešimt penki", number("895"));
    assertEquals("Devyni šimtai devyniasdešimt devyni", number("999"));
    assertEquals("Tūkstantis", number("1000"));
    assertEquals("Du tūkstančiai", number("2000"));
    assertEquals("Trys tūkstančiai", number("3000"));
    assertEquals("Keturi tūkstančiai", number("4000"));
    assertEquals("Penki tūkstančiai", number("5000"));
    assertEquals("Septyni tūkstančiai šeši šimtai trisdešimt keturi", number("7634"));
    assertEquals("Vienuolika tūkstančių", number("11000"));
    assertEquals("Penkiolika tūkstančių", number("15000"));
    assertEquals("Dvidešimt vienas tūkstantis", number("21000"));
    assertEquals("Dvidešimt du tūkstančiai", number("22000"));
    assertEquals("Dvidešimt keturi tūkstančiai šimtas devyniasdešimt", number("24190"));
    assertEquals("Šeši šimtai penkiasdešimt trys tūkstančiai", number("653000"));
    assertEquals("Du šimtai vienuolika tūkstančių", number("211000"));
    assertEquals("Šimtas dvidešimt trys tūkstančiai keturi šimtai penkiasdešimt keturi",
        number("123454"));
    assertEquals("Septyni šimtai tūkstančių", number("700000"));
    assertEquals("Septyni šimtai penkiasdešimt vienas tūkstantis du šimtai dvidešimt vienas",
        number("751221"));
    assertEquals(
        "Devyni šimtai devyniasdešimt devyni tūkstančiai devyni šimtai devyniasdešimt devyni",
        number("999999"));
    assertEquals("Vienas milijonas", number("1000000"));
    assertEquals("Du milijonai", number("2000000"));
    assertEquals("Penki milijonai", number("5000000"));
    assertEquals("Septyni milijonai du šimtai vienuolika tūkstančių", number("7211000"));
    assertEquals(
        "Dvidešimt trys milijonai keturi šimtai trisdešimt septyni tūkstančiai du šimtai "
            + "devyniolika",
        number("23437219"));
    assertEquals("Šimtas milijonų", number("100000000"));
    assertEquals(
        "Šimtas dvidešimt trys milijonai keturi šimtai penkiasdešimt šeši tūkstančiai septyni "
            + "šimtai aštuoniasdešimt devyni",
        number("123456789"));
    assertEquals(
        "Trys šimtai dvidešimt du milijonai aštuoniasdešimt devyni tūkstančiai aštuoni šimtai "
            + "devyniasdešimt",
        number("322089890"));
    assertEquals("Vienas milijardas", number("1000000000"));
    assertEquals(
        "Du milijardai šimtas keturiasdešimt septyni milijonai keturi šimtai aštuoniasdešimt "
            + "trys tūkstančiai šeši šimtai keturiasdešimt septyni",
        number("2147483647"));
  }

  public static String number(String number) {
    return Numbertext.numbertext(number, "lt_LT");
  }

  public static String money(String money) {
    return Numbertext.moneytext(money, "EUR", "lt_LT");
  }

}
