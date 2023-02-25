import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculaIdade();


	}

	public static int pedeAno() {

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano que você nasceu"));
		return ano;

		// public static double calculaIndice(int peso, double altura) {
		// double imc = peso / (altura*altura);
		// return imc;
	}

	//public static void calculaIdade(int ano) {
	public static void calculaIdade() {
		int ano = pedeAno(); 
		int idade =   2021- ano;
		JOptionPane.showMessageDialog(null, "Sua idade é " + idade);

	}

}
