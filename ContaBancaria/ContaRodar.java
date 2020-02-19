public class ContaRodar {

	public static void main(String[] args) {

		ContaBanco conta1 = new ContaBanco();  
		conta1.setNmrConta(234);
		conta1.setNomeDono("Gabriel Duarte");
		conta1.abrirConta("CC");
		conta1.depositar(10000.00);
		conta1.getStatus();
				
		
		
		
	}

}
