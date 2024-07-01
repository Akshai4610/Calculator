function buttonClicked(val){
    document.getElementById("outputScreen").value+=val
}
function ClearScreen(){
    document.getElementById("outputScreen").value=""
}
function EqualClicked(){
    var text=document.getElementById("outputScreen").value
    var output=eval(text)
    document.getElementById("outputScreen").value=output
}
