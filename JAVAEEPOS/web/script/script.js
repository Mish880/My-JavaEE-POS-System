document.getElementById("customerpage").style.display="none";
document.getElementById("itempage").style.display="none";
document.getElementById("placeorderpage").style.display="none";

/*Home page*/
document.getElementById("homeBtn").addEventListener("click" , function () {
    document.getElementById("customerpage").style.display="none";
    document.getElementById("itempage").style.display="none";
    document.getElementById("placeorderpage").style.display="none";
    document.getElementById("mainpage").style.display="block";
})

/*Customer page*/
document.getElementById("customerBtn").addEventListener("click" ,  function () {
     document.getElementById("mainpage").style.display="none";
     document.getElementById("itempage").style.display="none";
     document.getElementById("customerpage").style.display="block";
     document.getElementById("placeorderpage").style.display="none";
})

/*Item Page*/
document.getElementById("itemBtn").addEventListener("click" , function () {
   document.getElementById("mainpage").style.display="none";
   document.getElementById("customerpage").style.display="none";
   document.getElementById("itempage").style.display="block";
   document.getElementById("placeorderpage").style.display="none";
})

/*Place Order Page*/
document.getElementById("PlaceOrderBtn").addEventListener("click" , function () {
  document.getElementById("mainpage").style.display="none";
  document.getElementById("customerpage").style.display="none";
  document.getElementById("itempage").style.display="none";
  document.getElementById("placeorderpage").style.display="block";
})