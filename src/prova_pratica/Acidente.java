package prova_pratica;

import java.util.ArrayList;
import java.util.List;

public class Acidente extends Transito{
	
	private Rodovia rodovia;
    private int vitimasFatais;
    private int feridos;
    private int mes;
    private List<Veiculo> veiculosEnvolvidos;

	public Acidente(Rodovia rodovia1, int i, int j, int k, Object object) {
	}
	
	public Acidente(Rodovia rodovia, int vitimasFatais, int feridos, int mes) {
		super("Acidente");
        this.rodovia = rodovia;
        this.vitimasFatais = vitimasFatais;
        this.feridos = feridos;
        this.mes = mes;
        this.veiculosEnvolvidos = new ArrayList<>();
    }
	
	@Override
	public String toString() {
		return "Dados do Acidente" + "\n\n" + "Rodovia: " + rodovia + "\n" + vitimasFatais + " Vítmas Fatais" + "\n" + feridos + " Feridos" + "\n" + "Mês: " + mes + "\n" + veiculosEnvolvidos;
	}
	
	public Rodovia getRodovia() {
		return rodovia;
	}
	public void setRodovia(Rodovia rodovia) {
		this.rodovia = rodovia;
	}
	public int getVitimasFatais() {
		return vitimasFatais;
	}
	public void setVitimasFatais(int vitimasFatais) {
		this.vitimasFatais = vitimasFatais;
	}
	public int getFeridos() {
		return feridos;
	}
	public void setFeridos(int feridos) {
		this.feridos = feridos;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public List<Veiculo> getVeiculosEnvolvidos() {
		return veiculosEnvolvidos;
	}
	public void setVeiculosEnvolvidos(List<Veiculo> veiculosEnvolvidos) {
		this.veiculosEnvolvidos = veiculosEnvolvidos;
	}

	public static List<Acidente> listarPorPericulosidade(List<Acidente> acidentes, String periculosidade) {
		List<Acidente> acidentesPer= new ArrayList<>();
		
		for(Acidente acidente: acidentes) {
			if(acidente.getRodovia().getPericulosidade().equals(periculosidade.toUpperCase())) {
				acidentesPer.add(acidente);
			}
		}
		return acidentesPer;
	}

}