function validaArray(arr,num){

    try {
        if(!arr && !num) 
	        throw new ReferenceError('Envie os parâmetros (linha 31)');
        if(typeof arr !== 'object') 
	        throw new TypeError('O Array precisa ser do tipo object (linha 31)');
        if(typeof num !== 'number') 
	        throw new TypeError('O num precisa ser do tipo number (linha 31)');
        if(arr.length !== num) 
	        throw new RangeError('Tamanho inválido ! (linha 31)');

return arr;
        
    } catch (error) {
        if(error instanceof ReferenceError){
            console.log('Este erro é um ReferenceError!')
            console.log(error.message)
        }else if(error instanceof TypeError){
            console.log('Este erro é um TypeError!')
            console.log(error.message)
        }else if(error instanceof RangeError){
            console.log('Este erro é um TypeError!')
            console.log(error.message)
        }else{
            console.log('Tipo de erro não esperado:' + error);
        }   
    }
}

console.log(validaArray([0,1],2))