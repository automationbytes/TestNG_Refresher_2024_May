package Util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class ExcelReade {
    public static String ReadExcel(String Label, String Header) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("src/test/resources/DataSheet/Datasheet1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("DevopsUniv");
        int noofRows = sheet.getPhysicalNumberOfRows();
        int noofCols = sheet.getRow(0).getLastCellNum();
        System.out.println(noofRows);
        System.out.println(noofCols);

        String[] LabelValue = new String[noofRows];
        String[] HeaderValue = new String[noofCols];

//        for (int i = 0; i < noofRows; i++) {
//            LabelValue[i] = sheet.getRow(i).getCell(0).getStringCellValue();
//        }
//        System.out.println(Arrays.toString(LabelValue));
//
//        for (int j = 0; j < noofCols; j++) {
//            HeaderValue[j] = sheet.getRow(0).getCell(j).getStringCellValue();
//        }
//
//        System.out.println(Arrays.toString(HeaderValue));
        String val = "";
        for (int i = 0; i < noofRows; i++) {
            LabelValue[i] = sheet.getRow(i).getCell(0).getStringCellValue();

            if (LabelValue[i].equalsIgnoreCase(Label)) {
                for (int j = 0; j < noofCols; j++) {
                    HeaderValue[j] = sheet.getRow(0).getCell(j).getStringCellValue();
                    if (HeaderValue[j].equalsIgnoreCase(Header)) {
                        val = sheet.getRow(i).getCell(j).getStringCellValue();
                        break;
                    }
                }
                break;
            }

        }
        System.out.println("Value from excel wil be "+ val);
        return val;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(ReadExcel("Facebook","URL"));
    }
}
