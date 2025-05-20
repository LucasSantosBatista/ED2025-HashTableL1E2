package controller;

import model.Morador;

public interface IApartamentosController {

	public void cadastrarMorador(Morador morador);

	public Morador consultarMorador(Morador morador) throws Exception;
	
	public void excluirMorador(Morador morador) throws Exception;
	
	public void listarMoradoresPorAndar() throws Exception;

}
