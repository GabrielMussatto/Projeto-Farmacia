public class Funcionario implements RegistrarEntidade {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public void displayInfo(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
