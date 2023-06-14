A. Struktura systemu lub aplikacji:

Projekt składa się z dwóch pakietów: "banking" i "website". Każdy pakiet zawiera implementację różnych komponentów,
 takich jak programiści, testerzy i kierownicy projektów, a także fabryki poleceń projektu.

 Interfejsy są zdefiniowane
 w pakiecie "interfaces" i zapewniają wspólne metody dla każdej roli w zespole projektowym.



B. Scenariusze testowe:




Testy jednostkowe w pakiecie „banking”:

projectManagerShouldPrintMessage(): Ten test sprawdza, czy obiekt klasy BankingProjectManager
poprawnie drukuje komunikat podczas zarządzania projektem bankowym. Sprawdza, czy metoda manageProject() działa poprawnie.


javaDeveloperShouldPrintMessage(): Ten test sprawdza, czy obiekt klasy JavaDeveloper
 prawidłowo wyświetla komunikat podczas pisania kodu Java. Sprawdza poprawność metody writeCode().


qaTesterShouldPrintMessage(): Ten test sprawdza, czy obiekt klasy
QATester prawidłowo wyświetla komunikat podczas testowania kodu. Sprawdza poprawność metody testCode().



Testy integracyjne w pakiecie „banking”:

bankingProjectManagerAndJavaDeveloperIntegrationTest(): Ten test sprawdza
interakcję między obiektami klas BankingProjectManager i JavaDeveloper. Sprawdza, czy oba
obiekty działają w harmonii i wysyłają oczekiwane komunikaty.

javaDeveloperAndTesterIntegrationTest(): Ten test sprawdza interakcję między
obiektami klasy JavaDeveloper i QATester. Sprawdza, czy oba obiekty działają w harmonii i wysyłają oczekiwane komunikaty.


Еesty akceptacyjne w pakiecie „banking”:

bankingProjectTeamFactoryTest(): Ten test sprawdza działanie fabryki
 poleceń BankingTeamFactory. Tworzy zespół projektowy i sprawdza, czy zwrócone obiekty są
 prawidłowymi instancjami klas JavaDeveloper, QATester i BankingProjectManager.

bankingProjectExecutionTest(): Ten test symuluje wykonanie projektu bankowego przy użyciu
obiektów z klas JavaDeveloper, QATester i BankingProjectManager. Sprawdza, czy projekt działa pomyślnie
i drukuje oczekiwane komunikaty.




Testy w pakiecie „website” działają bodobnym sposobem jak i w pakiecie "banking"



Testy jednostkowe w pakiecie „interfaces”:

phpDeveloperImplementsInterface(): Ten test sprawdza, czy klasa PHPDeveloper poprawnie implementuje interfejs programisty.

websiteProjectManagerImplementsInterface(): Ten test sprawdza, czy klasa WebsiteProjectManager poprawnie implementuje
interfejs ProjectManager.

websiteTesterImplementsInterface(): Ten test sprawdza, czy klasa WebsiteTester poprawnie implementuje interfejs Tester.

javaDeveloperImplementsInterface(): Ten test sprawdza, czy klasa JavaDeveloper poprawnie
implementuje interfejs programisty.

bankingProjectManagerImplementsInterface(): Ten test sprawdza, czy klasa BankingProjectManager poprawnie
implementuje interfejs ProjectManager.

qaTesterImplementsInterface(): Ten test sprawdza, czy klasa QATester poprawnie implementuje interfejs Tester

C. Użyte narzędzia i biblioteki:


JUnit 5: Jest to popularny framework do pisania i uruchamiania testów w języku Java. Zapewnia szeroką gamę adnotacji i
narzędzi do tworzenia skryptów testowych, zarządzania ich wykonaniem i weryfikacji oczekiwanych wyników.

Java: Język programowania, w którym pisane są testy. Java zapewnia szerokie wsparcie dla programowania obiektowego
i zapewnia potężne narzędzia do tworzenia i testowania oprogramowania.

D.Ewentualne problemy i ich rozwiązania

Ponieważ metody writeCode(), manageProject(), testCode() nie zwracają wartości,
utworzono zmienną wynikową, do której wpisano dane z metody writeCode()
i ta zmienna została zwrócona przez metodę getStringResult()