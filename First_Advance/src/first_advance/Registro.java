/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_advance;

import java.util.ArrayList;

/*oo	Crear Campos
o	Listar Campos
o	Modificar Campos
o	Borrar Campos



/**
 *
 * @author JEAN WAHLUNG
 */
public class Registro {
    ArrayList<Campo> campos = new ArrayList<Campo>();
    ArrayList<String> typefield = new ArrayList<String>();
    public void CrearC(String name, int size , String contenido){
        Campo camp= new Campo(name,size,contenido);
        campos.add(camp);
        typefield.add(name);
    }
    public void ListarC(){
        for (int i = 0; i < campos.size(); i++) {
            System.out.println(campos.toString());
        }
    }
    
    public void BorrarCampo(int position){
        campos.remove(position);
    }
}
