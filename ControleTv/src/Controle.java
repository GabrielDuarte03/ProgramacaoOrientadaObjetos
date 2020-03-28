
public class Controle {

	public static void main(String[] args) {

		ControleModel controle = new ControleModel();
		controle.ligarTv();
		controle.entrarMenu();
		controle.mudarCanalBaixo();
		controle.mudarCanalCima();
		controle.aumentarVolume();
		controle.diminuirVolume();
		controle.nmrVolume(35);
		controle.nmrCanal(9);
		controle.desligarTv();
	}

}
