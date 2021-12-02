function myAlertFunction()
{
	alert('How dare you???????\nNow i had to change your OR table color to coral...');
	document.getElementById('tor').style.backgroundColor = "coral";
}
function submit_fn()
{
	var first_name = document.getElementById('first_name').value;
	alert('Thank you ' + first_name);
}
function addNumbers()
{
	var firstNum = document.getElementById('firstNum').innerHTML;
	var secondNum = document.getElementById('secondNum').innerHTML;
	document.getElementById('answer').innerHTML = ` ${firstNum} + ${secondNum} = ` + (Number(firstNum) + Number(secondNum));
}