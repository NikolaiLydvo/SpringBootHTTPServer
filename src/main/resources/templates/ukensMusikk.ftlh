<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/css/ukensMusikk.css">
</head>
<body>
<div id="chartsContainer">
    <div id="albumContainer">
        <#list albums as album>
            <div class="album">
                <img src="${album.imageURL}" alt="missing image">
                <p>${album.artist}</p>
                <p>${album.albumName}</p>
            </div>
        </#list>
    </div>
    <div id="artistContainer">
        <#list artists as artist>
            <div class="artist">
                <p>${artists?index}: <a href="${artist.artistURL}">${artist.artistName}</a></p>
            </div>
        </#list>
    </div>
    <div id="trackContainer">
        <#list songs as song>
            <div class="song">
                <h2>${song.rank} avspillinger: ${song.playcount}</h2>
                <p>${song.trackName} - ${song.artistName}</p>
            </div>
        </#list>
    </div>
</div>
</body>
</html>