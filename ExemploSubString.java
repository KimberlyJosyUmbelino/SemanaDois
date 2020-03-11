import javax.swing.JOptionPane;
public class ExemploSubString
  {
    public static void main (String [] args)
    {
    //declarar
    String nome,resultado,exemplo1;
        
    nome = javax.swing.JOptionPane.showInputDialog("Digite um nome:");
    exemplo1 = nome.substring(3);
    //saída
    JOptionPane.showMessageDialog(null, "o nome que você digitou é:" + exemplo1);   
    }
  }  