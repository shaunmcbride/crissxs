function checkPasswords() {
	var password1 = document.getElementById('password1');
	var password2 = document.getElementById('password2');
	
	if(password1.value != password2.value){
		password2.setCustomValidity('Passwords do not match!');
	}else{
		password2.setCustomValidity('');
		
	}
	
}