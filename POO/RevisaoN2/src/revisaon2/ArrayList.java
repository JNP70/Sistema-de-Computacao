package revisaon2;

import java.util.List;
import javax.swing.JOptionPane;

public class ArrayList {

    public static void main(String[] args) {
        List<Cliente> clientes = new java.util.ArrayList<>();

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome:"));

        Cliente cliente = new Cliente(codigo, nome);
        
        clientes.add(cliente);

    }
}
