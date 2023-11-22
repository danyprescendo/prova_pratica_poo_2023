package prova_pratica;

import java.util.ArrayList;
import java.util.List;

public class Veiculo extends Transito {
	
	private int anoFabricacao;
	private List<Pessoa> pessoas;
	private boolean veiculoCarga;
	private double carga;
	
	public Veiculo() {
	}
	
	public Veiculo(int anoFabricacao) {
		super("Veículo");
        this.anoFabricacao = anoFabricacao;
        this.pessoas = new ArrayList<>();
        this.veiculoCarga = false;
    }
	
	public Veiculo(int anoFabricacao, double carga) {
		super("Veículo de Carga");
		this.anoFabricacao = anoFabricacao;
        this.pessoas = new ArrayList<>();
        this.veiculoCarga = true;
        this.carga = carga;
	}
	
	public void adicionarPessoa(Pessoa p) {
		pessoas.add(p);
		
	}
	
	public Pessoa getCondutor() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.Condutor()) {
                return pessoa;
            }
        }
        return null; 
    }
	
	@Override
	public String toString() {
		return "Dados do Veiculo \n" + "Ano de Fabricação: " + anoFabricacao + "\n" + "Ocupantes: " + pessoas;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public boolean isVeiculoCarga() {
		return veiculoCarga;
	}

	public void setVeiculoCarga(boolean veiculoCarga) {
		this.veiculoCarga = veiculoCarga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}


}
