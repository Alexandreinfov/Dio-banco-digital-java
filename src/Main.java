import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
        String stringDposiatar = JOptionPane.showInputDialog("Quanto deseja depositar: ");
        
        String stringtransferir = JOptionPane.showInputDialog("Quanto deseja transferir para poupança: ");
        //String stringValue = "12.34";

        double doubleDepositar = Double.parseDouble(stringDposiatar);
        double doubletransferir = Double.parseDouble(stringtransferir);
        
        
		Cliente Alexandre = new Cliente();
		Alexandre.setNome("Alexandre");
		
		Conta cc= new ContaCorrente(Alexandre);
		Conta poupanca= new ContaPoupanca(Alexandre);
		
		cc.depositar(doubleDepositar);
		cc.transferir(doubletransferir, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
