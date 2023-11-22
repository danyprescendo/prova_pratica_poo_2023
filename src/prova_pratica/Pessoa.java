package prova_pratica;

public class Pessoa extends Transito {
    private String nome;
    private int idade;
    private char sexo;
    private boolean condutor;
    private boolean embriagado;


    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.condutor = false;
        this.embriagado = false;
    }

    public Pessoa(String nome, int idade, char sexo, boolean condutor, boolean embriagado) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.condutor = condutor;
        this.embriagado = embriagado;
    }

    public boolean Condutor() {
        return condutor;
    }

    public boolean Embriagado() {
        return embriagado;
    }

    @Override
    public String toString() {
        return "Vítma [Nome -> " + nome + ", idade=" + idade + " anos" + "(Sexo " + sexo +")";

    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isCondutor() {
		return condutor;
	}

	public void setCondutor(boolean condutor) {
		this.condutor = condutor;
	}

	public boolean isEmbriagado() {
		return embriagado;
	}

	public void setEmbriagado(boolean embriagado) {
		this.embriagado = embriagado;
	}
    
    
}   
