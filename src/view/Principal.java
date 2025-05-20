package view;

import br.lucassbatista.ed.ListaEncadeada;
import controller.ApartamentosController;
import model.Carro;
import model.Morador;

public class Principal {
	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {
		ApartamentosController control = new ApartamentosController();
		ListaEncadeada<Morador> listaMoradores = new ListaEncadeada<>();

		int[] numApartamento = { 101, 102, 201, 202, 301, 302, 401, 402, 501, 502, 601, 602, 701, 702, 801, 802, 901,
				902, 1001, 1002 };

		String[] nome = { "Ana", "Bruno", "Carla", "Diego", "Eduarda", "Felipe", "Gabriela", "Henrique", "Isabela",
				"João", "Katia", "Lucas", "Mariana", "Nicolas", "Olivia", "Paulo", "Quintino", "Rafaela", "Samuel",
				"Tatiane" };

		String[] modelo = { "Fiat Uno", "Honda Civic", "Toyota Corolla", "Chevrolet Onix", "Volkswagen Gol",
				"Renault Kwid", "Ford Ka", "Hyundai HB20", "Jeep Renegade", "Peugeot 208" };
		String[] cor = { "Preto", "Branco", "Vermelho", "Azul", "Prata", "Cinza", "Verde", "Amarelo", "Marrom",
				"Laranja" };
		String[] placa = { "ABC-1234", "DEF-5678", "GHI-9012", "JKL-3456", "MNO-7890", "PQR-1122", "STU-3344",
				"VWX-5566", "YZA-7788", "BCD-9900" };

		try {
			// Lista com objetos Morador
			for (int i = 0; i < 10; i++) {
				if (i == 0) {
					listaMoradores.addFirst(new Morador(numApartamento[i], nome[i],
							new Carro(modelo[i], cor[i], placa[i], numApartamento[i])));
				} else {
					listaMoradores.addLast(new Morador(numApartamento[i], nome[i],
							new Carro(modelo[i], cor[i], placa[i], numApartamento[i])));
				}
			}

			// Monta HashTable
			while (!listaMoradores.isEmpty()) {
				control.cadastrarMorador(listaMoradores.get(listaMoradores.size() - 1));
				listaMoradores.removeLast();

			}

			Morador morador = new Morador(numApartamento[5], nome[5],
					new Carro(modelo[5], cor[5], placa[5], numApartamento[5]));
			
			control.consultarMorador(morador);
			control.excluirMorador(morador);
			control.listarMoradoresPorAndar();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
