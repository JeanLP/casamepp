package teste;

import DAO.PessoaDAO;
import beans.Pessoa;

public class TestaHibernate {
	
	public static void main(String... args){
		PessoaDAO pdao = new PessoaDAO();
		Pessoa p = new Pessoa();
		p.setNome("JEAN");
		p.setId(1);
		pdao.merge(p);
	}
		
}
