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
	for(i=0; i<100; i++)
		document.getElementById("background-text").innerHTML += backgroundAttr[i%backgroundAttr.length]; 
}