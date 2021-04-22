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
public abstract class Animales {
        private Integer id;
	private String nombre;
	private Integer edad;
	private Integer tipo;
	
	public Animales(Integer id, String nombre, Integer tipo, Integer edad ) {
		this.id = id;
                this.nombre = nombre;
                this.tipo = tipo;
                this.edad = edad;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animales{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", tipo=" + tipo + '}';
    }

	
}
