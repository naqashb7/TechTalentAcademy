function login()
{
    alert("Are your details correct?")
}

function changeColor(val)
{
    if(val.value==""||val.value==null)
    {
        val.style.background = "red";
    }
    else
    {
        val.style.background = "white";
    }
}
function show()
{
    var uname = document.getElementById("t1").value;
    if (uname==""|| uname == null)
    {
       // alert=("What is your name?")
       document.getElementById("msg").innerText="Who ARE you?!";
    }
    else{
    //alert("Welcome, " + uname);
    document.getElementById("msg").innerText="I dont really care, "+ uname;
    }
}
