package training.refactor.k_introduce;

public class SomeService {

	private final String id;

	// TODO create a static method for calling this constructor named `ofId`
	// ("Introduce Factory")
	public SomeService(String id) {
		this.id = id;
	}

	// TODO create an indirection to this method via class `SomeServiceUtils`
	// ("Introduce Indirection")
	public String toUpper() {
		// TODO introduce a parameter for the content value
		var content = "abc";
		return content.toUpperCase();
	}
}
