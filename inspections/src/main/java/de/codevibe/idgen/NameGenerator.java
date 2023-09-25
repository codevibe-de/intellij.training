package de.codevibe.idgen;

public interface NameGenerator {

    public abstract void initialize();

    /**
     * @param prefix the prefix to use (deprecated)
     * @return a name generated according to the configuration of this generator
     */
    String generate();

}
