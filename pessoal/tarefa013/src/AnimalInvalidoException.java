
public class AnimalInvalidoException extends Exception {

	private static final long serialVersionUID = -302409893085705190L;
	
	
	@Override
	public String getMessage() {
		return "Tipo de Animal Inválido";
	}
}
