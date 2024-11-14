package avaliacao;

import javax.swing.JOptionPane;

public class AtividadeComplementar {

    String[] nomeAtletas = new String[10];
    boolean[] provaCompletada = new boolean[10];
    double[] tempoDeProva = new double[10];
    int[] voltasCompletadas = new int[10];
    int quantidadeDeAtletas = 0;
    int[] resultadosRegistrados = new int[10];

    public int mostrarMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de opções:\n"
                + "Cadastrar atleta na competição;\n"
                + "Registrar resultado de um atleta (completar prova, tempo de conclusão e voltas completadas);\n"
                + "Exibir relatório completo dos atletas;\n"
                + "Exibir relatório de atletas que completaram a prova;\n"
                + "Exibir relatório de atletas que não completaram a prova;\n"
                + "Exibir o atleta que concluiu a prova no menor tempo;\n"
                + "Exibir o número total de voltas completadas por todos os atletas;\n"
                + "Sair da aplicação.\n"
                + "Requisitos:\n"
                + "Cadastrar atleta: Ao cadastrar um atleta, você deve armazenar o nome no vetor e definir os \n"
                + "valores de completouProva para false, o tempo para 0.0, e as voltas completadas para 0."));
    }

    public static void main(String[] args) {
        AtividadeComplementar ac = new AtividadeComplementar();
        int op;

        do {
            op = ac.mostrarMenu();
            switch (op) {
                case 1:
                    ac.cadastrarAtleta();
                    break;
                case 2: 
                    ac.registrarResultado();
                    break;
                    
            }
        } 
        
    
    
    }

    public void cadastrarAtleta() {
        nomeAtletas[quantidadeDeAtletas] = JOptionPane.showInputDialog(null, "Informe o nome do atleta!");
        provaCompletada[quantidadeDeAtletas] = false;
        voltasCompletadas[quantidadeDeAtletas] = 0;
        quantidadeDeAtletas++;
        
    }
    
    public void registrarResultado(){
    JOptionPane.showMessageDialog(null,"Registrar resultado do Atleta");
    resultado
    }
}

