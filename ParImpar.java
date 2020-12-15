import javax.swing.JOptionPane;
class Parimpar {
    public static void main (String [] args){
        JOptionPane jp = new JOptionPane ();
        String texto = jp.showInputDialog(null,"Digite um numero inteiro:");
        int numero = Integer.parseInt (texto);
        if (numero % 2 == 0) {
            jp.showMessageDialog(null, numero + " e par!");
        }
        else {
            jp.showMessageDialog(null, numero + " e impar!");
        }
    }
}