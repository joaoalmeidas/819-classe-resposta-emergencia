import java.util.Date;

public class Emergencia {


	
	private String descricao;
	private String local;
	private Date dataEHora;
	private NaturezaDaEmergencia natureza;
	private Tipo tipo;
	private Status status;
	
	
	public Emergencia(String local, String descricao, NaturezaDaEmergencia natureza) {
		super();
		this.descricao = descricao;
		this.local = local;
		this.dataEHora = new Date();
		this.natureza = natureza;
		
		if(natureza == NaturezaDaEmergencia.ASSALTO || natureza ==  NaturezaDaEmergencia.ROUBO || natureza ==  NaturezaDaEmergencia.ASSALTO) {
			
			this.tipo = Tipo.POLICIA;
			
		}else if(natureza == NaturezaDaEmergencia.INCENDIO || natureza == NaturezaDaEmergencia.RESGATEDEANIMAIS || natureza == NaturezaDaEmergencia.ENCHENTE) {
			
			this.tipo = Tipo.BOMBEIROS;
			
		}else if(natureza == NaturezaDaEmergencia.ACIDENTEDECARRO || natureza == NaturezaDaEmergencia.ACIDENTEDOMESTICO) {
			
			this.tipo = Tipo.AMBULANCIA;
			
		}
			
		this.status = Status.COLETANDO_INFORMACOES;
		
	}
	
	
	
	
}
