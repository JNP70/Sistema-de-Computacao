
package bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Metodos{

    
    private List<Produto> lista = new ArrayList<>();

    public Metodos(List<Produto> lista) {
        this.lista = lista;
    }
    
    
    
    
    public  void CadastroItem(Scanner leia){
        Produto produto = new Produto();
        System.out.println("Informe o nome do novo produto: ");
        String nome = leia.next();
        produto.setNome(nome);
        System.out.println("Informe o codigo do novo produto: ");
        int codigo = leia.nextInt();
        produto.setCodigo(codigo);
        System.out.println("Informe a marca do novo produto: ");
        String marca = leia.next();
        produto.setMarca(marca);
        System.out.println("Informe o preco do novo produto: ");
        float preco = leia.nextFloat();
        produto.setPreco(preco);
        

        lista.add(produto);
        }
    
    public  void ListarItens(){
        for (Produto lista1 : lista) {
            System.out.println(lista1.toString());
            
            System.out.println();
        }
    }
    
    public void ExcluiItem(){
    
        //ListarItens();
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o codigo do produto: ");
        int codigo = leia.nextInt();
        Produto remover = new Produto();
        for (Produto lista1 : lista){
            if(lista1.codigo == codigo){
                System.out.println(lista1.toString());
                remover = lista1;
            
            }
        
        }
        lista.remove(remover);
        
        ListarItens();
        System.out.println("Removido com sucesso!");
    }
    
    public void Upgrade(){
    
        System.out.println(lista);
        Scanner up = new Scanner(System.in);
        System.out.println("Digite o novo codigo:");
        int codigo2 = up.nextInt();
        Produto upgrade = new Produto();
        int indice_atualizar = 0;
        int indice = 0;
        for(Produto lista2 : lista){
            
            if(lista2.codigo == codigo2){
                System.out.println(lista2.toString());
                indice_atualizar = indice;
            }
            indice++;
        }
        
        lista.get(indice_atualizar).setCodigo(codigo2);
    }
    public void Buscar(){
        ListarItens();
        Produto busca = new Produto();
        Scanner leia = new Scanner(System.in);
        for(Produto lista1:lista){
        System.out.println("Informe o nome do produto: ");
        String nome = leia.next();
        busca = lista1;
            if(nome.equals(lista1.nome)){
                
        busca.getNome();
        busca.getMarca();
        busca.getPreco();
        busca.getCodigo();
        }
        System.out.println(busca);
    
        }
    }
    
    
    
}
