package training.refactor.o_safedelete;

public class CallHierarchy2 {

    // TODO safe-delete this method
    private void foo(int i) {
        bar(i);
    }

    private void bar(int i) {
        baz(i);
    }

    private void baz(int i) {
    }

}