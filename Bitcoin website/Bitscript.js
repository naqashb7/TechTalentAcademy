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