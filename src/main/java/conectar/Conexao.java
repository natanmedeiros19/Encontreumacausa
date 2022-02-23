package conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public boolean criarConexao() throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/ongs?useTimezone=true&serverTimezone=UTC","root","QtpdMPm@ZFjW");
			statement = connect.createStatement();
			
			return true;
		}catch(Exception e) {
			System.out.print(e);
			return false;
		}
	}
	public boolean fecharConexao() throws Exception{
		try {
			connect.close();			
			statement.close();
			return true;
		}catch(Exception e) {
			System.out.print(e);
			return false;
		}
	}
	public Connection getConnect() {
		return connect;
	}
	public void setConnect(Connection connect) {
		this.connect = connect;
	}
	public Statement getStatement() {
		return statement;
	}
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	public PreparedStatement getPreparedStatement() {
		return preparedStatement;
	}
	public void setPreparedStatement(PreparedStatement preparedStatement) {
		this.preparedStatement = preparedStatement;
	}
	public ResultSet getResultSet() {
		return resultSet;
	}
	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}	
	
}