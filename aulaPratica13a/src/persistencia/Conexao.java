package persistencia;

import java.sql.*;

public class Conexao {
	private static Connection conexao = null;

	
	private Conexao() {}
	
	public static Connection getConexao() throws ClassNotFoundException, SQLException{
		if(conexao == null) {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/contato";
			conexao = DriverManager.getConnection(url, "postgres", "postgres");
		}
		return conexao;
	}
	

}
