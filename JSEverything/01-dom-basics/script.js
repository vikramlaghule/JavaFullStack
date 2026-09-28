let button=document.getElementById("changeBtn");
let target=document.getElementById("message")
let target2=document.body;


button.addEventListener("click",function(){
    target.textContent="javascript is not that easy";
    
    target2.style.background="lightblue";
    target.style.color="red";
    console.log("its working");
    
});