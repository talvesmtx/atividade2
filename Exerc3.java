import  javax.swing.JOptionPane ;

  public class Exerc3 {
      public  static  void  main ( String [] args )
      {
      int Dia;
      int Mes;
      int Ano;
      
      Dia = Inteiro . parseInt ( JOptionPane . showInputDialog ( " Relatório ou dia: " ));
      Mes = Inteiro . parseInt ( JOptionPane . showInputDialog ( " Relatório ou mes: " ));
      Ano = Inteiro . parseInt ( JOptionPane . showInputDialog ( " Informe o ano: " ));
      
      System.out.println (Dia +  " / "  + Mes +  " / "  + Ano);
         
   }
}
