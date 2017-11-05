package first_advance;

import java.util.ArrayList;

public class Record {

    ArrayList<Field> fields = new ArrayList();

    public Record() {
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }

    public void setField(Field field) {
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
