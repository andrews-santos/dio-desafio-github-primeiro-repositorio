import React from 'react';
import { StrictMode } from 'react';
import {Provider} from 'react-redux';
import ReactDOM from 'react-dom/client';
import App from './app';
import './style.css';
import store from './redux/store';




const rootElement = ReactDOM.createRoot(document.getElementById('root'));

rootElement.render(
<StrictMode>
  <Provider store={store}>
    <App />
  </Provider>
</StrictMode>  

);
