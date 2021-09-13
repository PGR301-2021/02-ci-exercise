# CI med Travis.ci

I denne leksjonen skal vi se på viktige prinsipper som 

- Trunk based development 
- Feature branch
- Branch Locking 
- Pull request


## Før dere starter

- Dere trenger en GitHub Konto
- Fork dette repositoriet inn i deres egen konto
- Følg disse instruksjonene for å konfigurere GitHub og Travis OBS! Les den siste setningern! :-)  <https://docs.travis-ci.com/user/tutorial/#to-get-started-with-travis-ci-using-github> NB! Gjør bare de tre første stegene ! 

## Konfigurer travis 

- Enten gi Trvis tilgang til alle repositories , eller bare deres fork at dette repositoriet. 


## Slå på følgende Branch protection rules for ditt repo

- Naviger til repositoriet ditt i GitHub
- Velg "Settings"
- Velg "Branches"
- Lag en ny "Branch Protection Rule" for Branch "main" (bare main)  
- Kryss av for: Require pull request reviews before merging

## Kontroller 

Nå vil flyten din bli omtrent som som følger

- Sjekk ut master og "pull" siste versjon av koden
- Lag en ny branch for din feature
- Implementer kode og test i din branch. Lag flere commits. 
- Push flere en en commit til GitHub
- Når du er fornøyd med funksjonaliteten. Rebase branchen din interaktivt mot master. Fjern unødvenige commits, og skriv gode kommentarer:

 ```
git rebase -i main
 ```

- Push din modifiserte branch til github
```
git push --force
```

- Gå til github og lag en ny Pull request
- Se at travis bygger koden for din pull request.
- Legg til en annen person som collaborator på ditt repo
- Få personen til å godkjenne din pull request
- Forsøk gjerne å fremprovosere en feil ved å få en unit test til å feile. Legg merke til at det fortsatt er mulig å merge til master.


## Branc protection med bygging av kode. 

- Naviger til repositoriet ditt i GitHub
- Velg Settings/Branches
- Lag en ny "Branch Protection Rule" for Branch "main" (bare main)  
- Kryss av for: "Require status checks to pass before merging" 
- Begynn å skrive "t" inn i feltet for "Search for status checks", travis skal dukke opp. Velg "Travis main". 
 

## Løs "The Bowling Kata" i par

Gå sammen to og to. Dere får 15 minutter der dere kan planlegge oppgaven sammen. Dere skal nå jobb sammen på ett repo. Velg et reposutory en av dere har laget. 

Regler:

- Ingen commits på master
- Det oppfordres til å lage mange feature brancher og pull requests - men dere må selv bruke skjønn.

# CI med GitHub Actions

GitHub actions er en integrert del av GitHub og kan gjøre omtrent det samme som Travis. En fordel ved å bruke GitHub Actions
er at man slipper å tillate en tredje part (Travis-ci.com) tilgang til å utføre handlinger i din GitHub konto. 

