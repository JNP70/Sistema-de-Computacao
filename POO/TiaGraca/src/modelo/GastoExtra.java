
package modelo;


public class GastoExtra {
    public String bebida;
    public String comida;
    public double gastoextra;
    public int quantidade;
    public Conta conta;

    public GastoExtra() {
    }

    public GastoExtra(String bebida, String comida, double gastoextra, int quantidade) {
        this.bebida = bebida;
        this.comida = comida;
        this.gastoextra = gastoextra;
        this.quantidade = quantidade;
    }

    private static class Conta {

        public Conta() {
        }
    }
    
    
}
