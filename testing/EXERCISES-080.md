# Übungen zum Thema "080 - Testing"

Schauen Sie sich den bestehenden Test `src/test/java/de/codevibe/IdGeneratorTest.java` an.

1. Führen Sie diesen aus und beheben Sie den Bug im Source-Code, sodass der Test erfolgreich ist (Tipp: "%03d")
2. Ergänzen Sie den Test um weitere Assertions
3. Erzeugen Sie eine `getPrefix()` Methode in dem `IdGenerator` und erzeugen Sie eine neue Testmethode, um den Getter zu
   testen
4. Ergänzen Sie beide Tests um eine `@Tag("commit")` Annotation und legen Sie eine Run Configuration an, die alle Tests
   mit diesem Tag ausführt

