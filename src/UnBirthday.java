import javax.swing.JOptionPane;

public class UnBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String answer = JOptionPane.showInputDialog("When is your birthday?")	;
if(answer.equals("Febuary 11")){
	JOptionPane.showConfirmDialog(null,"Happy birthday");}
	else {JOptionPane.showInputDialog("Happy unbirthday");}
}
}
