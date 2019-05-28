package modelos;

public class Cliente implements InterfaceCliente{

    protected int codigo;
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(int codigo, String nome, String cpf, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Cliente() {

    }
    
    @Override
    public int getCodigo() {
        return this.codigo;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public String getCpf() {
        return this.cpf;
    }
    
    @Override
    public String getEndereco() {
        return this.endereco;
    }
    
    @Override
    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("O código não pode ser zero!!!");
        }
    }
    
    @Override
    public void setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
        } else {
            System.out.println("O nome não pode ser vazio!!!");
        }
    }
    
    @Override
    public void setCpf(String cpf) {
        if (cpf.length() == 14) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF com tamanho incorreto!!!");
        }
    }
    
    @Override
    public void setEndereco(String endereco) {
        if (!endereco.isEmpty()) {
            this.endereco = endereco;
        } else {
            System.out.println("Endereço não pode ser vazio!!!");
        }
    }

    @Override
    public String toString() {
        return "Código: " + this.codigo + "\n"
                + "Nome: " + this.nome + "\n"
                + "CPF: " + this.cpf + "\n"
                + "Endereço: " + this.endereco + "\n";
    }

    public String toString(String campo) {
        if (campo.equalsIgnoreCase("codigo")) {
            return "Código: " + this.codigo;
        } else if (campo.equalsIgnoreCase("nome")) {
            return "Nome:" + this.nome;
        } else if (campo.equalsIgnoreCase("cpf")) {
            return "CPF: " + this.cpf;
        } else if (campo.equalsIgnoreCase("endereco")) {
            return "Endereço: " + this.endereco;
        } else {
            return "";
        }
    }
    
    @Override
    public double comprar(double valorCompra){
        return valorCompra;        
    }
    
    @Override
    public void verProduto(){
        
    }

}
