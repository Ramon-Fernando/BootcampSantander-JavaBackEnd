package Intermediate.LivrariaOnline;

public class Livro {

	private String titulo;
	private String autor;
	private Double preço;
	
	public Livro() {
	}

	public Livro(String titulo, String autor, Double preço) {
		this.titulo = titulo;
		this.autor = autor;
		this.preço = preço;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "Livro: " + titulo + ". Autor: " + autor + ". Preco: " + preço;
	}
		
}
