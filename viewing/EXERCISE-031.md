# Übungen zum Kapitel 031

## Navigation

Schauen Sie sich den Code im Modul `viewing` an. Und dann:

1. Öffnen Sie die Klasse `LibraryApp`
1. Navigieren Sie zur Klasse der Variable `book`
1. Schließen Sie den Editor der Klasse `Book`

Zurück im Editor der Klasse `LibraryApp`:

1. Navigieren Sie zur Implementierung der `findByIsbn` Methode
2. ... und von dort zum deklarierenden Interface
3. Rufen Sie dort auf der `findByIsbn` Methode die Call-Hierarchy auf
4. navigieren Sie in dem Call-Hierarchy Tool mit Pfeiltasten und Eingabetaste zu der Stelle im `LoggingBookRepository`,
   von wo der Aufruf des Repositories erfolgt

## Suchen

### a) Suche 1

1. Schließen Sie alle offenen Editoren
2. Öffnen Sie das Interface `BookRepository` nur mit der Tastatur.
3. Springen Sie zum Symbol `decoratedRepository` in der `LoggingBookRepository`
   Klasse mit möglichst wenig Tastendrücken.

### b) Suche 2

Öffnen Sie die Datei `viewing/src/main/resources/data.txt` und nutzen Sie
Find/Replace mit regulären Ausdrücken und Capture-Groups um alle Werte in
Anführungsstriche einzubetten, also z.B. aus

````text
1;Bruce
````

wird

````text
"1";"Bruce"
````

### c) Suche 4

Suchen Sie im Modul `viewing` nach allen Dateien, die das Wort "memory"
enthalten. Wie viele sind es?