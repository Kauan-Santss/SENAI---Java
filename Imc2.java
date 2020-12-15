import javax.swing.JOptionPane;
class Imc2 {
    public static void main (String [] args){
        JOptionPane jp = new JOptionPane();
        String txtPeso = jp.showInputDialog (null, "Informe seu peso: ");
        String txtAltura = jp.showInputDialog (null, "Informe sua Altura: ");
        double peso = Double.parseDouble (txtPeso);
        double altura = Double.parseDouble (txtAltura);
        double imc = peso / Math.pow (altura, 2);
        if (imc < 17) {
            jp.showMessageDialog (null,"Muito abaixo do peso!");
        }
        else {
            if (imc >= 17 && imc < 18.5 ) {
                jp.showMessageDialog (null, "Abaixo do peso!");
            }
            else {
                if (imc >= 18.5 && imc < 25){
                    jp.showMessageDialog (null,"Peso Ideal!");
                }
                else {
                    if ( imc >= 25 && imc < 30){
                        jp.showMessageDialog (null,"Acima do peso!");
                    }
                    else {
                        if (imc >= 30 && imc < 35){
                            jp.showMessageDialog (null,"Obesidade I");
                        }
                        else{
                            if (imc >= 35 && imc < 40){
                                jp.showMessageDialog (null,"Obesidade II");
                            }
                            else{
                                jp.showMessageDialog (null,"Obesidade III");
                            }
                        }
                    }
                }
            }
        }
    }
}