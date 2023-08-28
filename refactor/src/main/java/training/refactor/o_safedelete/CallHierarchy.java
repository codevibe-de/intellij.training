package training.refactor.o_safedelete;

public class CallHierarchy {

    private void foo(int i) {
        bar(i);
    }

    private void bar(int i) {
        baz(i);
    }

    // TODO safe-delete parameter `i`
    private void baz(int i) {
    }

}