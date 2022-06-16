
function myfunction(x,y) {
    //if(!x || !y) return alert('É obrigatório informar dois números !!');

var result
var resposta
var yes_or_no
var yes_or_no10
var yes_or_no20 
var result = (x+y)   

    //Confira se os números são iguais.

    if(x===y){
        yes_or_no='são iguais';
    }else{
        yes_or_no='não são iguais' ;
    }

    if(result > 10){
        yes_or_no10='é maior que 10';
    }else{
        yes_or_no10='é menor que 10' ;
    }

    if(result > 20){
        yes_or_no20='é maior que 20';
    }else{
        yes_or_no20='é menor que 20' ;
    }


//Confira se a soma dos números é maior que 10 ou menor que 20.


if (result > 10 ) {
   return resposta = `Os números ${x} e ${y} ${yes_or_no}. Sua soma é ${result} que ${yes_or_no10} e ${yes_or_no20}.`;


}else if(result < 20){
   return resposta = `Os números ${x} e ${y} ${yes_or_no}. Sua soma é ${result} que ${yes_or_no10} e ${yes_or_no20}.`;
    
}else{
   return resposta = `Os números ${x} e ${y} ${yes_or_no}. Sua soma é ${result}.`;
   
    }
}
myfunction();

console.log(myfunction(15,45));


