/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author EnriqueJosé
 */
public class Animal extends Animales {
    
    String mote;
    
   public Animal(Integer id, String nombre, Integer tipo, Integer edad) {
            super(id, nombre, tipo , edad);
            this.mote = nombre;
	}

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    @Override
    public String toString() {
        return super.toString() + " Animal{" + "mote=" + mote + '}';
    }

    
  
		
}
