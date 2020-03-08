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
   //Saída
   JOptionPane.showMessageDialog (null,"O peso digitada é:"+resultado+"kg");
     
   }
}