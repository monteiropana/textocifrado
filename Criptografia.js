const fs = require('fs')

fs.readFile('./texto_cifrado.txt', 'utf8' , (err, data) => {
    if (err) {
        console.error(err)
        return
    }
    var textoPronto = "";
			
    for (var i = 0; i < data.length; i++) {
        if (data.charAt(i) == '4') {
            textoPronto += 'a';
        } else if (data.charAt(i) == '3') {
            textoPronto += 'e';
        } else if (data.charAt(i) == '1') {
            textoPronto += 'i';
        }  else if (data.charAt(i) == '0') {
            textoPronto += 'o';
        } else if (data.charAt(i) == '7') {
            textoPronto += 'u';
        } else {
            textoPronto += data.charAt(i);
        }
    }
    console.log("Texto cifrado: " + data)
    console.log("Texto pronto: " + textoPronto)
})
