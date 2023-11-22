package prova_pratica;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoDeTransito {
    private static List<Rodovia> rodovias = new ArrayList<>();
    private static List<Acidente> acidentes = new ArrayList<>();

    public static void cadastrarRodovia(Rodovia rodovia) {
        rodovias.add(rodovia);
    }

    public static void cadastrarAcidente(Acidente acidente) {
        acidentes.add(acidente);
    }

    public static List<Acidente> listarAcidentesComCondutorEmbriagado() {
        List<Acidente> acidentesEmbriagados = new ArrayList<>();
        for (Acidente acidente : acidentes) {
            for (Veiculo veiculo : acidente.getVeiculosEnvolvidos()) {
                Pessoa condutor = veiculo.getCondutor();
                if (condutor != null && condutor.Embriagado()) {
                    acidentesEmbriagados.add(acidente);
                    break; 
                }
            }
        }
        return acidentesEmbriagados;
    }

    public static void listarQuantidadeAcidentesPorPericulosidade() {
        int alto = 0, medio = 0, baixo = 0;

        for (Acidente acidente : acidentes) {
            Rodovia rodovia = acidente.getRodovia();
            if (rodovia != null) {
                String periculosidade = rodovia.getPericulosidade();
                switch (periculosidade) {
                    case "Alto":
                        alto++;
                        break;
                    case "Médio":
                        medio++;
                        break;
                    case "Baixo":
                        baixo++;
                        break;
                }
            }
        }

        System.out.println("Quantidade de Acidentes por Periculosidade:");
        System.out.println("Alto: " + alto);
        System.out.println("Médio: " + medio);
        System.out.println("Baixo: " + baixo);
    }

    public static void main(String[] args) {
        Rodovia rodovia1 = new Rodovia("BR-101", "Alto");
        Rodovia rodovia2 = new Rodovia("BR-202", "Médio");

        Pessoa condutor1 = new Pessoa("Dany Pablo", 30, 'M');
        Pessoa condutor2 = new Pessoa("Isadora", 25, 'F');

        Veiculo veiculo1 = new Veiculo(2020);
        veiculo1.adicionarPessoa(condutor1);

        Veiculo veiculo2 = new Veiculo(2015);
        veiculo2.adicionarPessoa(condutor2);

        Acidente acidente1 = new Acidente(rodovia1, 2, 3, 5);
        acidente1.getVeiculosEnvolvidos().add(veiculo1);

        Acidente acidente2 = new Acidente(rodovia2, 1, 1, 8);
        acidente2.getVeiculosEnvolvidos().add(veiculo2);

        cadastrarRodovia(rodovia1);
        cadastrarRodovia(rodovia2);
        cadastrarAcidente(acidente1);
        cadastrarAcidente(acidente2);

        List<Acidente> acidentesEmbriagados = listarAcidentesComCondutorEmbriagado();
        System.out.println("Acidentes com Condutor Embriagado: " + acidentesEmbriagados);

        listarQuantidadeAcidentesPorPericulosidade();
    }
}
