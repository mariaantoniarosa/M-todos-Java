import javax.swing.JOptionPane;

public class Exercicio2 {
	//Cada m�dia dever� ser calculada por um m�todo;
	//Os dois m�todos devem receber como par�metros as notas;
	//No caso do m�todo da m�dia ponderada, al�m das notas, o m�todo dever� receber
	//tamb�m os pesos, que devem ser previamente solicitados ao usu�rio;
	//Os dois m�todos devem retornar a m�dia;
	//Um m�todo deve ser criado para receber a m�dia final e mostrar se o aluno est� 
	//aprovado ou reprovado, considerando que a m�dia m�nima para aprova��o � 7

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 0;
		double[] notas = new double[3];

		for (int i = 0; i < 3; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "� Nota"));
			// media += notas[i];
		}

		menu = Integer.parseInt(JOptionPane.showInputDialog("Informe 1 - M�DIA ARITM�TICA ou 2- M�DIA PONDERADA"));

		while ((menu != 1) && (menu != 2)) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Informe 1 - M�DIA ARITM�TICA ou 2- M�DIA PONDERADA"));
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
			// Cada vez que o FOR estiver passando ele ir� somar com o resultado do c�lculo
			// anterior			
		}
		
		Ponderada = Ponderada / totPeso;
		return Ponderada;
	}

	public static void MostrarMens(double media1) {
		JOptionPane.showMessageDialog(null, "A m�dia � "+media1);
		if (media1 >=7) {
			JOptionPane.showMessageDialog(null, "Voc� est� aprovado");
		}else {
			JOptionPane.showMessageDialog(null, "Voc� est� reprovado.");
			
		}
	}
}
