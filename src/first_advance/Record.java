package first_advance;

import java.util.ArrayList;

public class Record {
    String tregistro;

    @Override
    public String toString() {
        return tregistro;
    }

    public String getTregistro() {
        return tregistro;
    }

    public void setTregistro(String tregistro) {
        this.tregistro = tregistro;
    }
    ArrayList<Field> fields = new ArrayList();

    public Record(String registro) {
        tregistro=registro;
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }

    public void AddField(Field field) {
        fields.add(field);
    }

    public void listFields() {
        for (int i = 0; i < fields.size(); i++) {
            System.out.println(fields);
        }
    }

    public void deleteField(int position) {
        fields.remove(position);
    }
}

