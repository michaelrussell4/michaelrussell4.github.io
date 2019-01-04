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