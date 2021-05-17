package uiAutomation;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReding {

    public void readExcel(String filePath,String fileName,String sheetName) throws IOException, IOException {
        File file =    new File(filePath + fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook guru99Workbook = null;
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        /*if(fileExtensionName.equals(".xlsx")){
            guru99Workbook = new XSSFWorkbook(inputStream);
        }*/
        if(fileExtensionName.equals(".xls")){
            guru99Workbook = new HSSFWorkbook(inputStream);
        }
        Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
        int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
        for (int i = 0; i < rowCount+1; i++) {
            Row row = guru99Sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        ExcelReding objExcelFile = new ExcelReding();
        //String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
        String filePath = System.getProperty("user.dir") + "/src/main/java/uiAutomation/";
        objExcelFile.readExcel(filePath,"tests-example.xls","Example Test");
    }
}
