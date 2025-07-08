import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Funcionario {

    static Scanner sc = new Scanner(System.in);

    private String nome;
    private String ra;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public static void criaNovoFuncionario(){
        Random random = new Random();
        Funcionario func = new Funcionario();
        System.out.println("Nome Do Funcionario: ");
        String nomeFunc = sc.next();
        func.setNome(nomeFunc);

        ArrayList<Integer> raFunc = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            raFunc.add(random.nextInt(9));
        }
        String senhaFunc = null;
        System.out.println(raFunc);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++){
            senhaFunc = String.valueOf(sb.append(raFunc.get(i)));
        }
        func.setRa(senhaFunc);
        System.out.println(
                "O acesso é : " + func.getNome() + "\n" +
                "Seu RA é: " + func.getRa()
        );
    }
}
