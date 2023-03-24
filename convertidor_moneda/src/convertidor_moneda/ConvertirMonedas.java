package convertidor_moneda;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosADolares(double valor){
		double monedaDolar = valor/4779;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Pesos equivale a $" +monedaDolar+ " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor){
		double monedaEuro = valor/5079;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Pesos equivale a $" +monedaEuro+ " Euros");
	}
	
	public void ConvertirPesosALibra(double valor){
		double monedaLibra = valor/5750;
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Pesos equivale a $" +monedaLibra+ " Libras");
	}
	
	public void ConvertirPesosAYen(double valor){
		double monedaYen = valor/36.31;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Pesos equivale a $" +monedaYen+ " Yen");
	}
	
	public void ConvertirPesosAWon(double valor){
		double monedaWon = valor/3.69;
		monedaWon = (double) Math.round(monedaWon *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Pesos equivale a $" +monedaWon+ " Won");
	}
	
	public void ConvertirDolaresAPesos(double valor){
		double monedaPeso = valor*4779;
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Dolares equivale a " +monedaPeso+ " Pesos");
	}
	
	public void ConvertirEuroAPesos(double valor){
		double monedaPeso = valor*5079;
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Euros equivale a " +monedaPeso+ " Pesos");
	}
	
	public void ConvertirLibrasAPesos(double valor){
		double monedaPeso = valor*5750;
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Libras equivale a " +monedaPeso+ " Pesos");
	}
	
	public void ConvertirYenAPesos(double valor){
		double monedaPeso = valor*36.31;
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Yen equivale a " +monedaPeso+ " Pesos");
	}
	
	public void ConvertirWonAPesos(double valor){
		double monedaPeso = valor*3.69;
		monedaPeso = (double) Math.round(monedaPeso *100d)/100;
		JOptionPane.showMessageDialog(null, "El valor $" +valor+ " Won equivale a " +monedaPeso+ " Pesos");
	}
	
	
	


}
