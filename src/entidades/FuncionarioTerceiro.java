package entidades;

public class FuncionarioTerceiro extends Funcionario {
	
	private Double cobranca;
	
	public FuncionarioTerceiro(String nome, Integer horas, Double valorPorHora, Double cobranca) {
		super(nome, horas, valorPorHora);
		this.cobranca = cobranca;
	}

	public Double getCobranca() {
		return cobranca;
	}

	public void setCobranca(Double cobranca) {
		this.cobranca = cobranca;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + cobranca * 1.1;
	}

}
