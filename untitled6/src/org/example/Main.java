package org.example;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\olegv\\IdeaProjects\\untitled6\\numbers.xlsx");
            File file = new File("C:\\Users\\olegv\\IdeaProjects\\untitled6\\numbers.txt");
            FileWriter fileWriter = new FileWriter(file);
            Workbook ex = new HSSFWorkbook(fis);
            String result = ex.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
            System.out.println(result);
            fis.close();

            fileWriter.write(result);
            fileWriter.flush();

        }catch (IOException f){
            System.out.println(f);
        }
    }
}