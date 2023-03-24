package convertidor_moneda;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Convertidor {
	
	
	
   public static void main(String[] args) throws HeadlessException {
    
      //Cuadro de diálogo - Menú Principal
	   function monedas = new function();
	   function temp = new function();
	  
	   
	  boolean flag = true;
	  while (flag) {
		  
		  String[] options = {"Conversor de Moneda","Conversor de Temperatura"};
	      ImageIcon icon = new ImageIcon("src/imagenes/conversion.png");
	      String menuPrincipal = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Menu", JOptionPane.QUESTION_MESSAGE, icon, options, options[0]).toString();
		  
	  switch(menuPrincipal) {
	  
	  case "Conversor de Moneda":
		  String cantidad = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir: ");
	 
		  
		  if(ValidarNumero(cantidad)) {
			  double Minput = Double.parseDouble(cantidad);
			  monedas.ConvertirMonedas(Minput);
			  
			  int respuesta=JOptionPane.showConfirmDialog(null, "Deseas realizar otra transaccion?");
			  if(JOptionPane.OK_OPTION == respuesta) {
				  System.out.println("Selecciona opcion Afirmativa");
				  break;
			  }else {
				  flag = false;
				  JOptionPane.showMessageDialog(null, "Programa Terminado");
				  }
			  }else {
				  JOptionPane.showMessageDialog(null, "Valor no valido ","Error", JOptionPane.WARNING_MESSAGE);
			  }
		  
	  case "Conversor de Temperatura":
		  String temperatura = JOptionPane.showInputDialog(null, "Ingresa la temperatura que deseas convertir: ");
		  if(ValidarTemperatura(temperatura)) {
			  double Minput = Double.parseDouble(temperatura);
			  temp.ConvertirTemperatura(Minput);
			  
			  int respuesta=JOptionPane.showConfirmDialog(null, "Deseas realizar otra transaccion?");
			  if(JOptionPane.OK_OPTION == respuesta) {
				  System.out.println("Selecciona opcion Afirmativa");
			  }else {
				  flag = false;
				  JOptionPane.showMessageDialog(null, "Programa Terminado");
				  }
			  }else {
				  JOptionPane.showMessageDialog(null, "Valor no valido ","Error", JOptionPane.WARNING_MESSAGE);
			  }
			  
		  }
	  }
		  
	  }
	  
	  public static boolean ValidarNumero(String cantidad) {
    	  try {
    		  double x = Double.parseDouble(cantidad);
    		  if (x>= 0 || x<0);
    		    return true;    		  
    	  } catch (NumberFormatException e) {
    		  return false;
    	  }
	  }
    	  
      public static boolean ValidarTemperatura(String temperatura) {
           try {
        	   double x = Double.parseDouble(temperatura);
        	   if (x>= 0 || x<0);
        		 return true;    		  
        	  } catch (NumberFormatException e) {
        		  return false;
        	  }
      
      
 
     
          
        	  
          
      
   }
   
   
       
     
      
      

      
      
      
      
     
      
      
      
   
}
