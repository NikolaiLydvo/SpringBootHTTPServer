<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/css/ukensMusikk.css">
</head>
<body>
<div id="chartsContainer">
    <div id="albumContainer">
        <div id="albumTitle">
            <h1>Album</h1>
        </div>
        <#list albums as album>
            <div class="album">
                <img src="${album.imageURL}" alt="missing image">
                <p>${album.artist}</p>
                <p>${album.albumName}</p>
            </div>
        </#list>
    </div>
    <div id="artistContainer">
        <div id="artistTitle">
            <h1>Artister</h1>
        </div>
        <#list artists as artist>
            <div class="artist">
                <h2>${artist?index+1}: <a href="${artist.artistURL}">${artist.artistName}</a></h2>
            </div>
        </#list>
    </div>
    <div id="trackContainer">
        <div id="songsTitle">
            <h1>Sanger</h1>
        </div>
        <#list songs as song>
            <div class="song">
                <h2>${song.rank}: ${song.playcount}</h2>
                <p>${song.trackName} - ${song.artistName}</p>
            </div>
        </#list>
    </div>
</div>
</body>
</html>