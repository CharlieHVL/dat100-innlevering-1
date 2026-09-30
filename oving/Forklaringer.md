# Forklaringer til øvingsoppgavene

## G1
Del a: `int n;` deklarerer n. Før n brukes i del c, må den få en verdi.
Del b: `for (int i = 1; i <= 10; i++)` skriver 1 til og med 10.
Del c er i G1.java i hovedmappen. Med n = 10 skrives 1–9; n = 3 gir 1 og 2.
Med n <= 1 (og dermed også negative tall) skrives ingenting.

## G3
G3Switch.java viser del b; G3.java viser del c. Begge skriver A, B og deretter C 18 ganger.

## G4
Først kommer overskriften og stjernene. Så kommer linje nr. 1–10,
med en ekstra tom linje etter nr. 4 og nr. 8.

## B1
Del a:
```text
55
false
true
10
```
substring(3, 5) henter tegn på indeks 3 og 4, ikke 5.

Del b:
```text
11
4
1
false
true
```
Multiplikasjon kommer før addisjon. % gir rest, og 9 / 5 gir heltallsdivisjon.

Del c:
```text
x = 28, y = 12
x = 16, y = 12
x = 4, y = 12
x = 4, y = 8
4
```
Løkken finner største felles divisor ved gjentatt subtraksjon.

## B2
B2.java viser del b med fem innlesinger. Endre løkkegrensen til 1 for del a.

## B3
Utskrift etter at feltene i siste linje er fylt ut:
```text
Del 1
Del 2
Nr 2, j = 1
Nr 2, j = 2
Nr 2, j = 4
Del 3
Nr 3, k = t
Nr 3, k = s
Nr 3, k = e
Del 4
7569 har 4 sifre
```
Del 1 kjøres aldri fordi 1 < 1 er usant. Del 3 utelater T på indeks 0.
Del 4 teller sifrene i et positivt heltall med heltallsdivisjon på 10.
For 0 blir svaret 1. For negative flersifrede tall virker den opprinnelige løkken ikke som en sifferteller.

## B4
Begge metodene beregner x opphøyd i n. De gir ikke alltid nøyaktig samme
flyttallsverdi, fordi avrundingen kan skje forskjellig. Prøv 2 og 3,
1.5 og 4, og 0.1 og 3. Svært store resultater kan bli Infinity.
Programmet bruker dialogbokser og må kjøres i et miljø med grafisk støtte.
Kilde: https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/Math.html
