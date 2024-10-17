package avaliacao;

import java.util.Scanner;

public class Avaliacao {

    Scanner entrada = new Scanner(System.in);
    String receberProduto[] = new String[10];
    double preco[] = new double[10];
    int quantidadeDeProdutos = 0;
    double faturamento[] = new double[10];

    public static void main(String[] args) {
        Avaliacao minhaClasse = new Avaliacao();
        minhaClasse.preencherListas();

        int opcao = 0;
        do {
            opcao = minhaClasse.mostrarMenu();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    minhaClasse.receberProduto();
                    break;
                case 2:
                    minhaClasse.fazerConserto();
                    break;
                case 3:
                    minhaClasse.entregarProdutoAoCliente();
                    break;
                case 4:
                    minhaClasse.exibirRelatorioCompletoDeProdutos();
                    break;
                case 5:
                    minhaClasse.exibirRelatorioDeProdutosQueAindaNãoForamConsertados();
                    break;
                case 6:
                    minhaClasse.produtosConsertadosQueClientesNaoRetiraram();
                    break;
                case 7:
                    minhaClasse.motrarFatoramentoTotalDaLoja();
                    break;
            }
        } while (opcao != 7);
    }

    public int mostrarMenu() {
        System.out.println("1. Receber produto do cliente \n"
                + "2. Fazer conserto \n"
                + "3. Entregar o produto ao cliente \n"
                + "4. Exibir relatorio de produtos que ainda não foram consertados \n"
                + "5. Exibir relatório de produtos consertados, mas que ainda não foram retirados pelo cliente \n"
                + "6. Exibir fatoramento total da loja \n"
                + "7. Sair da aplicação \n"
        );
        int opcaoEscolhida = entrada.nextInt();
        return opcaoEscolhida;
    }

    public void receberProduto() {
        System.out.println("Informe o nome do produto");
        receberProduto[quantidadeDeProdutos] = entrada.next();
        System.out.println("Informe o preço do produto");
        preco[quantidadeDeProdutos] = entrada.nextDouble();
        System.out.println("Informe o estoque do produto");
        preco[quantidadeDeProdutos] = entrada.nextInt();
        quantidadeDeProdutos++;
    }

    public void fazerConserto() {
        System.out.println("Informe o nome do produto vendid!");
        String nome = entrada.next();
        System.out.println("Solicite a quantidade vendida!");
        int quantidade = entrada.nextInt();
        for (int i = 0; i < quantidadeDeProdutos; i++) {
//            if (nome.equalsIgnoreCase(produtos[i])) {
//                if (quantidade <= estoque[i]) {
//                    estoque[i] = estoque[i] - quantidade;
//                    faturamento[i] += quantidade * preco[i];
//                    System.out.println("Produto vendido com sucesso!");
//                } else {
//                    System.out.println("Quantidade insuficiente para fazer a venda!");
//                    return;
//                }
//            }
        }
        System.out.println("Esse produto não foi encontrado!");
    }

    public void entregarProdutoAoCliente() {
        System.out.println("Fatoramento total");
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.println(preco[i] + ":" + faturamento[i]);
        }
    }

    public void exibirRelatorioCompletoDeProdutos() {
        System.out.println("Produto mais vendido");
        double campeaoDeVendas = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (campeaoDeVendas < (faturamento[i] / preco[i])) {
                campeaoDeVendas = faturamento[i] / preco[i];
                indice = i;
            }

        }
      
    }

    public void exibirRelatorioDeProdutosQueAindaNãoForamConsertados() {
        System.out.println("produtos que ainda não foram consertados");
        double maiorFaturamento = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (maiorFaturamento < faturamento[i]) {
                maiorFaturamento = faturamento[i];
                indice = i;
            }
        }
        
    }

    public void produtosConsertadosQueClientesNaoRetiraram() {
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (estoque[i] < 10) {
                System.out.println(produtos[i] + ":" + estoque[i]);
            }
        }
    }

    public void motrarFatoramentoTotalDaLoja() {
        System.out.println(
                formatarSaida("Nome", 20)
                + formatarSaida("Preço", 10)
                + formatarSaida("Estoque", 10));
        for (int i = 0; i < quantidadeDeProdutos; i++) {
           
        }
    }

    public String formatarSaida(String texto, int tamanho) {
        while (texto.length() < tamanho) {
            texto = " " + texto;
        }
        return texto;
    }

    public void preencherListas() {
        receberProduto[0] = "";
        receberProduto[1] = "";
        receberProduto[2] = "";
        preco[0] = 12.05;
        preco[1] = 16.55;
        preco[2] = 11.12;
        [0] = 10;
        quantidadeDeProdutos[1] = 20;
        quantidadeDeProdutos[2] = 30;
        quantidadeDeProdutos = 3;
    }
}
