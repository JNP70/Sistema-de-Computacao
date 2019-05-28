
package bookstore;
import java.util.ArrayList;
import java.util.Scanner;
public class Produto {
    
    protected String nome, marca;
    protected float preco;
    protected int codigo;

    public Produto() {
    }

    public Produto(String nome, String marca, float preco, int codigo) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", codigo=" + codigo + '}';
    }
    
   
    
    
    
}
