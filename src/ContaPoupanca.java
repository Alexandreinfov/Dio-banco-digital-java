
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		String p = "Extratao Conta Poupan�a"; 
		super.imprimirInfoComuns(p);
	}
	
}
