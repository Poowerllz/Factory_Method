package MonstroFabrica;

import Criaturas.*;

public abstract class FactoryCriatura {

	public static Criatura getCriatura(String tipo) {
		if(tipo.equals("Ahri")) {
			return new Ahri ("Ar",8,2,7);
		}else if(tipo.equals("Anivia")) {
			return new Anivia("Ar",9,1,8);
		}else if(tipo.equals("Cassiopeia")) {
			return new Cassiopeia("Terra",7,3,10);
		}else if(tipo.equals("Corki")) {
			return new Corki("Ar",5,5,10);
		}else if(tipo.equals("Ekko")) {
			return new Ekko("Terra",9,9,10);
		}else if(tipo.equals("Fizz")) {
			return new Fizz("Agua",10,0,10);
		}else if(tipo.equals("Kassadin")) {
			return new Kassadin("Vazio",7,3,8);
		}else if(tipo.equals("Katarina")) {
			return new Katarina("Terra",8,2,0);
		}else if(tipo.equals("LeBlanc")) {
			return new LeBlanc("Terra",10,0,6);
		}else if(tipo.equals("Lissandra")) {
			return new Lissandra("Terra",8,2,7);
		}else if(tipo.equals("Lux")) {
			return new Lux("Ar",10,0,10);
		}else if(tipo.equals("Malzahar")) {
			return new Malzahar("Vazio",5,5,10);
		}else if(tipo.equals("Orianna")) {
			return new Orianna("Terra",7,3,7);
		}else if(tipo.equals("Sylas")) {
			return new Sylas("Terra",5,5,9);
		}else if(tipo.equals("Talon")) {
			return new Talon("Terra",10,0,5);
		}else if(tipo.equals("Syndra")) {
			return new Syndra("Vazio",8,2,7);
		}else if(tipo.equals("Talon")) {
			return new Talon("Terra",10,1,1);
		}else if(tipo.equals("TwistedFate")) {
			return new TwistedFate("Terra",8,2,10);
		}else if(tipo.equals("Veigar")) {
			return new Veigar("Terra",8,2,10);
		}else if(tipo.equals("Viktor")) {
			return new Viktor("Terra",10,1,10);
		}else if(tipo.equals("Vladmir")) {
			return new Vladmir("Terra",4,3,10);
		}else if(tipo.equals("Xerath")) {
			return new Xerath("Terra",10,0,1);
		}else if(tipo.equals("Yasuo")) {
			return new Yasuo("Terra",10,10,10);
		}else if(tipo.equals("Zed")) {
			return new Zed("Terra",7,3,10);
		}else if(tipo.equals("Zoe")) {
			return new Zoe("Terra",8,2,10);
		}
		return null;
	}

}
