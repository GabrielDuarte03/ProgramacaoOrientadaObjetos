
public class ContaBanco {

	public int nmrConta;
	protected String tipo;
	private String nomeDono;
	private Double saldo;
	private Boolean status;
	
	public ContaBanco() {
		this.saldo = 0.00;
		this.status = false;
	}
	public void abrirConta(String tipo) {
		status = true;
		this.tipo = tipo;
		if(this.tipo.equalsIgnoreCase("CC")) {
			this.saldo = 50.00;
			System.out.println("Conta Corrente aberta com sucesso!");
			System.out.println("-------------------------------------------------------------");
		}else if(this.tipo.equalsIgnoreCase("CP")) {
			this.saldo = 150.00;
			System.out.println("Conta Poupança aberta com sucesso!");
			System.out.println("-------------------------------------------------------------");
		}else {
			System.out.println("Tipo de conta inválido\nEscolha entre CC (Conta Corrente) ou CP (Conta Poupança)");
		}
	}
	public void fecharConta (Double saldo) {
		this.saldo = saldo;
		if(this.saldo > 0) {
			System.out.println("Antes de fechar a conta, retire o dinheiro da conta");
			System.exit(0);
		}else if(this.saldo==0) {
			status = false;
			System.out.println("Conta fechada com sucesso");
		}else {
			System.out.println("Conta não pode ser fechada pois há débitos");
		}
	}
	public void sacar(Double valor) {
		if(status == true) {
			if(saldo >= valor) {
				this.saldo -= valor; 
				System.out.println("Saque concluído com sucesso!\n");
			}else {
				System.out.println("Você não tem saldo suficiente para sacar!\n");
			}
		}else {
			System.out.println("Abra uma conta primeiro!");
		}
	}
	public void depositar(Double valor) {
		if(status == true) {
			
			this.saldo += valor; 
			System.out.println("Depositado com sucesso!\n");
			
		}else {
			System.out.println("Abra uma conta primeiro!");
		}
	}
	public void pagarMensal() {
		if(this.tipo.equalsIgnoreCase("CC")) {
			this.saldo -= 12.00;
		}else {
			this.saldo -= 20.00;
		}
	}
	
	//getters e setters
	public int getNmrConta() {
		return this.nmrConta;
	}
	public void setNmrConta(int nmrConta) {
		this.nmrConta = nmrConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Boolean getStatus() {
	
		if(status == true) {
			System.out.println("Olá, "+this.nomeDono+"!");
			System.out.println("Sua conta "+this.tipo+" está aberta");
			System.out.println("O número da sua conta é: "+this.nmrConta);
			System.out.println("Com saldo de R$ "+this.saldo);
		}else {
			System.out.println("Essa conta não está aberta");
		}
		
		
		return status;
		
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
	
}