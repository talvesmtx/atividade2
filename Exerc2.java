import  javax.swing.JOptionPane ;
    
    public class Exerc2 {
         public  static  void  main ( String [] args )
         {
            int numero;

         // JOptionPane.showInputDialog (), recebe uma string, para alterar por inteiro, terá que fazer uma conversão.
         numero = Inteiro.parseInt(JOptionPane.showInputDialog ( " Informe ou número: " ));

         System.out.println ( " O valor do número digitado e: "  + numero);
      }
   }
   
   