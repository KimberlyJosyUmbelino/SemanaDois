import javax.swing.JOptionPane;
public class Peso
{
  public static void main(String [] args)
  {
   //declarar variaveis 1,2 e 3
   Double peso;
   
   peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
   
   //processamento
   Double resultado = peso;
   //Sa�da
   JOptionPane.showMessageDialog (null,"O peso digitada �:"+resultado+"kg");
     
   }
}