package convertidor_moneda;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void ConvertirKaC(double valor){
		double celsius = valor-273.15;
		celsius = (double) Math.round(celsius *100d)/100;
		JOptionPane.showMessageDialog(null,  +valor+ " Grados Kelvin equivale a " +celsius+ " Grados Celsius");
	}
	
	public void ConvertirKaF(double valor){
		double fahr = (((valor-273)*1.8)+32);
		fahr = (double) Math.round(fahr *100d)/100;
		JOptionPane.showMessageDialog(null,  +valor+ " Grados Kelvin equivale a " +fahr+ " Grados Fahrenheit");
	}
	
	public void ConvertirCaK(double valor){
		double kelvin = valor+273.15;
		kelvin = (double) Math.round(kelvin *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius equivale a " +kelvin+ " Grados Kelvin");
	}
	
	public void ConvertirCaF(double valor){
		double fahr = ((valor*1.8)+32);
		fahr = (double) Math.round(fahr *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius equivale a " +fahr+ " Grados Fahrenheit");
	}
	
	public void ConvertirFaC(double valor){
		double celsius = ((valor-32)/1.8);
		celsius = (double) Math.round(celsius *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Fahrenheit equivale a " +celsius+ " Grados Celsius");
	}
	
	public void ConvertirFaK(double valor){
		double kelvin = ((0.555*(valor-32)+273));
		kelvin = (double) Math.round(kelvin *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Fahrenheit equivale a " +kelvin+ " Grados Kelvin");
	}
	
	
	
	
	


}
