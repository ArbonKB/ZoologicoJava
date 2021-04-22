/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author EnriqueJosé
 */
public class Conexion {
        private String db = "DBZoologico";
	private String url = "jdbc:postgresql://localhost:5432/"+db;
	private String user = "postgres";
	private String pass = "basededatos1*";
	private String driver = "org.postgresql.Driver";
	
	public Connection conectar() {
		
		try {
			Class.forName( driver );
			Connection link = null;
			link = DriverManager.getConnection(url, user, pass);
			return link;
			
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		return null;
	}
}
