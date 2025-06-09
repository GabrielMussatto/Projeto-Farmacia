import java.util.Scanner;

public class FuncionarioFactory implements RegistrarEntidadeFactory {
    @Override
    public RegistrarEntidade criarEntidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os Detalhes do Funcionário:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        return new Funcionario(nome, cpf);
    }
}
