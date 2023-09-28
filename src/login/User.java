package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class User {
public Connection  conectarBD() {
	Connection  conn = null;
	return conn;
	
	try {
		Class.forName("com.mysql.Driver.Manager").newInstance();
		String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
		conn = DriverManager.getConnection(url);
		
		
	}catch(Exeption e) {}
	return conn; }
	
	public String nome = "";
	public boolean result  = false ;
	public boolean verificarUsuario(String login, String senha) {
		String sql = "";	
		Connection conn = conectarBD();
		//INTRUCAO SQL
		sql += "select nome from usuario ";
		sql +="where login  =  "+"'"+ login + "'";
		sql += "and senha =" + "'" + senha + "';"';
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
			result = true;
			nome = rs.getString("nome");}				
}catch (Exeption e) { }
return result;		
}// fim da class
