import javax.swing.JOptionPane;

public class Treinamento1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros  = new int [10];
		for (int i=0; i<10; i++) { 
		numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) +" º numero:"));
			
		}
		for (int i=0; i<10; i++) { 
			JOptionPane.showMessageDialog(null, numeros[i]);
		}

	}

}
