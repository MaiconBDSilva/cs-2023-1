
public class AnimalTeste {

	public static void main(String[] args) {
		
		//criando animais
		Cachorro cachorro = new Cachorro("Cachorro", 1);
		Cavalo cavalo = new Cavalo("Cavalo", 2);
		Preguica preguica = new Preguica("Preguica", 3);
		
		//emitindo sons
		System.out.printf("Cachorro: %s\n", cachorro.emitirSom());
		System.out.printf("Cavalo: %s\n", cavalo.emitirSom());
		System.out.printf("Preguica: %s\n", preguica.emitirSom());
		
		//criando veterinario
		Veterinario veterinario = new Veterinario();
		
		//examinando os tipos de animais
		System.out.printf("\nExaminando Cachorro: %s\n", veterinario.examinar(cachorro));
		System.out.printf("Examinando Cavalo: %s\n", veterinario.examinar(cavalo));
		System.out.printf("Examinando Preguica: %s\n", veterinario.examinar(preguica));
		
		//criando zoologico
		Zoologico zoologico = new Zoologico();
		
		//criando e adicionando animais no zoologico
		
		zoologico.animais[0] = new Cachorro("Cachorro 1", 1);
		zoologico.animais[1] = new Cavalo("Cavalo 1", 1);
		zoologico.animais[2] = new Preguica("Preguica 1", 1);
		zoologico.animais[3] = new Cachorro("Cachorro 2", 2);
		zoologico.animais[4] = new Cavalo("Cavalo 2", 2);
		zoologico.animais[5] = new Preguica("Preguica 2", 2);
		zoologico.animais[6] = new Cachorro("Cachorro 3", 3);
		zoologico.animais[7] = new Cavalo("Cavalo 3", 3);
		zoologico.animais[8] = new Preguica("Preguica 3", 3);
		zoologico.animais[9] = new Cachorro("Cachorro 4", 4);
		
		//System.out.printf("Examinando Preguica: %s\n", zoologico.animais[0].emitirSom());
		
		
		zoologico.verJaula();
		
		

	}

}
