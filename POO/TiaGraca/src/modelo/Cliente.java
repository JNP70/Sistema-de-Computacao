
package modelo;


public class Cliente {

    int codigo;
    String nome;
    String cpf;
    String telefone;
    String endereco;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String cpf, String telefone, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
     public Cliente fazerCadastro(Cliente cliente) {
         Cliente eu = new Cliente();
        return cliente;
    }
    public void comprar(Moca donzela) {
        System.out.println("Iniciando pedido de venda..............");
        System.out.println("Resposta : O cliente " + this.nome + " quer conversar com a " + donzela.nome + ".");
        System.out.println("-----------------------------------------------------------");
    }

    public void fazerTest(Moca donzela, String opiniao) {
        System.out.println("------- O cavalheiro gostaria de falar com a " + donzela.nome + " -------");
        System.out.println("Avaliação: Eu " + this.nome + " " + opiniao + " da moça " + donzela.nome);
        System.out.println("-----------------------------------------------------------");
    }
    
    
    
}
