package objetos;

public class ONG {
	private int id;
	private String nome;
	private String site;
	private Causa causa;
	public ONG(int id, String nome, String site, Causa causa) {
		this.id = id;
		this.nome = nome;
		this.site = site;
		this.causa = causa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Causa getCausa() {
		return causa;
	}
	public void setCausa(Causa causa) {
		this.causa = causa;
	}
	
}
