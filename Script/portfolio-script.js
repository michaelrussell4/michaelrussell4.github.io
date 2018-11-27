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

function w3_open() {
	document.getElementById("sidebar").style.display = "block"; 
	document.getElementById("main-content").style.paddingLeft = "200px"; 
	document.getElementById("sidebar-button").style.display = "none"; 
}

function w3_close() {
	document.getElementById("sidebar").style.display = "none"; 
	document.getElementById("main-content").style.paddingLeft = "16px"; 
	document.getElementById("sidebar-button").style.display = "initial"; 
}