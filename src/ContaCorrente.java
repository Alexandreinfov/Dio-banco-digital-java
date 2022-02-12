
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		String c = "Conta Corrente";
		super.imprimirInfoComuns(c);
	}

	
}
