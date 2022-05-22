
import { Route, BrowserRouter, Routes } from "react-router-dom";
import Home from "./Home";
import Navbar from "./Navbar";
import Orders from "./Orders";


export default function RoutesBrowser(){
    return(
        <BrowserRouter>
        <Navbar/>
            <Routes>
                <Route path="/orders" element={<Orders/>}/>
                <Route path="/" element={<Home/>}/>
            </Routes>
        </BrowserRouter>
    )
}