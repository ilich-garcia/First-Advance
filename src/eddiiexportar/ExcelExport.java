/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddiiexportar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.StringTokenizer;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Diego
 */
public abstract class ExcelExport {

    public boolean exportFile(File file, String nameFile) throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fr);
        String line = new String();
        StringTokenizer token;
        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet(nameFile);
        int row = 0;
        int colum = 0;

        try {
            line = buffer.readLine();

            while (line != null) {
                if (row == 0) {
                    HSSFRow Row = sheet.createRow(row);
                    token = new StringTokenizer(line, "|", false);

                    while (token.hasMoreElements()) {
                        String record = token.nextToken();
                        HSSFCell cell = Row.createCell(colum);
                        HSSFRichTextString text = new HSSFRichTextString(record);
                        text.applyFont((short) 2);

                        cell.setCellValue(text);
                        colum++;
                    }
                    colum=0;
                    row++;
                    System.out.println("Encabezado de Campos");
                } else {
                    token = new StringTokenizer(line, "*", false);
                    while (token.hasMoreElements()) {
                        HSSFRow Row = sheet.createRow(row);
                        String record = token.nextToken();
                        StringTokenizer field = new StringTokenizer(record, "|", false);
                        while (field.hasMoreElements()) {
                            HSSFCell cell = Row.createCell(colum);
                            HSSFRichTextString text = new HSSFRichTextString(field.nextToken());
                            cell.setCellValue(text);
                            colum++;
                        }
                        colum=0;
                        row++;
                    }
                }
                line = buffer.readLine();
                

            }
            FileOutputStream fichero = new FileOutputStream(nameFile+".xls");
            book.write(fichero);
            fichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
