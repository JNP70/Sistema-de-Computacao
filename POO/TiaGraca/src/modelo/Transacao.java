
package modelo;


public class Transacao {

    public String forma;

    public Transacao() {
    }

    public Transacao(String forma) {
        this.forma = forma;
    }
    
    public void forma(String forma){
        if(forma.equalsIgnoreCase("cheque")){
            System.out.println("Forma de pagamento não aceita");
        } else{
        System.out.println("A forma de pagamento escolhida foi: " + forma);
        System.out.println("Pagamento efetuado");
        }
    }
    
}
