import { Route, Routes } from 'react-router-dom';
import './App.css';
import Navbar from './component/Navbar';
import Home from './component/Home';
import AddProduct from './component/AddProduct';
import EditProduct from './component/EditProduct';

function App() {
  return (
    <>
      <Navbar />

      <Routes>
        <Route path='/' element={<Home/>} exact />
        <Route path='/addProduct' element={<AddProduct/>} exact />
        <Route path='/editProduct/:id' element={<EditProduct/>} exact />
      </Routes>

    </>

  );
}

export default App;