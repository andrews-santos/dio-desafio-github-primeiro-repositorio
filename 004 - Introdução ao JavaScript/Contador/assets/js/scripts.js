var currentNumberWrapper = document.getElementById("currentNumber");
var currentNumber = 0;
              
function increment() {
    if (currentNumber <= 9  ) {
            currentNumber = currentNumber + 1;
            currentNumberWrapper.style.color = "white";   
    if (currentNumber < 0 ){
            currentNumberWrapper.style.color = "red";
        } 
    } 
currentNumberWrapper.innerHTML = currentNumber;
console.log(currentNumberWrapper,currentNumber);
}

function decrement() {
    if (currentNumber >= -9 ) {
        if (currentNumber <= 0 ){
            currentNumberWrapper.style.color = "red";
        }
        currentNumber = currentNumber -1;
    }  
    currentNumberWrapper.innerHTML = currentNumber;
    console.log(currentNumberWrapper,currentNumber);                     
}



