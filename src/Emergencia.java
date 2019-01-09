import java.util.Date;
import java.util.Scanner;

public class Emergencia {

	
	
	private String descricao;
	private String local;
	private Date dataEHora;
	private NaturezaDaEmergencia natureza;
	private Tipo tipo;
	private Status status;
	
	
	public Emergencia() {
		super();
		
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("Descreva o Problema:");
		this.descricao = input.nextLine();
		
		System.out.println("Qual a sua localização:");
		this.local = input.nextLine();
		
		
		this.dataEHora = new Date();
		
		System.out.println("Qual a natureza da sua emergência\n"
				+ "1-Roubo\n"
				+ "2-Assalto\n"
				+ "3-Briga\n"
				+ "4-Incendio\n"
				+ "5-Enchente\n"
				+ "6-Resgate De Animais\n"
				+ "7-Acidente De Carro\n"
				+ "8-Acidente Doméstico\n");
		
		opcao = input.nextInt();
		
		switch (opcao) {
			
			case 1:
				this.natureza = NaturezaDaEmergencia.ROUBO;
				break;
				
			case 2:
				this.natureza = NaturezaDaEmergencia.ASSALTO;
				break;
				
			case 3:
				this.natureza = NaturezaDaEmergencia.BRIGA;
				break;
				
			case 4:
				this.natureza = NaturezaDaEmergencia.INCENDIO;
				break;
				
			case 5:
				this.natureza = NaturezaDaEmergencia.ENCHENTE;
				break;
				
			case 6:
				this.natureza = NaturezaDaEmergencia.RESGATEDEANIMAIS;
				break;
				
			case 7:
				this.natureza = NaturezaDaEmergencia.ACIDENTEDECARRO;
				break;
				
			case 8:
				this.natureza = NaturezaDaEmergencia.ACIDENTEDOMESTICO;
				break;
				
		}
			

		
		if(natureza == NaturezaDaEmergencia.ASSALTO || natureza ==  NaturezaDaEmergencia.ROUBO || natureza ==  NaturezaDaEmergencia.BRIGA) {
			
			this.tipo = Tipo.POLICIA;
			
		}else if(natureza == NaturezaDaEmergencia.INCENDIO || natureza == NaturezaDaEmergencia.RESGATEDEANIMAIS || natureza == NaturezaDaEmergencia.ENCHENTE) {
			
			this.tipo = Tipo.BOMBEIROS;
			
		}else if(natureza == NaturezaDaEmergencia.ACIDENTEDECARRO || natureza == NaturezaDaEmergencia.ACIDENTEDOMESTICO) {
			
			this.tipo = Tipo.AMBULANCIA;
			
		}
			
		this.status = Status.COLETANDO_INFORMACOES;
		
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public Date getDataEHora() {
		return dataEHora;
	}


	public void setDataEHora(Date dataEHora) {
		this.dataEHora = dataEHora;
	}


	public NaturezaDaEmergencia getNatureza() {
		return natureza;
	}


	public void setNatureza(NaturezaDaEmergencia natureza) {
		this.natureza = natureza;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
	
}
