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

export default sendPostMessage;
