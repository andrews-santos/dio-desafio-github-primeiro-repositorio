import { createSlice } from '@reduxjs/toolkit'

export const slice = createSlice({

    name: 'counter',

    initialState:{
        value: 0 
    },

    reducers: {
        increment: (state) => {
            state.value += 1
        },
        decrement: (state) => {
        state.value -= 1
        },
        inicial: (state) => {
            state.value = 0
            },
    },
})

export const { inicial,increment, decrement } = slice.actions;

export default slice.reducer;