var currentNumberWrapper /*tag span do html*/ = document.getElementById("currentNumber");
var currentNumber = 0;

function increment() {
    currentNumber = currentNumber + 1;
    currentNumberWrapper.innerHTML = currentNumber;
}

function decrement() {
    currentNumber = currentNumber - 1;
    currentNumberWrapper.innerHTML = currentNumber;
}


//https://github.com/stebsnusch/basecamp-javascript/tree/main/introducao-ao-javascript/contador