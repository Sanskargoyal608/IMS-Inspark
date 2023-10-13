var box = document.getElementById("mywarehouse");
        
// Get the button that opens the modal
var mywarehouse = document.getElementById("open");

// Get the <span> element that closes the modal
var span1 = document.getElementsByClassName("cross")[0];

// When the user clicks the button, open the modal 
mywarehouse.onclick = function() {
  box.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span1.onclick = function() {
  box.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    box.style.display = "none";
  }
}