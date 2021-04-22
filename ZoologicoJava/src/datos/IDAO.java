/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author EnriqueJosé
 */
public interface IDAO {
        public ArrayList listar( String condicion );
	public void insertar( Object obj );
	public void modificar ( Object obj );
	public void eliminar ( Object obj );
}
