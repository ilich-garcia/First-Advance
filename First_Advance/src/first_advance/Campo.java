
package first_advance;


public class Campo {
    private String name;
    private int size;
    private String contenido;

    public Campo(String name, int size, String contenido) {
        this.name = name;
        this.size = size;
        this.contenido = contenido;
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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
    
    public void ModificarCampo(String name, int size, String contenido){
        this.name = name;
        this.size = size;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return  "nombre: " + name + " El tamaño es :" + size + ", contenido :" + contenido + '}';
    }
    
   
    
  
    
}
