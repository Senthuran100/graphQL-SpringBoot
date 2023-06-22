import './App.css';
import Layout from "./Components/Layout";
import AllUsers from "./Components/AllUsers";
import { Route, Routes } from "react-router-dom";

function App() {

  return (
    // <div className="App">
    //   <header className="App-header">
    <Layout>
      <Routes>
        <Route path="/" element={<AllUsers />}></Route>
        {/* <Route path="/add-toy" element={<AddUser />}></Route> */}
      </Routes>
    </Layout>
    //   </header>
    // </div>
  );
}

export default App;
