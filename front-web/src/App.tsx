import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

import React from 'react';
import './App.css';
import RoutesBrowser from './RoutesBrowser';


function App() {
  return (
    <>
     <RoutesBrowser />
     <ToastContainer />
    </>
  );
}

export default App;
