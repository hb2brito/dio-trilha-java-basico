import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/** Classe Principal */
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // Passo 1: Definir o salário pretendido e analisar um candidato
        System.out.println("Analisando um candidato com salário pretendido de 1800.0:");
        analizarCandidato(1800.0);

        // Passo 2: Selecionar candidatos baseados em seus salários pretendidos
        System.out.println("\nSelecionando candidatos:");
        selecaoCandidatos();

        // Passo 3: Imprimir a lista de candidatos selecionados
        System.out.println("\nImprimindo candidatos selecionados:");
        imprimirSelecionados();

        // Passo 4: Entrar em contato com um candidato específico
        System.out.println("\nEntrando em contato com o candidato Jeff:");
        entrarEmContato("Jeff");
    }

    /** Metodo para analizar candidatos */
    static void analizarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("ENTRAR EM CONTATO COM UMA CONTRA PROPOSTA");
        } else {
            System.out.println("A ESPERA DOS DEMAIS CANDIDATOS");
        }
    }

    /** Metodo para selecionar candidatos */
    static void selecaoCandidatos(){
        String[] candidatos = {"Jeff", "Mel", "Ju", "Yuri", "Tata", "Jok", "Will", "Ana", "Emy", "Edu"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }

            candidatosAtual++; // Incrementa o índice do candidato atual
        }
    }

    /** Metodo auxiliar */
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    /** Método para printar na tela os candidatos selecionados */
    static void imprimirSelecionados(){
        String[] candidatos = {"Jeff", "Mel", "Ju", "Yuri", "Tata"};
        System.out.println("Imprimindo uma lista de candidatos de acordo com o índice do elemento.");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é o " + candidatos[indice]);
        }

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    /** Método para entrar em contato com os candidatos selecionados */
    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
        
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) 
            System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " na " + tentativasRealizadas + "ª tentativa");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);
    }

    /** Método auxiliar para simular atendimento */
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
}
