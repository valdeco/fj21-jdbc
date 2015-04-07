package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaRemove {

	public static void main(String[] args){

		// pronto para remover Funcionario
		Funcionario funcionario = new Funcionario();
		funcionario.setId((long) 4);

		// grave nessa conexao
		FuncionarioDao dao = new FuncionarioDao();

		// metodo remover da classe FuncionarioDao
		dao.remove(funcionario);

		System.out.println("Funcionario removido com sucesso!");

	}

}
