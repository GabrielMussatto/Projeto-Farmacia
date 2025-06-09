import java.util.Scanner;

public class ClienteFactory implements RegistrarEntidadeFactory{
    @Override
    public RegistrarEntidade criarEntidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os Detalhes do Cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        return new Cliente(nome, cpf, rg, telefone, email);
    }
}
