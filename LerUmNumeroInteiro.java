import javax.swing.JOptionPane;
public class LerUmNumeroInteiro
{
  public static void main(String [] args)
  {
   //declarar variaveis
   int numero;
   
   numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
   //processamento
   int resultado = numero;
   //Sa�da
   JOptionPane.showMessageDialog (null,"O n�mero digitado �:"+resultado);
     
   }
}