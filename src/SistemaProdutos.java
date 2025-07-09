import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    int quantidade;

    Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    void mostrarProduto() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Quantidade em estoque: " + this.quantidade);
        System.out.println("--------------------------------------");
    }
}

public class SistemaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        while (true) {
            System.out.println("\n====== MENU DE PRODUTOS ======");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (opcao == 1) {
                System.out.println("\n--- Cadastro de Produto ---");
                System.out.print("Nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Quantidade: ");
                int qtd = scanner.nextInt();
                scanner.nextLine(); 

                Produto novoProduto = new Produto(nome, qtd);
                listaProdutos.add(novoProduto);
                System.out.println("Produto cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n--- Lista de Produtos ---");
                if (listaProdutos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {
                    for (Produto p : listaProdutos) {
                        p.mostrarProduto();
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Saindo do sistema. Até meu patrão! ");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}