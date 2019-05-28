
package tiagraca;
import modelo.Cliente;
import modelo.Moca;
import modelo.Transacao;

public class TiaGraca {

    
    public static void main(String[] args) {
        
        Moca donzela = new Moca();
        donzela.nome = "Isa";
        donzela.idade = 21;
        donzela.tipo = "Loira";
        donzela.job = "normal completo";
        donzela.preco = 250;
        
        Cliente cliente = new Cliente(171, "Igor", "56564564", "99895952", "Rua das morgacas");
        Moca panicat = new Moca("Thais", "normal completo", "morena", 350, 27);
        Conta conta = new Conta();
        Transacao transacao = new Transacao();
        
        System.out.println("---------Pessoas disponíveis----------");
        System.out.println("Nome da companhia: " + donzela.companhia);//atributo de classe
        System.out.println("Nome: " + donzela.nome);
        System.out.println("Tipo: " + donzela.tipo);
        System.out.println("");
        System.out.println("Nome da companhia: " + panicat.companhia);
        System.out.println("Nome: " + panicat.nome);
        System.out.println("Tipo: " + panicat.tipo);
        System.out.println("--------------------------------------------");
        
        cliente.fazerTest(donzela, "não gostei");
        cliente.fazerTest(panicat, "gostei");
        
        cliente.comprar(panicat);
        
        conta.gasto("Whiskey e cerveja", "batata frita", 10, 1, 175);
        transacao.forma("Dinheiro");
        
        
    }
    
}
