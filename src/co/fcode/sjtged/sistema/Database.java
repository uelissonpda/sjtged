package co.fcode.sjtged.sistema;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database implements Runnable{
	Thread processo;
	String nomeProcesso;
	
	static Connection conn;
	static Statement st;
	static ResultSet rs;
	
	/* Conexão com SQL */
	// -- Acesso ao Banco da Alterdata (Produção)
	public static String urlAlterdata = "jdbc:sqlserver://192.168.100.220:64363;databaseName=ALTERDATA_PACK"; // @production
	//public static String urlAlterdata = "jdbc:sybase:Tds:192.168.100.216:2638?ServiceName=contabil"; // @production
	//public static String urlAlterdata = "jdbc:sqlserver://177.207.207.148:49398;databaseName=ALTERDATA"; // @home
	// SQL RESERVA
	//public static String urlAlterdata = "jdbc:sqlserver://192.168.100.204:49996;databaseName=ALTERDATA";
	public static String userDBAlterdata = "sa";
	public static String passDBAlterdata = "#abc123#";
	//public static String userDBAlterdata = "externo"; dominio
	//public static String passDBAlterdata = "externo"; dominio

	@Override
	public void run() {}
}
