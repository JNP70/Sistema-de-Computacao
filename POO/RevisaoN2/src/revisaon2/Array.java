package revisaon2;

public class Array {
    public static void main(String[] args) {
        int[] inteiros = new int[4];
        int[] inteiros_2 = {2, 3, 4};
        
        int[][] matriz_de_inteiros = new int[2][2];
        int[][] matriz_de_inteiros_2 = {{2,4},{5,6},{7,8}};
        
        matriz_de_inteiros[0][0] = 8;
        matriz_de_inteiros[0][1] = 7;
        
        for(int contador = 0; contador < inteiros.length; contador++){
            inteiros[contador] = contador * 3;
        }
        
        for(int contador = 0; contador < inteiros.length; contador++){
            System.out.println("Índice: " + contador 
                    + ", Valor: " + inteiros[contador]);
        }
        
        System.out.println("----For aprimorado ou foreach----");
        System.out.println("Imprimindo segundo vetor...");
        for(int inteiro : inteiros_2){            
            System.out.printf("%5d\n", inteiro);
        }
        System.out.println("Imprimindo Matriz-------");
        for(int contador_1 = 0; contador_1 < matriz_de_inteiros_2.length; contador_1++){
            for(int contador_2 = 0; contador_2 < matriz_de_inteiros_2[contador_1].length; contador_2++){
                System.out.printf("%5d",matriz_de_inteiros_2[contador_1][contador_2]);
                
            }
            System.out.println("");
        }
        
    }
    
    
}
