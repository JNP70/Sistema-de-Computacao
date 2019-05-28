package modelos;

public class ClienteComum extends Cliente{
    
    private double valorDesconto;

    public ClienteComum() {
    }

    public ClienteComum(int codigo, String nome, String cpf, String endereco, double valorDesconto) {
        super(codigo, nome, cpf, endereco);       
        this.valorDesconto = valorDesconto;
    }
    
    @Override
    public double comprar(double valorCompra){
        valorCompra = valorCompra - this.valorDesconto;
        return valorCompra;        
    }
    
    
}
