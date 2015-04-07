package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaRemove {

	public static void main(String[] args) {
		
		// pronto para remover Funcionario
		Funcionario funcionario = new Funcionario();
		funcionario.setId((long) 1);
		
		// grave nessa conexao
		FuncionarioDao dao = new FuncionarioDao();
		
		// método da classe FuncionarioDao
		dao.remove(funcionario);

		System.out.println("Removido!");

	}

}
