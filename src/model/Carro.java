package model;

import java.util.Objects;

public class Carro {
	private String modelo;
	private String cor;
	private String placa;
	private int crachaApartamento;

	public Carro() {

	}

	public Carro(String modelo, String cor, String placa, int crachaApartamento) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.crachaApartamento = crachaApartamento;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCrachaApartamento() {
		return crachaApartamento;
	}

	public void setCrachaApartamento(int crachaApartamento) {
		this.crachaApartamento = crachaApartamento;
	}

	@Override
	public int hashCode() {
		return (this.crachaApartamento / 100) - 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(cor, other.cor) && crachaApartamento == other.crachaApartamento
				&& Objects.equals(modelo, other.modelo) && Objects.equals(placa, other.placa);
	}

}
