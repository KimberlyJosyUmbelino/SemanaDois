import javax.swing.JOptionPane;
public class LeiaTresNumerosQueRepresentamData
{
  public static void main(String [] args)
  {
   //declarar variaveis 1,2 e 3
   String numero1,numero2,numero3;
   
   numero1 = JOptionPane.showInputDialog("Digite o dia: ");
   numero2 = JOptionPane.showInputDialog("Digite o m�s: ");
   numero3 = JOptionPane.showInputDialog("DIgite o ano: ");
   //processamento
   String resultado = numero1 + " / " + numero2 +" / " + numero3 +" ";
   //Sa�da
   JOptionPane.showMessageDialog (null,"A data digitada �:"+resultado);
     
   }
} 