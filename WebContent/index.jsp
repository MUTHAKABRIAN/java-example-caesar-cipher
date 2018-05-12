<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Caesar Cipher</title>
</head>
<body>
<h1>Caesar Cipher</h1>

<h2>Encrypter</h2>
<form action="encrypt" method="post">
<label for="message">Text to encrypt</label><br>
<textarea name="message" rows="20" cols="80"></textarea><br>
<br>
<label for="message">Number to shift characters</label><br>
<input type="text" name="shift"><br>
<br>
<input type="submit" value="Encrypt">
</form>

<h2>Decrypter</h2>
<form action="decrypt" method="post">
<label for="message">Text to decrypt</label><br>
<textarea name="message" rows="20" cols="80"></textarea><br>
<br>
<label for="message">Number of characters to be shifted</label><br>
<input type="text" name="shift"><br>
<br>
<input type="submit" value="Decrypt">
</form>

<h2>Cracker</h2>
<form action="crack" method="post">
<label for="message">Text to crack</label><br>
<textarea name="message" rows="20" cols="80"></textarea><br>
<br>
<input type="submit" value="Crack">
</form>

</body>
</html>