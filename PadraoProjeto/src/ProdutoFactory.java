import java.util.Scanner;

public class ProdutoFactory implements RegistrarEntidadeFactory{
    @Override
    public RegistrarEntidade criarEntidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os Detalhes do Produto:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Laboratório: ");
        String laboratorio = scanner.nextLine();
        return new Produto(nome, descricao, laboratorio);
    }
}
