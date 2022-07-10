import { configureStore } from '@reduxjs/toolkit';
import counterReducer from './panelSlice';

export default configureStore({
    reducer:{
        counter: counterReducer,
    },
})

