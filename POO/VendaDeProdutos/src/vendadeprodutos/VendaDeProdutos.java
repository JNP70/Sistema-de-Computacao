package vendadeprodutos;
import modelos.Cliente;
import modelos.ClienteComum;
import modelos.ClienteEspecial;

public class VendaDeProdutos {

    public static void main(String[] args) {
        
        //criando cliente com variáveis encapsuladas
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Fulano");
        cliente1.setEndereco("Endereço Teste");
        cliente1.setCpf("000.000.000-00");
        cliente1.setCodigo(1);
        
        Cliente cliente2 = new Cliente(2, "Ciclano", "111.111.111-11", "Endereço teste 2");
        
        //imprimindo dados de clientes
        //imprimindo dados de um cliente através de método sobrecarregado - polimorfismo estático
        System.out.println(cliente1.toString());
        System.out.println("-----------------------------------------------");
        System.out.println(cliente1.toString("nome"));
        System.out.println("-----------------------------------------------");
        System.out.println(cliente2);
               
        
        //criando novos clientes através de uma estrutura por herança
        Cliente cliente3 = new ClienteComum(3, "Douglas", "222.222.222-22", "endereco teste 3", 10);
        Cliente cliente4 = new ClienteEspecial(4, "Fernanda", "333.333.333-33", "endereco teste 4", 10);     
        
        //chamando o método comprar de cliente através de polimorfismo dinâmico
        System.out.println("Valor compra do cliente 3: " + cliente3.comprar(1000));      
        System.out.println("Valor compra do cliente 4: " + cliente4.comprar(1000));
        
    }
    
}
