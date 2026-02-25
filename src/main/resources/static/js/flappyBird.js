function randint(min,max){
    return Math.floor(Math.random() * (max-min)) + min
}

const pipeDict = {}

function start(){
    document.getElementById("startKnapp").removeAttribute("onclick", "start()")
    setInterval(pipeMovement, 200)
}


const mainWindow = document.getElementById("main")
function spawnPipe(){
    let pipeDiv = document.createElement("div")
    let pipeDictLength = Object.keys(pipeDict).length
    pipeDiv.classList.add("pipe")
    pipeDiv.id = "pipe" + pipeDictLength
    let pipeUpper = document.createElement("div")
    pipeUpper.innerHTML = "pipeUpper"
    let pipeLower = document.createElement("div")
    pipeLower.innerHTML = "pipeLower"
    pipeDiv.appendChild(pipeUpper)
    pipeDiv.appendChild(pipeLower)
    let Yoffset = randint(-50, 50)
    let Xoffset = pipeDictLength * 200
    pipeDiv.style.top = Yoffset + "px"
    pipeDiv.style.right = Xoffset + "px"
    pipeDict["pipe" + pipeDictLength] = [Xoffset, Yoffset]
    mainWindow.appendChild(pipeDiv)
}

spawnPipe()
spawnPipe()
spawnPipe()
spawnPipe()
spawnPipe()


function pipeMovement(){
    let pipeDictLength = Object.keys(pipeDict).length
    let pipeDictEntries = Object.entries(pipeDict)
    for(let i = 0; i<pipeDictLength; i++){
    pipeDictEntries[i][1][0] += 25
    let pipeElemnt = document.getElementById(pipeDictEntries[i][0])
    pipeElemnt.style.right = pipeDictEntries[i][1][0] + "px"
    }
}

var birdPosY = 0



function debug(){
    setInterval(() => {
        let bird = document.getElementById("bird")
        
    }, 100);

}