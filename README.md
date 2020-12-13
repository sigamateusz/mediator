# Mediator - Fan Controller
Projekt przedstawia komunikację poszczególnych części wentylatora z pomocą wzorca `Mediator`.

## Problem
Problem, jaki mógłby wystąpić w sytuacji niewykorzystania *mediatora* to silne powiązanie klas.
Obiekty klas `Button` oraz `PowerSupplier` mogłyby być przypisane do pól w klasie `Fan` co prowadziłoby do np. bezpośredniego uruchamiania wentylatora poprzez przycisk, który nie mógłby być wykorzystany już w innym miejscu czy nawet zupełnie innej aplikacji.

## Rozwiązanie
Dzięki zastosowaniu wzorca *mediator* żadna z klas nie wie o pozostałych, a co najwyżej o samym mediatorze.
* Klasa `Button` może być wykorzystana w kontekście zupełnie innego urządzenia, a nawet akcja na wciśnięcie przycisku może być całkowicie inna.
* Klasa `PowerSupplier` nie wie jakie urządzenie zasila i czy w ogóle coś z niej korzysta, dzięki czemu można jej użyć w innym projekcie.
* Klasa `Fan` nie wie czym jest zasilane urządzenie, ani co triggeruje uruchomienie.

Klasy komunikują się za sobą jedynie przez obiekt klasy `Mediator` dzięki czemu łatwo możemy również zmienić źródło zasilania czy np. zamiast przycisku wykorzystać sterowanie zdalne.

## Prezentacja
Klasa `Main` zawiera skrypt printujący w konsoli zachowanie wentylatora na zdarzenie wciśnięcia przycisku.