package avaliacao;

import java.util.Scanner;

public class Avaliacao {

    Scanner entrada = new Scanner(System.in);
    String[] produtos = new String[10];
    boolean[] consertado = new boolean[10];
    boolean[] entregue = new boolean[10];
    int quantidadeDeProdutos = 0;
    double[] precoConserto = new double[10];

    public int mostrarMenu() {
        System.out.println("1.	Receber produto do cliente (cadastrar produto);\n"
                + "2.	Fazer conserto;\n"
                + "3.	Entregar o produto ao cliente;\n"
                + "4.	Exibir o relatório completo de produtos;\n"
                + "5.	Exibir o relatório de produtos que ainda não foram consertados; \n"
                + "6.	Exibir o relatório de produtos consertados, mas que ainda não foram retirados pelo cliente;\n"
                + "7.	Exibir o faturamento total da loja;\n"
                + "8.	Sair da aplicação;");
        return entrada.nextInt();
        
    }

    public static void main(String[] args) {
        Avaliacao avaliacao = new Avaliacao();
        int op;
        do {
            op = avaliacao.mostrarMenu();
            switch (op) {
                case 1:
                    avaliacao.cadastrarProduto();
                    break;
            }
        }
        
    
    }
public void cadastrarProduto(){
    System.out.println("Informe o nome do produto: ");
    produtos[quantidadeDeProdutos] = entrada.next();
    consertado[quantidadeDeProdutos] = false;
    entregue[quantidadeDeProdutos] = false;
    quantidadeDeProdutos++;

}
    public void fazerConserto() {
        System.out.println("Informe o produto a ser consertado");
        String produto = entrada.next();
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (produtos[i].equalsIgnoreCase(produto)) {
                entregue[i] = true;
                return;
            }

        }
        System.out.println("Produto não encontrado!");
    }

    public void mostrarRelatório() {
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.println(produtos[i]);
        }
    }

    public void exibirProdutosNaoConsertados() {
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (!consertado[i]) {
                System.out.println(produtos[i]);

            }

        }
    }

    public void exibirProdutosConsertadosENaoEntregues() {
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (consertado[i] && !entregue[i]) {
                System.out.println(produtos[i]);
            }

        }
    }

    public void exibirFatoramento() {
        System.out.println("*********Faturamento*********");
        double fatoramento = 0;
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            fatoramento = fatoramento + precoConserto[i];
        }
        System.out.println("Total: " + fatoramento);
    }
}
