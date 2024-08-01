
public class Corpulence {
	private int taille, poids;
	
	public Corpulence(int pTaille, int pPoids){
		taille = pTaille;
		poids = pPoids;
	}
	
	public int getTaille() {
		return taille;
	}
	
	public int getPoids() {
		return poids;
	}
	
	public void setTaille(int pTaille) {
		if (pTaille>0) {
			taille = pTaille;
		}
		else {
			System.out.println("Error");
		}
	}
	
	public void setPoids(int pPoids) {
		if (pPoids>0) {
			poids = pPoids;
		}
		else {
			System.out.println("Error");
		}
	}
	
	public int IMC() {
		int corpulance = 0;
		if(poids<0 || taille<0) {
			corpulance = 0;
		} else {
			corpulance = (int) (10000*poids /(double)(taille*taille)) ;
		}
		return corpulance;
	}
	
	public String calculIMC() {
		int IMC = this.IMC();
		String str = new String();
		
		if(IMC < 18.5) {
			str = "anorexie";
		}else if ( IMC >=18.5 && IMC < 25) {
			str = "normal";
		}else if ( IMC >=25 && IMC < 30) {
			str = "surpoids";
		}else if ( IMC >=30 && IMC < 35) {
			str = "obésité";
		}else {
			str = "obésité morbide";
		}
		
		return str;	
	}
}
