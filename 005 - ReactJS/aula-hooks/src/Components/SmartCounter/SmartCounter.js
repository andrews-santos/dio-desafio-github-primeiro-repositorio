import{useState} from 'react';

function SmartCounter(){
    //retorna 1 vetor
    //1. variavel statefull
    //2. função amarrada a esta variável que atualiza esse valor
    const [quantity,upQuantity] = useState(0);
    //console.log(quantity);
    return(
        <div>
            <h1>{quantity}</h1>
            <button onClick={()=> upQuantity(quantity + 1)} >Aumentar</button>
        </div>
    )
}

export default SmartCounter;