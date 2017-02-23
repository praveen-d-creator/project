

function displayDate()
{
	document.getElementById('demo').innerHTML=Date();
	}

/////////////////////////////////////////

function showRegisterForm()
{
	document.getElementById('registerForm').hidden=false;
	document.getElementById('registerButton').hidden=false;
}

////////////////////////////////////////////

function noRegistration()
{
	var x;
	if(confirm("We would like you to register anyways.Please click OK to register and cancel to register without interset")==true)
	{
	x="You pressed OK! ";	
	}
	else
		{
		x="You pressed cancel!";
		}
	document.getElementById("idButtonNo").disabled=true;
	}

///////////////////////////////////////////////


function checkSubmit()
{
	var a;
	var b;
	a=document.getElementById("email").value;
	b=document.getElementById("name").value;
	if(a.length==0 || b.length==0)
		{
		alert("Please enter some value!");
		}
	else
		{
		alert("Thank You");
		}
	}


