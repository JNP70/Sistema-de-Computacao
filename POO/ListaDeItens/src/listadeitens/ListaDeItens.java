package listadeitens;

import java.util.ArrayList;

public class ListaDeItens {

    public static void mostrar(ArrayList<String> itens, String cabecalho) {
        System.out.print(cabecalho);
        for (String i : itens) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }

    public static void adicionar(ArrayList<String> itens, String item) {
        if (!item.equals("")) {
            itens.add(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        ArrayList<String> animais = new ArrayList<String>();

        cores.add("vermelho");
        cores.add(0, "amarelo");
        cores.add("verde");
        cores.add(0, "rosa");

        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Coelho");
        animais.add("Galinha");

        mostrar(cores, "Lista de Cores: ");
        mostrar(animais, "Lista de animais: ");
        
        adicionar(cores, "Preto");
        adicionar(animais, "Zebra");
        
        mostrar(cores, "Lista de Cores: ");
        mostrar(animais, "Lista de animais: ");
        
    }

}
