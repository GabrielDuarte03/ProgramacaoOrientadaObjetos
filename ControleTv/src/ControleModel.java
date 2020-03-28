
public class ControleModel {
	private boolean ligado ;
	private int volume ;
	private int canal ;
	
	public ControleModel() {
	
		this.ligado = false;
		this.volume = 0;
		this.canal = 0;
	}
	public void nmrCanal(int a) {
		//Muda o canal por número e não de um a um SE A TV ESTIVER LIGADA
		if(this.isLigado() && a>0) {
		System.out.println("Trocando de canal...");
		this.setCanal(a);
		}else if(!this.ligado) {
			System.out.println("**LIGUE A TV PRIMEIRO!**");
		}else if(this.isLigado() && a<=0) {
			System.out.println("Canal inválido");
		}
	}
	public void mudarCanalCima() {
		//Muda canal para cima (se estava no canal 7, usando esse método irá para o canal 8) SE A TV ESTIVER LIGADA
		if(this.isLigado()) {
		this.setCanal(this.getCanal()+1);
		System.out.println("VOCÊ ESTÁ ASSISTINDO AO CANAL: "+this.getCanal());
		}else {
			System.out.println("**LIGUE A TV PRIMEIRO!**");
		}
		}
	public void mudarCanalBaixo() {
		//Muda canal para baixo (se estiver no canal 5, usando esse método irá para o canal 4) SE A TV ESTIVER LIGADA
		if(this.isLigado()) {
		this.setCanal(this.getCanal()-1);
		System.out.println("VOCÊ ESTÁ ASSISTINDO AO CANAL: "+this.getCanal());
	}else {
		System.out.println("**LIGUE A TV PRIMEIRO!**");
	}
		}
	public void ligarTv() {
		//Liga a tv
		if(this.isLigado()) {
			System.out.println("A TV JÁ ESTÁ LIGADA");
		}else {
			System.out.println("SEJA BEM-VINDO");
			this.setCanal(7);
			this.setVolume(15);
			this.setLigado(true);
			
		}
		}
	public void desligarTv() {
		//Desliga a tv
		if(this.isLigado()) {
			this.setCanal(0);
			this.setVolume(0);
			this.setLigado(false);
			System.out.println("ATÉ A PRÓXIMA");	
		}else {
			System.out.println("A TV JÁ ESTÁ DESLIGADA");
		}
		}
	public void aumentarVolume() {
		//aumenta o volume
		if(this.isLigado() && this.getVolume()<100) {
		this.setVolume(this.getVolume()+1);
		System.out.println("Volume atual: "+getVolume());
		}else if(!this.isLigado()){
			System.out.println("**LIGUE A TV PRIMEIRO!**");
		}else if(this.isLigado() && this.getVolume()>100) {
			System.out.println("IMPOSSÍVEL AUMENTAR, JÁ ESTÁ NO VOLUME MÁXIMO");
		}
	}
	public void diminuirVolume() {
		//DIMINUI o volume
		if(this.isLigado() && this.getVolume()>0) {
		this.setVolume(this.getVolume()-1);
		System.out.println("Volume atual: "+getVolume());
		}else if(!this.isLigado()){
			System.out.println("**LIGUE A TV PRIMEIRO!**");
		}else if(this.isLigado() && this.getVolume()<=0) {
			System.out.println("IMPOSSÍVEL DIMINUIR, JÁ ESTÁ NO VOLUME MÍNIMO");
		}

	}
	public void nmrVolume(int a){
		//muda volume para o número específico
		if(this.isLigado() && a>0) {
			System.out.println("Aumentando o volume...");
			this.setVolume(a);
			}else if(!this.ligado) {
				System.out.println("**LIGUE A TV PRIMEIRO!**");
			}else if(this.isLigado() && a<0) {
				System.out.println("Volume inválido");
			}
		}
	
 	public void entrarMenu(){
		if(this.isLigado()) {
		System.out.println("----------M E N U---------- ");
		System.out.println("\n-Você está assistindo o canal: "+this.getCanal());
		System.out.println("\n-No volume: "+this.getVolume());
		}else {
			System.out.println("**LIGUE A TV PRIMEIRO!**");
		}
	}
	private int getCanal() {
		return canal;
	}
	private void setCanal(int canal) {
		this.canal = canal;
	}
	private boolean isLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	
}
