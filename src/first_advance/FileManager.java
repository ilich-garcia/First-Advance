/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_advance;

import eddiiexportar.ExcelExport;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class FileManager extends ExcelExport{

    private File file;
    private ArrayList<Record> records;
    private ArrayList<String> fieldName;
    private String namePath;

    public FileManager(String namePath){

        ArrayList<Record> records = new ArrayList<>();
        ArrayList fieldName = new ArrayList<>();
        this.namePath = namePath;

    }

    public void crearArchivo(ArrayList<String> fieldName) throws IOException {
        file = new File(namePath);
        FileWriter fw = new FileWriter(file);
        BufferedWriter buff = new BufferedWriter(fw);

        for (String string : fieldName) {
            buff.write("|" + string);
        }
        buff.write("|");

        if (!fieldName.isEmpty()) {
            this.fieldName = fieldName;
        }

        buff.flush();
        buff.close();

    }

    public void saveFile() throws IOException {
        file = new File(namePath);
        FileWriter fw = new FileWriter(file);
        BufferedWriter buff = new BufferedWriter(fw);
        int contRecord = 0;
        String lineWrite = "";
        for (String string : fieldName) {
            buff.write("|" + string );
        }
        buff.write("|");
        buff.newLine();
        lineWrite += "*";
        for (int i = 0; i < records.size(); i++) {

            for (int j = 0; j < records.get(i).getFields().size(); j++) {
                lineWrite += "|" + records.get(i).getFields().get(j).getContent();
            }
            lineWrite += "|";
            lineWrite += "*";
            contRecord++;
            if (contRecord == 100) {
                buff.write(lineWrite);
                lineWrite = "";
            }
        }
        

        buff.write(lineWrite);
        lineWrite = "";
        buff.close();
        fw.close();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }

    public ArrayList<String> getFieldName() {
        return fieldName;
    }

    public void setFieldName(ArrayList<String> fieldName) {
        this.fieldName = fieldName;
    }

    public String getNamePath() {
        return namePath;
    }

    public void setNamePath(String namePath) {
        this.namePath = namePath;
    }

}
