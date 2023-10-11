var odal = document.getElementById("modal");
        
// Get the button that opens the modal
var tn = document.getElementById("btn");

// Get the <span> element that closes the modal
var pan = document.getElementsByClassName("cross")[0];

// When the user clicks the button, open the modal 
tn.onclick = function() {
  odal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
pan.onclick = function() {
  odal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == odal) {
    odal.style.display = "none";
  }
}