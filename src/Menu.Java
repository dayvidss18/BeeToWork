//lais
import java.util.ArrayList;
import java.util.Scanner;

class Recebimento {
    String nome;
    String ID;
    String preco;

    public Recebimento(String nome, String ID, String preco) {
        this.nome= nome;
        this.ID= ID;
        this.preco= preco;
    }

    public void mostrar() {
        System.out.println("Nome: " + nome + ", ID: " + ID + ", Preço: " + preco);
    }
}

public class menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Recebimento> recebimentos = new ArrayList<>();

        while(true){
            System.out.println("\n----- MENU PRINCIPAL ------");
            System.out.println("1. RECEBIMENTO");
            System.out.println("2. EXPEDIÇÃO");
            System.out.println("3. CONSULTA");
            System.out.println("4. EXCLUSÃO DE PRODUTO");
            System.out.println("5. SAIR");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                while (true) {
                    System.out.println("\n--- MENU RECEBIMENTO ---");
                    System.out.println("1. Adicionar recebimento");
                    System.out.println("2. Mostrar recebimentos");
                    System.out.println("3. Modificar recebimento");
                    System.out.println("4. Excluir recebimento");
                    System.out.println("5. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoReceb = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoReceb == 1) {
                        System.out.print("Digite o NOME do recebimento: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite o ID do recebimento: ");
                        String id = scanner.nextLine();

                        System.out.print("Digite o PREÇO do recebimento: ");
                        String preco = scanner.nextLine();

                        Recebimento novo = new Recebimento(nome, id, preco);
                        recebimentos.add(novo);
                        System.out.println("recebimento adicionado");

                    } else if (opcaoReceb== 2) {
                        System.out.println("------ Lista de Recebimentos ------");

                        if (recebimentos.isEmpty()) {
                            System.out.println("nao tem nenhum recebibento cadastrado");
                        } else {
                            for (int i = 0; i < recebimentos.size(); i++) {
                                System.out.print((i + 1) + ". ");
                                recebimentos.get(i).mostrar(); 
                            }
                        }

                    } else if (opcaoReceb== 3) {
                        System.out.print("Digite o número do produto q deseja alterar:");
                        int index = scanner.nextInt() - 1;
                        if (index >= 0 && index < recebimentos.size()) {

                            System.out.print("Novo nome: ");
                            String novoNome = scanner.nextLine();

                            System.out.print("Novo ID: ");
                            String novoID = scanner.nextLine();

                            System.out.print("Novo preço; ");
                            String novoPreco = scanner.nextLine();

                            recebimentos.set(index, new Recebimento(novoNome, novoID, novoPreco));
                            System.out.println("Recebimento modificado com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }

                    } else if (opcaoReceb== 4) {
                        System.out.print("Digite o número do item que deseja excluir: ");
                        int index = scanner.nextInt() - 1;
                        if (index >= 0 && index < recebimentos.size()) {
                            recebimentos.remove(index);
                            
                            System.out.println("Recebimento excluído com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }

                    } else {
                        System.out.println("Opção inválida!");
                    }
                }

            } else if (opcao == 5) {
                System.out.println("vlw ate mais");
               
            }
        
        
            if (opcao == 2) {
                while (true) {
                    System.out.println("\n--- MENU EXPEDIÇÃO ---");
                    System.out.println("1.ADICIONAR RETIRADA");
                    System.out.println("2.MOSTRAR RETIRADA");
                    System.out.println("3. .MODIFICAR RETIRADA");
                    System.out.println("4.EXCLUIR RETIRADA");
                    System.out.println("5. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoexped= scanner.nextInt();
                    scanner.nextLine();
                    if(opcaoexped==1){


                    }else if(opcaoexped==2){


                    }else if(opcaoexped==3){


                    }else if(opcaoexped==4){


                    }else if (opcaoexped==5){

                    }
        
            if (opcao == 3) {
                while (true) {
                    System.out.println("\n--- MENU CONSULTA ---");
                    System.out.println("1. SETOR1");
                    System.out.println("2. SETOR2");
                    System.out.println("3. SETOR3");
                    System.out.println("4. SETOR4");
                    System.out.println("5. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoconsul= scanner.nextInt();
                    scanner.nextLine();
                    if(opcaoexped==1){


                    }else if(opcaoconsul==2){


                    }else if(opcaoconsul==3){


                    }else if(opcaoconsul==4){


                    }else if (opcaoconsul==5){
                        
                    }
        
        



            if (opcao == 4) {
                while (true) {
                    System.out.println("\n--- MENU EXCLUSÃO DE PRODUTO ---");
                    System.out.println("1.VERIFICAÇÃO DO MOTIVO DA EXCLUSÃO");
                    System.out.println("2. AUTORIZAÇÃO DIRETA DO GERENTE RESPONSAVEL POR AQUELE SETOR");
                    System.out.println("3. Voltar");
                    System.out.print("Escolha uma opção: ");
                    int opcaoexclusao= scanner.nextInt();
                    scanner.nextLine();
                    if(opcaoexclusao==1){


                    }else if(opcaoexclusao==2){


                    }else if(opcaoexclusao==3){

                    }



















                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
