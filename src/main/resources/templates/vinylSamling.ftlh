<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/css/vinylSamling.css">
</head>
<body>
<div id="albumcontainer">
    <#list albums as item>
        <div class="album">
            <p>${item.artist}</p>
            <p>${item.title}</p>
            <img src="${item.imageURL}" alt="missing image">
            <br>
            <a href="${item.discogsURL}">discogs</a>
        </div>
    </#list>
</div>
</body>
</html>