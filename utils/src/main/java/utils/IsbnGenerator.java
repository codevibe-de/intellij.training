package utils;

import java.util.UUID;

public class IsbnGenerator {

	public String next() {
		return UUID.randomUUID().toString();
	}
}
