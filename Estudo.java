import javax.swing.JOptionPane;

public class Estudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Principal chamando os m�todos criados
		int valor = 0;
		valor = metodoParaValor();
		ImpressaoVal(valor);
	}

	//metodo com retorno vai retornar o valor para o metodo main 
	public static int metodoParaValor() {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		return valor;
	}
	
	//metodo vazio sem retorno no qual ir� receber um valor do m�todo  main como par�metro
	public static void ImpressaoVal(int valor) {
		JOptionPane.showMessageDialog(null, valor);
	}

}
