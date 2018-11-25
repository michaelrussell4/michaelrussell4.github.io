function loadBackgroundText() {
	var backgroundAttr = ['Simple ', 
						  'HTML ',
						  'Effective ',
						  'Professional ', 
						  'CSS ',						  
						  'Good ', 
						  'JavaScript ', 
						  'Easy ', 
						  'User ', 
						  'Friendly ', 
						  'Custom ', 
						  'Style ',
						  'Modern ']; 
	for(i=0; i<200; i++)
		document.getElementById("background-text").innerHTML += backgroundAttr[i%backgroundAttr.length]; 
}

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