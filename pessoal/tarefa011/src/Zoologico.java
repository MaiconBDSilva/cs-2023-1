
public class Zoologico {
	
	public Animal animais[];
	
	public Zoologico() {
		this.animais = new Animal[10];
	}
	
	public void verJaula() {
		for(int i=0; i<this.animais.length; i++) {
			System.out.printf("\nVendo Jaula %d: %s\n", i+1, this.animais[i].emitirSom());
			if(animais[i] instanceof Cavalo || animais[i] instanceof Cachorro) {
				System.out.printf("Movimento do Animal: %s\n", animais[i].movimento());
			}
		}
	}
	
}
