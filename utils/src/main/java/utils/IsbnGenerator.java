package utils;

import java.util.UUID;

public class IsbnGenerator {

	private final String prefix;

	public IsbnGenerator(final String prefix) {
		this.prefix = prefix;
	}

	/**
	 * @return
	 */
	public String next() {
		return this.prefix + UUID.randomUUID().toString();
	}
}
