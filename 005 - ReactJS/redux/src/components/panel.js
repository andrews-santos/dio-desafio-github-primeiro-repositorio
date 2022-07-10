import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { decrement, increment, inicial } from '../redux/panelSlice';


const Panel = () => {

    const count = useSelector((state) => state.counter.value)
    const dispatch = useDispatch()

    return(
        <body>
            <section className='sider'>
                <div id="sider">
                    <h1>Painel</h1>
                </div>
                <button id="btn-counter" textalign="center" onClick={() => dispatch(inicial())} ><span>Zerar</span></button>
            </section>

            <div id="counter">
                 <button className='btn' aria-label="Decrement value" onClick={() => dispatch(decrement())} > - </button>
                 <span  className='number'>{count}</span>
                 <button className='btn' aria-label="Increment value" onClick={() => dispatch(increment())} > + </button>
                
             </div>
           
        </body> 
    );
}

export default Panel;
