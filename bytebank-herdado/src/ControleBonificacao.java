
public class ControleBonificacao {

	private double some;

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.some += boni;
	}

	public double getSome() {
		return this.some;
	}

}
