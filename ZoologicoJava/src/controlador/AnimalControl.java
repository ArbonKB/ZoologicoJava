/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;

import datos.AnimalDAO;
import datos.IDAO;

public class AnimalControl implements IDAO {

	@Override
	public ArrayList listar(String condicion) {
		
		return new AnimalDAO().listar(condicion);
	}

	@Override
	public void insertar(Object obj) {
		
		new AnimalDAO().insertar(obj);
	}

	@Override
	public void modificar(Object obj) {
		new AnimalDAO().modificar(obj);
		
	}

	@Override
	public void eliminar(Object obj) {
		
		new AnimalDAO().eliminar(obj);
	}

}
