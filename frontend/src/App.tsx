import DataTable from "components/ DataTable";
import Footer from "components/Footer";
import NavTab from "components/NavBar";

const App = () => {
  return (
    <>
      <NavTab />
      <div className="container">
        <h1 className="text-primary">oi</h1>
      </div>
      <div>
        <DataTable />
      </div>
      
        <Footer />
      
    </>
  );
}

export default App;
