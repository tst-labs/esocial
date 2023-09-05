import { BrowserRouter as Router } from "react-router-dom";
import Routes from "./Routes";
import ScrollToTop from "../components/scroll/ScrollToTop";

function App() {
  return (
    <Router>
      <ScrollToTop />
      <Routes />
    </Router>
  );
}

export default App;
