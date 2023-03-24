 package convertidor_moneda;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	
	
	public void ConvertirMonedas(double Minput) {
		 ImageIcon currency = new ImageIcon("src/imagenes/currency.png");
         String opcionMonedas = (String) JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas", 
       		  JOptionPane.PLAIN_MESSAGE, currency, new Object[] {"De Pesos a Dolar","De Pesos a Euro", "De Pesos a Libras", 
       	    		  "De Pesos a Yen","De Pesos a Won Coreano", "De Dolar a Pesos", 
       	    		  "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos",
       	    		  },null ).toString();
         
    switch(opcionMonedas) {  
   	  case "De Pesos a Dolar":
   		 monedas.ConvertirPesosADolares(Minput);
   		  break;
   	  case "De Pesos a Euro":
   		monedas.ConvertirPesosAEuros(Minput);
   		  break;
   	  case "De Pesos a Libras":
    		monedas.ConvertirPesosALibra(Minput);
    		  break;
   	  case "De Pesos a Yen":
		monedas.ConvertirPesosAYen(Minput);
		  break;
   	  case "De Pesos a Won Coreano":
		monedas.ConvertirPesosAWon(Minput);
		  break;
   	  case "De Dolar a Pesos":
		monedas.ConvertirDolaresAPesos(Minput);
		  break;
   	  case "De Euro a Pesos":
		monedas.ConvertirEuroAPesos(Minput);
		  break;
   	  case "De Libras a Pesos":
		monedas.ConvertirLibrasAPesos(Minput);
		  break;
   	  case "De Yen a Pesos":
		monedas.ConvertirYenAPesos(Minput);
		  break;
   	  case "De Won Coreano a Pesos":
		monedas.ConvertirWonAPesos(Minput);
		  break;
         
	}

}
	


	public void ConvertirTemperatura(double Minput) {
		ImageIcon termometro = new ImageIcon("src/imagenes/termometro.png");
         String opcionTemp = (String) JOptionPane.showInputDialog(null,"Elije la conversion de unidades para convertir la temperatura","Temperatura", 
       		  JOptionPane.PLAIN_MESSAGE, termometro, new Object[] {"De Kelvin a Celsius","De Kelvin a Fahrenheit", "De Celsius a Kelvin", 
       	    		  "De Celsius a Fahrenheit","De Fahrenheit a Celsius", "De Fahrenheit a Kelvin"
       	    		  },null ).toString();
         
         switch(opcionTemp) {  
      	  case "De Kelvin a Celsius":
      		 temperatura.ConvertirKaC(Minput);
      		  break;
      		  
      	  case "De Kelvin a Fahrenheit":
     		 temperatura.ConvertirKaF(Minput);
     		  break;
     		  
      	  case "De Celsius a Kelvin":
     		 temperatura.ConvertirCaK(Minput);
     		  break;
     		  
      	  case "De Celsius a Fahrenheit":
    		 temperatura.ConvertirCaF(Minput);
    		  break;
    		  
      	  case "De Fahrenheit a Celsius":
      		  temperatura.ConvertirFaC(Minput);
      		  break;
   		  
      	  case "De Fahrenheit a Kelvin":
      		  temperatura.ConvertirFaK(Minput);
      		  break;
    		  
    		  
         }
		
	}
}
