import './App.css';
import Layout from "./Components/Layout";
import AllUsers from "./Components/AllUsers";
import AddUser from "./Components/AddUser";

function App() {

  return (
    // <div className="App">
    //   <header className="App-header">
    <Layout>
      <AllUsers />
      <AddUser/>
    </Layout>
    //   </header>
    // </div>
  );
}

export default App;
