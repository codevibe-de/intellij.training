package training.refactor.c_method_sign;

public class AnotherClass {

	// should 
	// - be public
	// - have name "offsetCurrentMillis"
	// - return a long
	// - accept a long
    int badName(String offset) {
        return (int) (System.currentTimeMillis() + Long.parseLong(offset));
    }

}
