# DAT100 – oppgaver

Obligatoriske oppgaver: O1.java, O2.java og O3.java i hovedmappen.
G1.java ligger også i hovedmappen; øvrige øvingsoppgaver og forklaringer ligger i oving/.

## Kjøring
Hver klasse er et selvstendig program. Eksempel fra hovedmappen:
```
javac O1.java
java O1
```
For en øvingsoppgave:
```
javac oving/G2.java
java -cp oving G2
```

## Avklaringer
- O1 bruker skattesatsene for 2026. Oppgavetekstens 217 400 kr er ikke
  2026-grensen; den er 226 100 kr. Bare inntekten innenfor hvert trinn beskattes
  med satsen for det trinnet. Dette er kun trinnskatt, ikke samlet inntektsskatt.
  Kilde: https://www.skatteetaten.no/satser/trinnskatt/?year=2026
- O2 bruker bekreftede grenser: A 90–100, B 80–89, C 60–79, D 50–59,
  E 40–49, F 0–39. Ti gyldige poengsummer behandles; ugyldige verdier må gjentas.
- O3 bruker BigInteger fordi long ikke rommer fakultet fra og med 21!.
- Skriv tall som inndata. Programmene har ikke generell håndtering av tekst
  der tall forventes. O1 og B4 godtar både komma og punktum som desimalskilletegn.

Filene er løsningsforslag. Gå gjennom koden og forklaringene slik at du forstår
løkker og valgsetninger før du leverer de individuelle oppgavene.
