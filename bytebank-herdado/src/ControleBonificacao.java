
public class ControleBonificacao {
	
	private double soma;

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
 double getSoma() {
		return soma;
	}
	
}
