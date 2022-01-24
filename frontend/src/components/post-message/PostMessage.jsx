import { useResizeDetector } from "react-resize-detector";
import { useEffect } from "react";

function PostMessage({ children }) {
  const { height, ref } = useResizeDetector();

  useEffect(() => {
    sendPostMessage();
  }, [height]);

  return <div ref={ref}>{children}</div>;
}

let height;
function sendPostMessage() {
  if (height !== document.getElementById("root").offsetHeight) {
    height = document.getElementById("root").offsetHeight;
    window.parent.postMessage(
      {
        frameHeight: height
      },
      "*"
    );
  }
}

export default PostMessage;
