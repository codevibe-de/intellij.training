package training.refactor.b_move;

public class TargetClass {

    private static int n;

    // TODO move this method and the static field "n" to class `MainB`
    public static void someStaticMethod() {
        var x = n;
    }

}
