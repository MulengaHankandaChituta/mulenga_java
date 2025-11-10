import javax.swing.JOptionPane;
public class AirlineDialog {

	public static void main(String[] args) {
		
		int selection;
		boolean inYes;
		selection = JOptionPane.showConfirmDialog(null,
		   "Do you want to upgrade to first class?");
		inYes = (selection == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "You responded " + inYes);

	}

}
