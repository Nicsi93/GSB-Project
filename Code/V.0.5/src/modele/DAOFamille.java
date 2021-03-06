package modele;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.Vector;

import metiers.Visiteur;

public class DAOFamille extends DAO<Visiteur> {
	
	public DAOFamille(Connection conn) {
		super(conn);
	}


	public Hashtable getAllFamille() throws SQLException{
		
		Hashtable toReturn=new Hashtable();
		Statement st=connect.createStatement();
		String sql ="SELECT * FROM famille";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			toReturn.put(rs.getString("FAM_CODE"),rs.getString("FAM_LIBELLE"));
		}
		
		return toReturn;
	}



}
