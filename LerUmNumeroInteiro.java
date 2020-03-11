import javax.swing.JOptionPane;
public class LerUmNumeroInteiro
{
  public static void main(String [] args)
  {
   //declarar variaveis
   int numero;
   
   numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
   //processamento
   int resultado = numero;
   //Saída
   JOptionPane.showMessageDialog (null,"O número digitado é:"+resultado);
     
   }
}