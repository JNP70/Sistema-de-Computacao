package modelos;

public interface InterfaceCliente {    
    
    public abstract int getCodigo();
    
    public abstract String getNome();
    
    public abstract String getCpf();
    
    public abstract String getEndereco();
    
    public abstract void setCodigo(int codigo);
    
    public abstract void setNome(String nome);
    
    public abstract void setCpf(String cpf);
    
    public abstract void setEndereco(String endereco);
    
    public abstract String toString();
    
    public abstract double comprar(double valorCompra);
    
    public abstract void verProduto();
    
    
}
