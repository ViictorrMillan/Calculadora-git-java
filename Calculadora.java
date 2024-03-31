
import javax.swing.JOptionPane;

public class Calculadora { 
    public static void main(String[] args) {
        // Inicio - Entrada dos valores
        int [] valores = new int [2];
       
        String valor1String = JOptionPane.showInputDialog("Digite o primeiro número: ");
        valores [0] = Integer.parseInt(valor1String);
            
        String valor2String = JOptionPane.showInputDialog("Digite o segundo número: ");
        valores [1] = Integer.parseInt(valor2String);

        // Entrada da operação
        String [] operacoes = {"+", "-"};
        int escolha = JOptionPane.showOptionDialog(null, "Selecione a operação desejada: ", "Operação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);
       
        // Exibição do resultado
        int resultado = calcular(valores[0], valores[1], escolha);
        JOptionPane.showMessageDialog(null, "O resultado da operação é:  " + resultado );
   
    }
    // Lógica após escolha da operação
    public static int calcular(int valor1, int valor2, int escolha) {
        switch (escolha) {
             case 0:
                return valor1 + valor2;
             case 1: 
                return valor1 - valor2;
             default:
                throw new IllegalArgumentException("Operação inválida");

        }
        
    }
}