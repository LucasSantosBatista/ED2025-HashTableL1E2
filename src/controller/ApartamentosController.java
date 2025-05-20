package controller;

import br.lucassbatista.ed.ListaEncadeada;
import model.Morador;

public class ApartamentosController implements IApartamentosController {
	ListaEncadeada<Morador>[] controleCarrosPredio;
	
	public ApartamentosController() {
		controleCarrosPredio = new ListaEncadeada[10];
	}

	@Override
	public void cadastrarMorador(Morador morador) {
		// TODO Auto-generated method stub

	}

	@Override
	public Morador consultarMorador(Morador morador) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluirMorador(Morador morador) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void listarMoradoresPorAndar() throws Exception {
		// TODO Auto-generated method stub

	}

}
