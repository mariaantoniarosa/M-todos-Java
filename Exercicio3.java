import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fa�a um programa que a partir do valor de uma compra, fa�a o c�lculo de um
//desconto para o usu�rio. O programa deve solicitar o valor total da compra
//por meio de um m�todo, que dever� retorn�-lo. Um m�todo deve ser criado
//para receber o valor da compra e mostrar o valor final com desconto, considerando:
		//At� R$100 - sem desconto, o valor permanece o mesmo
		//De R$100,01 a R$200 - desconto de 20%
		//Acima de R$200 - desconto de 30%

		
		//Pedevalor ();
		valorTotal();
	}

	
	public static double Pedevalor () {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da compra"));
		return valor;
		
	}
	public static void valorTotal () {
		double valor = Pedevalor();
		double desconto =0; 
		if (valor<=100) {
		JOptionPane.showMessageDialog(null, "N�o h� descontos para compras abaixo de R$100,00. Valor total: R$"+valor);
		}else if ((valor>=100.01) && (valor<=200)) {
		//}else if ((valor> 100) && (valor<=200)) {
			desconto = valor - (valor *0.20) ;
			JOptionPane.showMessageDialog(null, "Voc� recebeu um desconto de 20%. Valor total: R$"+desconto);
		}else if (valor>=200.01) {
		//}else if (valor>200) {
			desconto = valor- (valor *0.30);
			JOptionPane.showMessageDialog(null, "Voc� recebeu um desconto de 30%. Valor total: R$"+desconto);
		}
	}
}


