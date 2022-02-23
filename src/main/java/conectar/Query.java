package conectar;

/*Essa clase � respons�vel por executar Querys no banco de dados, como insert e select.
 *  ela tem a fun��o de devolver os objetos montados a qualquer classe que fizer a solicita��o
 */

import java.sql.ResultSet;
import java.util.ArrayList;

import objetos.Causa;
import objetos.ONG;

public class Query  {
	
	private Conexao con = new Conexao();

	//m�todo respons�vel por inserir uma nova Ong no banco de dados
	public boolean insertONG(ONG ong) {
		
		return false;
	 
	}
	//m�todo respons�vel por inserir uma nova causa no banco de dados

	public boolean insertCausa(Causa causa) { 
		return false;
	 
	}
	/*m�todo respons�vel por realizar a query de todas as ongs e transformalos em objetos.
	 ela retorna um ArrayList de ONG.
	 */
	
	public ArrayList<ONG> selectONG() {
		ArrayList<ONG> ongs = new ArrayList();
		try {
			con.criarConexao();
			ResultSet rs = con.getStatement().executeQuery("select * from ong");
			while(rs.next()) {
				ongs.add(new ONG(rs.getInt(1),rs.getString(2),rs.getString(3),selectCausa(rs.getInt("Causa"))));
			}
		}catch(Exception e) {
			
		}
		return ongs;
	 
	}
	/*m�todo respons�vel por realizar a query de todas as causas e transformalos em objetos.
	 ela retorna um ArrayList de ONG.
	 */
	public ArrayList<Causa> selectCausa() {
		ArrayList<Causa> array = new ArrayList();
		try {
			
			con.criarConexao();
			ResultSet rs = con.getStatement().executeQuery("select * from causa");
			while(rs.next()) {
				array.add(new Causa(rs.getInt(1),rs.getString(2)));		
			}
		}catch(Exception e) {
			
		}
		return array;
	 
	}
	/* m�todo respons�vel por realizar a query de uma causa especifica atrav�s de seu ID e 
	 * transformar a mesma em um objeto ela retorna um objeto Causa.
	 */
	public Causa selectCausa(int id) {
		Causa causa = new Causa();
		try {
			
			con.criarConexao();
			ResultSet rs = con.getStatement().executeQuery("select * from causa where id = "+id);
			while(rs.next()) {
				causa.setId(rs.getInt(1));
				causa.setNome(rs.getString(2));
			}
		}catch(Exception e) {
			
		}
		return causa;
	 
	}
}
