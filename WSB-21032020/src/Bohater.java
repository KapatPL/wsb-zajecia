/**
 * Klasa Bohater s³u¿y do przechowywania  informacji o bohaterah
 * 
 * @version 0.1
 * @since 2020-03-21
 * @author Tomek Kpauœciarek
 * 
 * 
 */
public class Bohater {
	private String strHeroName;
	private String strTrueName;
	private boolean boolHeroUseCape;
	private String strUniverse;
	
	
	/**
	 * 
	 * @return pobiera ksywkê bohatera
	 */
	public String getStrHeroName() {
		return strHeroName;
	}

	/**
	 * 
	 * @param strHeroName ustawia ksywê bochatera
	 */
	public void setStrHeroName(String strHeroName) {
		this.strHeroName = strHeroName;
	}

	/**
	 * 
	 * @return zwraca prawdziwe imie bohatera
	 */
	public String getStrTrueName() {
		return strTrueName;
	}

	/**
	 * 
	 * @param strHeroName ustawia imie bochatera
	 */
	public void setStrTrueName(String strTrueName) {
		this.strTrueName = strTrueName;
	}

	/**
	 * 
	 * @return zwraca czy bohater u¿ywa peleryny True or False
	 */
	public boolean isBoolHeroUseCape() {
		return boolHeroUseCape;
	}

	/**
	 * 
	 * @param boolHeroUseCape ustawia czy bohater u¿ywa pelerynê
	 */
	public void setBoolHeroUseCape(boolean boolHeroUseCape) {
		this.boolHeroUseCape = boolHeroUseCape;
	}

	
	public String getStrUniverse() {
		return strUniverse;
	}
	
	/**
	 * 
	 * @param strUniverse ustawia œwiat z jakiego jest bohater
	 */
	public void setStrUniverse(String strUniverse) {
		this.strUniverse = strUniverse;
	}

	public Bohater() {
		this.strHeroName="";
		this.strTrueName="";
		this.strUniverse="";
		this.boolHeroUseCape = false;
	}
	
	public Bohater(String HeroName, String TrueName, String Universe, Boolean UseCape) {
		this.strHeroName=HeroName;
		this.strTrueName=TrueName;
		this.strUniverse=Universe;
		this.boolHeroUseCape = UseCape;
	}
	
	@Override
	public String toString() {
		return "Pseudonim Bohatera: "+strHeroName+"\n"
				+"Prawdziwe imiê: "+strTrueName+"\n"
				+"Œwiat pochodzenia: "+strUniverse+"\n"
				+"Czy u¿ywa peleryny: "+isBoolHeroUseCape()+"\n";	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Bohater)) {
			return false;
		}
		Bohater b = (Bohater) o;
		if (b.strTrueName == this.getStrTrueName()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Bohater b1 = new Bohater();
		b1.setStrHeroName("Spider-man");
		b1.setStrTrueName("Peter Parker");
		b1.setStrUniverse("Marvel");
		b1.setBoolHeroUseCape(false);
		
		Bohater b2 = new Bohater("Supermen", "Clark Cent", "DC", true);
		Bohater b3 = new Bohater("Iron-man", "Clark Cent", "DC", true);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.print("B1=B2 Czy ci bohaterowie mog¹ byæ t¹ sam¹ osob¹??? : ");
		if (b1.equals(b2)) {
			System.out.print("Tak");
		} else {
			System.out.print("Nie");
		}
		
		System.out.println();
		System.out.print("B2=B3 Czy ci bohaterowie mog¹ byæ t¹ sam¹ osob¹??? : ");
		if (b2.equals(b3)) {
			System.out.print("Tak");
		} else {
			System.out.print("Nie");
		}
			
	}

}
