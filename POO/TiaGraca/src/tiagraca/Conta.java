
package tiagraca;


class Conta {
    public String bebida;
    public String comida;
    public double total;
    public int quantidadeb;
    public int quantidadec;
    

    
    public void gasto(String bebida, String comida, int quantidadeb, int quantidadec, double total ){
        this.bebida = bebida;
        this.comida = comida;
        this.quantidadeb = quantidadeb;
        this.quantidadec = quantidadec;
        this.total = total;
        
        System.out.println("O cliente comprou do bar :"+ this.bebida);
        System.out.println("O cliente comeu do restaurante :" + this.comida);
        System.out.println("O cliente consumiu do bar "+ this.quantidadeb + "doses");
        System.out.println("O cliente consumiu da cozinha "+ this.quantidadec + "porções");
        System.out.println(" O total da conta foi:"+ this.total);
        System.out.println("-----------------------------------------------------------");
    }
}
