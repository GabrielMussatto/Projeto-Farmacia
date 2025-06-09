import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrarEntidadeFactory factory = null;

        System.out.println("Selecione a entidade para cadastrar:");
        System.out.println("1. Cliente");
        System.out.println("2. Produto");
        System.out.println("3. Funcionário");
        System.out.print("Digite sua escolha: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                factory = new ClienteFactory();
                break;
            case 2:
                factory = new ProdutoFactory();
                break;
            case 3:
                factory = new FuncionarioFactory();
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        RegistrarEntidade entidade = factory.criarEntidade();
        System.out.println("\nCadastrado com sucesso:");
        entidade.displayInfo();
    }
}
