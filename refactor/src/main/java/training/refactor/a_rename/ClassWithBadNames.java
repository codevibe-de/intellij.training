package training.refactor.a_rename;

public class ClassWithBadNames {

    private String xxx; // TODO rename to "name"

    public ClassWithBadNames() {
        yyy();
    }

    // TODO rename to "init()"
    private void yyy() {
    }

}
