package Criaturas;
import java.util.Random;
public abstract class Criatura {
	public String classZ[];
	public String classe;
	public int Z;
	public String terreno;
	public float ataque;
	public float defesa;
	public float energia;

	public Criatura(String terreno, float ataque, float defesa, float energia) {
		Random random = new Random();
		Z = random.nextInt(4);
		String classZ[] = new String[10];
		classZ[0] = "Tanque"; 
		classZ[1] = "Lutador";
		classZ[2] = "Retalhador";
		classZ[3] = "Controlador";
		classZ[4] = "Mago";
		classZ[5] = "Atirador";
		classZ[6] = "Assasino";
		this.ataque = ataque;
		this.terreno = terreno;
		this.defesa = defesa;
		this.energia = energia;
		switch(Z) {
		case 0:
			this.classe = classZ[0];
			break;
		case 1:
			this.classe = classZ[1];
			break;
		case 2:
			this.classe = classZ[2];
			break;
		case 3:
			this.classe = classZ[3];
			break;
		case 4:
			this.classe = classZ[4];
			break;
		case 5:
			this.classe = classZ[5];
			break;
		case 6:
			this.classe = classZ[6];
			break;
		}
	}

	public String getClasse() {
		return classe;
	}

	public String getTerreno() {
		return terreno;
	}

	public float getAtaque() {
		return ataque;
	}

	public float getDefesa() {
		return defesa;
	}

	public float getEnergia() {
		return energia;
	}

	public void infos() {
		for (int z = 0; z <= 26; z++) {
			System.out.print("=");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		System.out.println();
		System.out.print("Carregando Informações");
		for (int z = 0; z <= 2; z++) {
			System.out.print(".");
			try {
				Thread.sleep(700);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		System.out.println(" Pronto!");
		for (int z = 0; z <= 2; z++) {
			System.out.print("");
			try {
				Thread.sleep(30);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
			System.out.println("Sua classe: " + this.classe);
			System.out.println("O terreno padrão desse " + this.classe + " é: " + this.terreno);
			System.out.println("Ataque: " + this.ataque);
			System.out.println("Defesa: " + this.defesa);
			System.out.println("Energia: " + this.energia);
			System.out.println("===========================");
		}
	}

