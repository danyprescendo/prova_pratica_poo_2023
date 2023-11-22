package prova_pratica;

public class Rodovia extends Transito {

	private String sigla;
	private String periculosidade;
	
	public Rodovia(String nome, String sigla, String string3) {
	}
	
	public Rodovia(String sigla, String periculosidade) {
        super(sigla);
        this.periculosidade = periculosidade;
    }
	
	@Override
	public String toString() {
		return "Rodovia " + getSigla() + "("+ periculosidade + " periculosidade)";
	}

	public String getSigla() {
		return sigla;
	}

	public String getPericulosidade() {
		return periculosidade;
	}

	public void setPericulosidade(String periculosidade) {
		this.periculosidade = periculosidade;
	}

}