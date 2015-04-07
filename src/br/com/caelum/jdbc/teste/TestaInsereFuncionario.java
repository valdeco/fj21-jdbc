package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereFuncionario {

	public static void main(String[] args) {
		
		// pronto para gravar Funcionario
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Leandro");
		funcionario.setUsuario("leh");
		funcionario.setSenha("1111");

		// grave nessa conexao
		FuncionarioDao dao = new FuncionarioDao();

		// método elegante
		dao.adiciona(funcionario);

		System.out.println("Gravado!");

	}

}
