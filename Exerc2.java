import  javax.swing.JOptionPane ;
    
    public class Exerc2 {
         public  static  void  main ( String [] args )
         {
            int numero;

         // JOptionPane.showInputDialog (), recebe uma string, para alterar por inteiro, ter� que fazer uma convers�o.
         numero = Inteiro.parseInt(JOptionPane.showInputDialog ( " Informe ou n�mero: " ));

         System.out.println ( " O valor do n�mero digitado e: "  + numero);
      }
   }
   
   