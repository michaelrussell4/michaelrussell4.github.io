function pullDownCard(id) {
	var x = document.getElementById(id); 
	var y = document.getElementById("me-btn"); 
	if(x.className.indexOf("w3-show") == -1) {
		x.className += " w3-show"; 
		y.innerHTML = "&#9650;";
	} 
	else {
		x.className = x.className.replace(" w3-show", ""); 
		y.innerHTML = "&#9660;";
	}
}

function accordianPullDown(id) {
	var x = document.getElementById(id); 
	if(x.className.indexOf("w3-show") == -1) {
		x.className += " w3-show"; 
	} 
	else {
		x.className = x.className.replace(" w3-show", ""); 
	}
}	

function turingTest() {
	var valIn = document.getElementById('turing-input').value;
	var valOut = document.getElementById('turing-output');
	var output = false; 
	var pattern = /^([^a-wz0-9\W])+$/i;
	var inLang = pattern.test(valIn);
	if(inLang && valIn.length % 2 == 1 && valIn.substring(0,(valIn.length-1)/2) == reverseString(valIn.substring((valIn.length-1)/2 + 1)))
		output = true;
	if(output){
		valOut.style.color = "green";
	} else {
		valOut.style.color = "red";
	}
	valOut.value = output? "Accepted":"Rejected";
}

function reverseString(str) {
	return str.split('').reverse().join('');
}

function fibonacci() {
	var valIn = document.getElementById('fib-input').value;
	var valOut = document.getElementById('fib-output');
	var output = false; 
	var pattern = /^[1-9]{1}[0-9]*/i;
	var inLang = pattern.test(valIn);
	if(!inLang){
		valOut.style.color = "red";
		valOut.value = "Invalid input. Enter a number.";
		return;
	}
	if(valIn.length > 4){
		valOut.style.color = "red";
		valOut.value = "That number's too big...";
		return;
	}
	valOut.style.color = "black";
	valOut.value = fib(valIn);
}

function fib(x) {
	if(x==0) return x;
	var p = 0, q = 1, r;
	for(var i=0; i<x; i++){
		r = p + q;
		p = q; 
		q = r; 
	}
	return q;
}