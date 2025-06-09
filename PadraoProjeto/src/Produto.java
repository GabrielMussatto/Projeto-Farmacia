public class Produto implements RegistrarEntidade{
    private String nome;
    private String descricao;
    private String laboratorio;

    public Produto (String nome, String descricao, String laboratorio){
        this.nome = nome;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
    }

    @Override
    public void displayInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Laboratório: " + laboratorio);
    }
}
