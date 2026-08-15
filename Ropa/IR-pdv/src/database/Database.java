package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	//informaçoes do banco de dados
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/ropa";
	private String user = "root";
	private String password = "";
	
	//metodo(função) para conectar o banco
	public Connection conectar() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, password); //abre a conexão com o banco
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}

	//metodo para testar a conexão (status de conexão)
	public boolean testarConecxao() {
		//a linha abaixo cria o objeto con que é responsavel por estabelecer a conexão com o banco
		Connection con = conectar();
		
		//se nao conseguir restabelecer a conexao
		if (con == null) {
			return false;
		}
		
		//na tentativa de fechar a conexao
		try {
			con.close(); //encerrar a coonexao após o teste
			return true; //retorno verdadeiro para main
		} catch (Exception e) {
			//se nao consegir fechar a conexao
			System.out.println(e);
			return false;
		}
	}
	
	
}
