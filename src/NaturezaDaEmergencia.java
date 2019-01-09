
public enum NaturezaDaEmergencia {
	
	
	ROUBO(1), BRIGA(2), ASSALTO(3), INCENDIO(4), RESGATEDEANIMAIS(5), ENCHENTE(6), ACIDENTEDOMESTICO(7), ACIDENTEDECARRO(8);
	
	
	private final int opcao;

	private NaturezaDaEmergencia(int opcao) {
		this.opcao = opcao;
	}

	public int getOpcao() {
		return opcao;
	}
	
	
	
}
