import Routes from "./Routes";
import { BrowserRouter as Router } from "react-router-dom";
import { useResizeDetector } from "react-resize-detector";
import { useEffect } from "react";
import sendPostMessage from "../shared/sendPostMessage";

function App() {
  const { height, ref } = useResizeDetector();

  useEffect(() => {
    sendPostMessage();
  }, [height]);

  return (
    <div ref={ref}>
      <Router>
        <Routes />
      </Router>
    </div>
  );
}

export default App;
