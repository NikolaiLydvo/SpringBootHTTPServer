<!DOCTYPE html>
<html lang="no">
    <head> 
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/css/hangman.css">
    </head>
    <body onload="knappGenerator()">
        <h1 style="text-align: center;height:10px;"> HANGMAN</h1>
        <div id="velkommen">
            <h2>Velg ord selv eller få et tilfeldig av maskinen</h2>
        </div>
        <div id="spillTypeValg">
            <button onclick="velgOrdSelv()" id="selvValgtOrd">Velg ord selv</button>
            <button onclick="maskinOrdValg()" id="maskinValgtOrd">Spill mot maskinen</button>
        </div>
        <div id="ordInputDiv" hidden="hidden">
            <input id="ordInput"><button onclick="ordvelger();spillstart()" id="velgeknapp">velg</button>
        </div>
        <div id="spillet" hidden="hidden">
            <div id="feilRiktig">
                <h1 id="feilCounter">Feil: </h1>
                <h1 id="riktigCounter">Riktige: </h1>
            </div>
            <div id="hengemann">
                <img src="/images/hangmanImages/bilde0.jpg" id="hengern">
            </div>
            <div id="ordet"></div>
            <div id="bokstaver"></div>
            <div id="brukteBokstaver"></div>
        </div>
        
    </body>
    <script src="/js/hangman.js"></script>
</html>