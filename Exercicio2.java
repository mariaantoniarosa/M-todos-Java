import javax.swing.JOptionPane;

public class Exercicio2 {
	//Cada média deverá ser calculada por um método;
	//Os dois métodos devem receber como parâmetros as notas;
	//No caso do método da média ponderada, além das notas, o método deverá receber
	//também os pesos, que devem ser previamente solicitados ao usuário;
	//Os dois métodos devem retornar a média;
	//Um método deve ser criado para receber a média final e mostrar se o aluno está 
	//aprovado ou reprovado, considerando que a média mínima para aprovação é 7

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 0;
		double[] notas = new double[3];

		for (int i = 0; i < 3; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "º Nota"));
			// media += notas[i];
		}

		menu = Integer.parseInt(JOptionPane.showInputDialog("Informe 1 - MÉDIA ARITMÉTICA ou 2- MÉDIA PONDERADA"));

		while ((menu != 1) && (menu != 2)) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Informe 1 - MÉDIA ARITMÉTICA ou 2- MÉDIA PONDERADA"));
		}

		if (menu == 1) {
			double media1 = PedirMArit(notas);
			MostrarMens(media1);
		} else if (menu == 2) {

			int[] peso = new int[3];
			for (int i = 0; i < 3; i++) {
				peso[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da nota"));
			}
			double Ponderada = PedirPond(notas, peso);
			MostrarMens(Ponderada);
		}
	}

	public static double PedirMArit(double[] notas) {
	 double media= 0;
		for (int i=0; i<3; i++) {
			 media += notas[i];
		}
		media = media/3;
		return (media);
	}

	public static double PedirPond(double[] notas, int[] peso) {
		int totPeso = 0;
		double Ponderada = 0;
	
		for (int i = 0; i < 3; i++) {
			Ponderada += (peso[i] * notas[i]);
			totPeso += peso[i];
			// Cada vez que o FOR estiver passando ele irá somar com o resultado do cálculo
			// anterior			
		}
		
		Ponderada = Ponderada / totPeso;
		return Ponderada;
	}

	public static void MostrarMens(double media1) {
		JOptionPane.showMessageDialog(null, "A média é "+media1);
		if (media1 >=7) {
			JOptionPane.showMessageDialog(null, "Você está aprovado");
		}else {
			JOptionPane.showMessageDialog(null, "Você está reprovado.");
			
		}
	}
}
