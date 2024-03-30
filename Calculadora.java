
import javax.swing.JOptionPane;

public class Calculadora { 
    public static void main(String[] args) {
        int [] valores = new int [2];
       
        String valor1String = JOptionPane.showInputDialog("Digite o primeiro número: ");
        valores [0] = Integer.parseInt(valor1String);
            
        String valor2String = JOptionPane.showInputDialog("Digite o segundo número: ");
        valores [1] = Integer.parseInt(valor2String);

        int resultado = valores[0] + valores[1];

        JOptionPane.showMessageDialog(null, "A soma dos números é: " + resultado);
    }
}