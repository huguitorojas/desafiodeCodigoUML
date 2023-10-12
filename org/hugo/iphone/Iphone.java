package org.hugo.iphone;

public class Iphone {

	private Telefone telefone;

	private ReprodutorMusical repMusical;

	private NavegadorInternet navegador;

	public Iphone(Telefone telefone, ReprodutorMusical repMusical, NavegadorInternet navegador) {
		this.telefone = telefone;
		this.repMusical = repMusical;
		this.navegador = navegador;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public ReprodutorMusical getRepMusical() {
		return repMusical;
	}

	public NavegadorInternet getNavegador() {
		return navegador;
	}

	@Override
	public String toString() {
		return "Iphone{" +
				"telefone=" + telefone +
				", repMusical=" + repMusical +
				", navegador=" + navegador +
				'}';
	}
}
