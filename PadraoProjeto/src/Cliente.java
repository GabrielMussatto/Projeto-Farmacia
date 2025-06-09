public class Cliente implements RegistrarEntidade{
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;

    public Cliente(String nome, String cpf, String rg, String telefone, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public void displayInfo(){
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}
