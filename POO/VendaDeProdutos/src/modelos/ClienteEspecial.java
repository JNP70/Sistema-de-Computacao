package modelos;

public class ClienteEspecial extends Cliente{
    
    private double valorDesconto;

    public ClienteEspecial() {
    }

    public ClienteEspecial(int codigo, String nome, String cpf, String endereco, double valorDesconto) {        
        super(codigo, nome, cpf, endereco);
        this.valorDesconto = valorDesconto;
    }
    
    @Override
    public double comprar(double valorCompra){
        valorCompra = valorCompra - (this.valorDesconto * 2);
        return valorCompra;        
    }
    
    
}
