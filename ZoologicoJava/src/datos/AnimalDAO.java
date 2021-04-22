/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author EnriqueJosé
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import modelo.Animal;

public class AnimalDAO implements IDAO{
    
    Connection con = null;
    ArrayList<Animal> lista = new ArrayList<>();
    Animal animalObj = null;
    PreparedStatement ps;
	
    public AnimalDAO() {
	con = new Conexion().conectar();
    }

	@Override
	public ArrayList listar(String condicion) {
            try {
		String SSQL = "SELECT * FROM Animal" + condicion;
		ps = con.prepareStatement(SSQL);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
                    animalObj = new Animal(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt ("tipo"),
                        rs.getInt("edad")
                    );
	
                    lista.add(animalObj);	
		}
                    return lista;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	
		return null;
	}

	@Override
	public void insertar(Object obj) {
		try {
			animalObj = (Animal) obj;
			String SSQL =  "INSERT INTO Animal (nombre, tipo, edad) VALUES(?, ?, ? )";
			ps = con.prepareStatement(SSQL);
			ps.setString(1, animalObj.getNombre());
			ps.setInt(2, animalObj.getTipo());
			ps.setInt(3, animalObj.getEdad());
			ps.executeUpdate();			
		} catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}

	@Override
	public void modificar(Object obj) {
		try {
			animalObj = (Animal) obj;
			String SSQL =  "UPDATE  Animal SET nombre= ?, tipo=?, edad=? WHERE id=?";
			ps = con.prepareStatement(SSQL);
			ps.setString(1, animalObj.getNombre());
			ps.setInt(2, animalObj.getTipo());
			ps.setInt(3, animalObj.getEdad());
                        ps.setInt(4, animalObj.getId());
			ps.executeUpdate();			
		} catch (SQLException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}

	@Override
	public void eliminar(Object obj) {
		try {
		animalObj = (Animal) obj;
		String SSQL =  "DELETE FROM  Animal WHERE id= ?";
		ps = con.prepareStatement(SSQL);
		ps.setInt(1, animalObj.getId());
		ps.executeUpdate();			
	} catch (SQLException e) {
	JOptionPane.showMessageDialog(null, e.getMessage());
	}		
    }
}
