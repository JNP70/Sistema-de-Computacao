
package bookstore;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import bookstore.Metodos;
public class Bookstore {

   
     

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();
        while(true){
            System.out.println("Escolha uma das opções:");
        System.out.println("Seja bem vindo.");
        System.out.println("o que vc quer fazer hoje:");
        System.out.println("Digite 1 para consultar um produto.");
        System.out.println("Digite 2 para listar produtos.");
        System.out.println("Digite 3 para remover um produto");
        System.out.println("Digite 4 para atualizar algum atributo");
        System.out.println("Digite 6 para cadastrar produtos");
        System.out.println("Digite 5 para sair");
        Metodos metodo = new Metodos(lista);
        
        
        switch(leia.nextInt()){
            
            case 1 : 
                System.out.println("Digite o nome do produto á ser buscado");
                leia.nextLine();
                metodo.Buscar();
                break;
            
            case 2 : 
                System.out.println("Aqui esta a lista de produtos:");
                metodo.ListarItens();
                break;
            case 3 : 
                metodo.ExcluiItem();
                break;
            case 4 : 
                metodo.Upgrade();
                break;
            case 5 : 
                System.exit(0);
                break;
            case 6 : 
                metodo.CadastroItem(leia);
                break;
            default:
                System.out.println("Opção inexistente, tente novamente.");
        }
        
        
        
        }
    }    
}
