package model;

import java.util.Objects;

public class Morador {
	private int numApartamento;
	private String nomeMorador;
	private Carro carro;

	public Morador() {

	}

	public Morador(int numApartamento, String nomeMorador, Carro carro) {
		super();
		this.numApartamento = numApartamento;
		this.nomeMorador = nomeMorador;
		this.carro = carro;
	}

	public int getNumApartamento() {
		return numApartamento;
	}

	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}

	public String getNomeMorador() {
		return nomeMorador;
	}

	public void setNomeMorador(String nomeMorador) {
		this.nomeMorador = nomeMorador;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	@Override
	public int hashCode() {
		return carro.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return Objects.equals(carro, other.carro) && Objects.equals(nomeMorador, other.nomeMorador)
				&& numApartamento == other.numApartamento;
	}

	@Override
	public String toString() {
		String print = "Morador(a) " + nomeMorador + ", apt. " + numApartamento + " | " + carro.getModelo() + " " + carro.getCor() + " " + carro.getPlaca();

		return null;
	}

}
