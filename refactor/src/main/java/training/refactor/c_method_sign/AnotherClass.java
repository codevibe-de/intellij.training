package training.refactor.c_method_sign;

public class AnotherClass {

    // TODO change signature so that
	// - method is public
	// - has name "offsetCurrentMillis"
	// - returns a long
	// - accepts a long
    int badName(String offset) {
        return (int) (System.currentTimeMillis() + Long.parseLong(offset));
    }

}
