//lais (Nao esta pronto ainda)
import java.util.ArrayList;
import java.util.Scanner;

public class menu{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> recebimentos = new ArrayList<>();
        ArrayList<String> recebimentos1 = new ArrayList<>();
        ArrayList<String> recebimentos2 = new ArrayList<>();


        while (true) {
            System.out.println("\n-----MENU PRINCIPAL ------");
            System.out.println("1. RECEBIMENTO");
            System.out.println("2. EXPEDIÇÃO");
            System.out.println("3. CONSULTA");
            System.out.println("4. EXCLUSÃO DE PRODUTO");
            System.out.println("0. SAIR");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                while (true) {
                    System.out.println("\n--- MENU RECEBIMENTO ---");
                    System.out.println("1. Adicionar recebimento");
                    System.out.println("2. Mostrar recebimentos");
                    System.out.println("3. Modificar recebimentos");
                    System.out.println("4. Excluir recebimentos");
                    System.out.println("0. Voltar");
                    System.out.print("Escolha uma opção: ");
                    
                    int opcaoRecebimento = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoRecebimento == 1) {
                        System.out.print("Digite o nome do recebimento: ");
                        String novo = scanner.nextLine();
                        recebimentos.add(novo);
                        
                        System.out.print("Digite o ID do recebimento: ");
                        String id = scanner.nextLine();
                        recebimentos1.add(novo);
                        
                        System.out.print("Digite o PREÇO do recebimento: ");
                        String preco = scanner.nextLine();
                        recebimentos2.add(novo);
                        System.out.println("Recebimento adicionado!");

                    } else if (opcaoRecebimento == 2) {
                        System.out.println("------Lista de Recebimentos----");
                        
                        if (recebimentos.isEmpty()) {
                            System.out.println("Nenhum recebimento cadastrado.");
                        } else {
                            for (int i = 0; i < recebimentos.size(); i++) {
                                System.out.println((i + 1) + ". " + recebimentos.get(i));
                            }
                            for (int i = 0; i < recebimentos1.size(); i++) {
                                System.out.println((i + 1) + ". " + recebimentos1.get(i));
                            }
                            for (int i = 0; i < recebimentos2.size(); i++) {
                                System.out.println((i + 1) + ". " + recebimentos2.get(i));
                            }
                        }

                    } else if (opcaoRecebimento == 3) {
                        
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }

            } else if (opcao == 0) {
                System.out.println("Saindo do sistema...");
            
            } else {
                System.out.println("Opção inválida!");
            }
        }

       
    }
}
