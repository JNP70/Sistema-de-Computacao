package revisaon2;

import javax.swing.JOptionPane;

public class TratamentoDeExcecoes {

    public static void main(String[] args) {

        try {
            int inteiro_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
            int inteiro_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
            int divisao = inteiro_1 / inteiro_2;
        } catch (ArithmeticException ae) {
            System.out.println("Erro aritmetico: " + ae.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Erro de formato da entrada: " + nfe.getMessage());
        } finally {
            System.out.println("Entrou no finally!!!");
        }

    }

}
