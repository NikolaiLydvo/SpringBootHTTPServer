var ordetInput = ""
var ordet = ""
var riktigOrdMengde = 0
const alfabet = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","Æ","Ø","Å"]
const maskinOrdListe = ["sykkel","sjokolade","telefon","datamaskin","fotball","skole","musikk","restaurant","kaffe","teater","universitet","fjord","sommer","vinter","solnedgang","fjelltopp","regnbue","lønning","gulrot","leopard","elefant","ananas","sminke","speil","tunnel","lykke","vindu","blomst","perle","kjøleskap","menneske","maleri","skrivesperre","oppgave","kulinarisk","fantastisk","eksplosjon","aktivitet","kjærlighet"]

function random(max){
    return Math.floor(Math.random() * max)
}

function ordvelger(){
    ordetInput = document.getElementById("ordInput").value
    console.log("ordInput er " + ordetInput)
    ordet = ordetInput.toUpperCase()
    console.log("ordet ble generert " + ordet)
    let ordEl = document.getElementById("ordet")
    i = 0
    while(i < ordet.length){
        console.log(ordet[i])
        ordEl.innerHTML += `<div class=ordBokstav-${ordet[i]}>_</div>`
        i++
    }
    for(let i = 0; i < alfabet.length; i++){
        if(ordet.includes(alfabet[i])){
            riktigOrdMengde +=1
        }
    }
    console.log("antall riktige for å løse " + riktigOrdMengde)
    console.log(ordEl)
    document.getElementById("ordInput").setAttribute("hidden", "hidden")
    document.getElementById("velgeknapp").setAttribute("hidden", "hidden")
}
let riktige = 0
let feil = 0

console.log(ordet)
function knappGenerator(){
    let bokstavListe = document.getElementById("bokstaver")
    let knappListe = ""
    let i = 0
    while(i<alfabet.length){
        knappListe += `<div id="knapp${alfabet[i]}" onclick='knappTrykk("${alfabet[i]}")'>${alfabet[i]}</div>`
        bokstavListe.innerHTML = knappListe
        i+=1
    }
}

function knappTrykk(bokstav){
    let bokstaven = document.getElementById("knapp" + bokstav)
    bokstaven.style.visibility = "hidden"
    console.log("ordet er " + ordet)
    console.log("bokstav" + bokstav)
    console.log("bokstaven er i ordet? " + ordet.includes(bokstav))
    let ordsjekk = document.getElementsByClassName("ordBokstav-" + bokstav)
    console.log(ordsjekk)
    let ordListe = []
    for(let i = 0; i < ordsjekk.length; i++){
        console.log(ordsjekk[i])
        ordListe.push(ordsjekk[i])
    }
    for(let i = 0; i < ordListe.length; i++){
        ordListe[i].innerHTML = bokstav
    }
    if(ordet.includes(bokstav) == true){
        riktige += 1
        document.getElementById("riktigCounter").innerHTML = "Riktige: " + riktige
    }
    else{
       feil += 1
       document.getElementById("feilCounter").innerHTML = "Feil: " + feil
       document.getElementById("brukteBokstaver").innerHTML += bokstaven.innerHTML
       document.getElementById("hengern").src = "/images/hangmanImages/bilde" + feil + ".jpg"
    }
    if(riktige == riktigOrdMengde){
        alert("Gratulerer, du vant")
        for(let i = 0; i<alfabet.length;i++){
            document.getElementById("knapp" + alfabet[i]).removeAttribute("onclick", "knappTrykk(" + alfabet[i] + ")")
        }
    }
    if(feil >= 10){
        alert("Au da, ingen forsøk igjen\nordet var : " + ordet)
        document.getElementById("hengern").src = "bilder/bilde10.jpg"
        for(let i = 0; i<alfabet.length;i++){
            document.getElementById("knapp" + alfabet[i]).removeAttribute("onclick", "knappTrykk(" + alfabet[i] + ")")
        }
    }
}


var spillDiv = document.getElementById("spillet")
var selvValgtOrdDiv = document.getElementById("selvValgtOrd")
var maskinValgtOrdDiv = document.getElementById("maskinValgtOrd")
var spillTypeValgDiv = document.getElementById("spillTypeValg")
var ordInputDiv = document.getElementById("ordInputDiv")
var selvValgtOrdKnapp = document.getElementById("selvValgtOrdKnapp")
var velgeTekst = document.getElementById("velkommen")

function spillstart(){
    spillDiv.removeAttribute("hidden", "hidden")
    selvValgtOrdDiv.setAttribute("hidden", "hidden")
    maskinValgtOrdDiv.setAttribute("hidden", "hidden")
    velgeTekst.setAttribute("hidden", "hidden")
}

function velgOrdSelv() {
    spillTypeValgDiv.setAttribute("hidden", "hidden")
    ordInputDiv.removeAttribute("hidden", "hidden")
    maskinValgtOrdDiv.setAttribute("hidden", "hidden")
    selvValgtOrdKnapp.setAttribute("hidden", "hidden")
}

function maskinOrdValg(){
    let tilfeldig = random(maskinOrdListe.length)
    maskinOrd = maskinOrdListe[tilfeldig]
    ordet = maskinOrd.toUpperCase()
    console.log("ordet ble generert " + ordet)
    let ordEl = document.getElementById("ordet")
    i = 0
    while(i < ordet.length){
        console.log(ordet[i])
        ordEl.innerHTML += `<div class=ordBokstav-${ordet[i]}>_</div>`
        i++
    }
    for(let i = 0; i < alfabet.length; i++){
        if(ordet.includes(alfabet[i])){
            riktigOrdMengde +=1
        }
    }
    console.log("antall riktige for å løse " + riktigOrdMengde)
    console.log(ordEl)

    selvValgtOrdDiv.setAttribute("hidden", "hidden")
    maskinValgtOrdDiv.setAttribute("hidden", "hidden")
    spillDiv.removeAttribute("hidden", "hidden")
    velgeTekst.setAttribute("hidden", "hidden")
}