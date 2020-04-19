package Nucleo;

import Criaturas.*;
import MonstroFabrica.FactoryCriatura;

public class Aplicacao {

	public static void main(String[] args) {
		Criatura Champ1 = FactoryCriatura.getCriatura("Lux");
		Champ1.infos();
		Criatura Champ2 = FactoryCriatura.getCriatura("Zed");
		Champ2.infos();
		Criatura Champ3 = FactoryCriatura.getCriatura("Zoe");
		Champ3.infos();
	}
}
