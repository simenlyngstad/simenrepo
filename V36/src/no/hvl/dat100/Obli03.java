package no.hvl.dat100;

import javax.swing.JOptionPane;

public class Obli03 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String StringN = JOptionPane.showInputDialog("N ");
		int n = Integer.parseInt(StringN);
		double sum = 1.0;
		
		if (n > 0) {
		for(int i = 1; i <= n; i++) {
		sum = sum*i;
		}
		}
		System.out.println("Sum " + sum);
	}
}
