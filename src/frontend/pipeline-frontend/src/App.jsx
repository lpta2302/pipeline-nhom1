import { useState } from 'react'
import ProductList from "./components/ProductList.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {
    const [count, setCount] = useState(0)

    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<ProductList />}/>
                </Routes>
            </BrowserRouter>
        </>
    )
}

export default App
