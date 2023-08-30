package training.refactor.b_move;

public class SomeClass {

    private TargetClass target = new TargetClass();

    private final double defaultFactor = 4.2;

    // TODO move this method to class `TargetClass`
    public int calculateSomething(int n, double factor) {
        return (int) (n * factor);
    }

    // TODO can you move this method as well? Why not?
    public int calculateSomething(int n) {
        return calculateSomething(n, defaultFactor);
    }

}
