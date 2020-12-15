import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

class MediaAluno {
    public static void main(final String[] args) {
        JOptionPane na = new JOptionPane();
        String notaA = na.showInputDialog(null, "digite a primeira nota:");
        double nota1 = Double.parseDouble(notaA);
        String notaB = na.showInputDialog(null, "digite a segunda nota:");
        double nota2 = Double.parseDouble(notaB);
        String notaC = na.showInputDialog(null, "digite a terceira nota:");
        double nota3 = Double.parseDouble(notaC);
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 5){
            showMessageDialog(null, "Sua media e igual: " + media + "\nVoce foi APROVADO!");
        }
        else {
            showMessageDialog(null, "Sua media e igual: " + media + "\nVoce foi REPROVADO :(");
        }
    }
}