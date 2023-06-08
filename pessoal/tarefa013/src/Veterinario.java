
public class Veterinario {

	public String examinar(Animal animal) {
		try {
			if(animal instanceof Cachorro || animal instanceof Cavalo || animal instanceof Preguica) {
				return animal.emitirSom();
			}
			else {
				throw new AnimalInvalidoException();
			}
		}
		catch(AnimalInvalidoException e) {
			return(e.getMessage());
		}
		
	}
	


}
