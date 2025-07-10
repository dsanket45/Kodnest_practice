import MyComponent from "./MyComponent";
import { useState, useEffect } from "react";

export default function App() {
  const [count, setCount] = useState(0);

  // ✅ Set default background and text color when component loads
  useEffect(() => {
    document.body.style.backgroundColor = "white";
    document.body.style.color = "black";
  }, []);

  function increment() {
    setCount(count + 1);
  }

  function decrement() {
    setCount(count - 1);
  }

  function darkmode() {
    const dark = document.body;

    // ✅ Toggle background based on current color
    if (dark.style.backgroundColor === "black") {
      dark.style.backgroundColor = "white";
      dark.style.color = "black";
    } else {
      dark.style.backgroundColor = "black";
      dark.style.color = "white";
    }
  }

  return (
    <>
      <h1>I'm learning</h1>

      <MyComponent name="Java" content="It's a strict lang" />

      <h2>Counting</h2>

      <button onClick={increment}>+</button>
      <h2>{count}</h2>
      <button onClick={decrement}>-</button>

<h1></h1>
      <button onClick={darkmode}>Toggle Dark Mode</button>
    </>
  );
}
