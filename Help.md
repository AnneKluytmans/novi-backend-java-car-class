# Opdrachtbeschrijving - Auto database

## Inleiding
Je gaat een class schrijven die we kunnen gebruiken om oneindig veel Auto-instanties te kunnen creëren. Zo kun je een mooie start maken met het aanmaken van classes, instanties en alle bijbehorende logica. Je kunt deze opdracht maken door het project te clonen of te downloaden naar jouw eigen computer via deze GitHub repository. De uitwerkingen staan op de branch _uitwerkingen_.

## Voor je begint

Je hebt IntelliJ IDEA en de JDK (Java Development Kit) versie 17 of hoger nodig - deze heb je beiden via de instructies op EdHub geïnstalleerd.

### 🟩 Code runnen (vanuit IntelliJ)
Klik op de groene play-knop voor de main-methode en kies 'Run...'.
### 🟨 Testen uitvoeren (vanuit IntelliJ)
Klik op de groene play-knop voor de MainTest-class in src/test/java en kies 'Run 'MainTest''.
### ⬛ Code runnen (met Maven)
Of, als je bekend bent met de terminal, kun je de applicatie runnen met:
```shell
./mvnw clean compile exec:java
```
of
```shell
mvnw.cmd clean compile exec:java
```

## Opdracht
Je gaat een blauwdruk maken van een Car-class, zodat je hier verschillende Car-instanties van kunt maken. Het eindresultaat moet voorzien zijn van de volgende specificaties:
* Een Car-class heeft de volgende velden, waarvan je zelf mag bedenken wat de bijbehorende types zijn:
    * het merk (zoals Volvo of Toyota),
    * het type (zoals Aygo of CX90),
    * het bouwjaar (zoals 2001 of 2020),
    * de kleur (zoals geel of rood)
    * en de motorinhoud (zoals 1.2 of 1.6).
* Bij het aanmaken van een Car-object, moeten direct alle bovenstaande gegevens van de auto worden meegegeven aan de constructor. Je zult de constructor dus zelf moeten schrijven.
* De Car-class heeft een methode die, wanneer je deze aanroept, een beschrijving in de terminal print: "Deze [merk] [type] is [kleur]". De daadwerkelijke inhoud van deze zin is dus afhankelijk van de Car-instantie waarop hij wordt aangeroepen.
* Je hebt minstens de volgende Car-instanties aangemaakt:
* Een groene Fiat 500 uit 2019 met een motorinhoud van 1.4;
* Een blauwe Toyota Aygo uit 2016 met een motorinhoud van 1.2;
* Een zwarte Volvo CX90 uit 2022 met een motorinhoud van 2.0;
* Je hebt alle Car-instanties in de terminal gelogd en op alle instanties de beschrijving-methode aangeroepen.

Om te valideren dat je klaar bent, kun je `testen` draaien. In `src/test/java` vind je een class met de naam `MainTest`. Links daarvan staat een groen pijltje die je kunt gebruiken om te compileren en te testen. Onderin het scherm komt het resultaat te staan. Zijn niet alle testen groen? Kijk dan goed naar de uitslag van de test om te zien wat er nog mist. Door aanpassingen te maken in de code, kun je ervoor zorgen dat de testen één voor één slagen! Let er op dat  de testen erg nauw luisteren, ook op hoofdletters en spaties.

_Tip:_ je roept een methode op een class als volgt aan:
```Java
    // Example.java
class Example {
  public void printThis() {
    System.out.println('PRINT ME');
  }
}
// Main.java
public class Main {
  public static void main(String[] args) {
    Example yourExample = new Example();
    yourExample.printThis();
  }
}
```

## Bonusopdracht

Geef de auto een extra veld genaamd "bestuurder" van type "Bestuurder".
Zorg dat een Bestuurder een naam en een rijbewijsnummer heeft.
Je mag zelf weten van welk type deze twee zijn.
