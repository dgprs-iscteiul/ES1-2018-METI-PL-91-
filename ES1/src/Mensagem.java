
public class Mensagem {

	private int id;
	private String data;
	private String canal;
	private String origem;
	private String titulo;
	private String conteudo;
	
	public Mensagem(int id, String data, String canal, String origem, String titulo, String conteudo) {
		this.id = id;
		this.data = data;
		this.canal = canal;
		this.origem = origem;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getData() {
		return data;
	}
	
	public String getCanal() {
		return canal;
	}

	public String getOrigem() {
		return origem;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
}