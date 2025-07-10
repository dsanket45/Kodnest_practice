// import { StrictMode } from 'react'
// import { createRoot } from 'react-dom/client'
// import App from './App.jsx'
// import Header from './Header.jsx'

// createRoot(document.getElementById('root')).render(
//   <StrictMode>
//     <Header/>
//     <App />
//   </StrictMode>,
// )

import React from 'react';
import ReactDOM from 'react-dom/client';

 function Greeting() {
  return React.createElement("h1",{},"Welcome user");
 }
 <h1>hello from react</h1>
 ReactDOM.render(<Greeting/>,
  document.getElementById('root')
)