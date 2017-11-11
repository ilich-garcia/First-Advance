package first_advance;

public class Field {

    private String name;
    private int size;
    private String content;

    public Field(String name, int size, String content) {
        this.name = name;
        this.size = size;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void ModificarCampo(String name, int size, String content) {
        this.name = name;
        this.size = size;
        this.content = content;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
