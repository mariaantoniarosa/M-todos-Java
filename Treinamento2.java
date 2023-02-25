import javax.swing.JOptionPane;

public class Treinamento2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] valores = new int [6][4];
		for (int l=0; l<6; l++) {
		for (int c=0;  c<4; c ++) { 
			valores [l][c] = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores"));
			
		}
		}
		String aux = "";
for (int l=0; l<6; l++) {
	for (int c=0; c<4; c++) { 
		aux += valores[l][c]+ "    ";
		
	}
	aux+= "\n" ;
}
JOptionPane.showMessageDialog(null, aux);
	}

}
