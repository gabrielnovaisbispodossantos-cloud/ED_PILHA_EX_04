package view;
import javax.swing.*;
import controller.converteController;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		converteController c = new converteController();

        int num = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um número até 1000")
        );

        if (num < 0 || num > 1000) {
            System.out.println("Número inválido!");
        } else {

            String bin = c.decToBin(num);

            System.out.println("Binário: " + bin);
        }
	}

}
