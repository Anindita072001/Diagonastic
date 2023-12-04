function validateName() {
    const nameInput = document.getElementById("patient_name");
    const nameError = document.getElementById("nameError");
    const name = nameInput.value.trim();

    if (name.length <= 5) {
        nameError.textContent = "Invalid Name.";
       document.getElementById("submitButton").disabled = true;
        return false; 
    } else {
        nameError.textContent = "";
        document.getElementById("submitButton").disabled = false;
        return true;
    }
}

function validateGender() {
    const genderInput = document.querySelector('select[name="gender"]');
    const genderError = document.getElementById("genderError");
    const selectedGender = genderInput.value;

    if (selectedGender === "") {
        genderError.textContent = "Gender is required.";
         document.getElementById("submitButton").disabled = true;
        return false;
    } else {
        genderError.textContent = "";
 		document.getElementById("submitButton").disabled = false;
        return true;
    }
}

function validateAge() {
    const ageInput = document.querySelector('input[name="age"]');
    const ageError = document.getElementById("ageError");
    const age = parseInt(ageInput.value);

    if (isNaN(age) || age < 1 || age>200) {
        ageError.textContent = "Invalid age.";
        ageInput.classList.add("error");
         document.getElementById("submitButton").disabled = true;
        return false;
    } else {
        ageError.textContent = "";
        ageInput.classList.remove("error");
        document.getElementById("submitButton").disabled = false;
        return true;
    }
}

function validatePhoneNumber() {
    const phoneInput = document.querySelector('input[name="phone_no"]');
    const phoneError = document.getElementById("phoneError");
    const phoneNumber = phoneInput.value.trim();

    // You can add phone number validation logic here

    if (phoneNumber.length !=10 ) {
        phoneError.textContent = "Invalid Phone number ";
        document.getElementById("submitButton").disabled = true;
        return false;
    } else {
        phoneError.textContent = "";
        document.getElementById("submitButton").disabled = false;
        
        return true;
    }
}


function validateEmail() {
    const emailInput = document.querySelector('input[name="emailId"]');
    const emailError = document.getElementById("emailError");
    const email = emailInput.value.trim();

    const emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

    if (email === "") {
        emailError.textContent = "Email is required.";
         document.getElementById("submitButton").disabled = true;
        return false;
    } else if (!emailRegex.test(email)) {
        emailError.textContent = "Invalid email address.";
         document.getElementById("submitButton").disabled = true;
        emailInput.classList.add("error");
        return false;
    } else {
        emailError.textContent = "";
        document.getElementById("submitButton").disabled = false;
        return true;
    }
}


function validateAddress() {
    const addressInput = document.querySelector('input[name="address"]');
    const addressError = document.getElementById("addressError");
    const address = addressInput.value.trim();

    if (address === "") {
        addressError.textContent = "Invalid Address";
         document.getElementById("submitButton").disabled = true;
        return false;
    } else {
        addressError.textContent = "";
        document.getElementById("submitButton").disabled = false;
        return true;
    }
}


function validatePassword() {
    const passwordInput = document.querySelector('input[name="password"]');
    const passwordError = document.getElementById("passwordError");
    const password = passwordInput.value.trim();

    if (password.length<6) {
        passwordError.textContent = "Invalid password";
		 document.getElementById("submitButton").disabled = true;
        return false;
    } else {
        passwordError.textContent = "";
      document.getElementById("submitButton").disabled = false;
        return true;
    }
}




function validateForm() {

    const isNameValid = validateName();
    const isGenderValid = validateGender();
    const isAgeValid = validateAge();
    const isPhoneNumberValid = validatePhoneNumber();
    const isEmailValid = validateEmail();
    const isAddressValid = validateAddress();
    const isPasswordValid = validatePassword();

    const isFormValid = isNameValid && isGenderValid && isAgeValid && isEmailValid && isPhoneNumberValid && isAddressValid && isPasswordValid;

    

    return isFormValid;
}


document.getElementById("submitButton").addEventListener("click", function(){
	alert("Signup Successfully");
});



function validateEmail23() {
    const emailInput = document.querySelector('input[name="emailId"]');
    const emailError = document.getElementById("emailError");
    const email = emailInput.value.trim();

    const emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

    if (email === "") {
        emailError.textContent = "Email is required.";
         document.getElementById("submitButton").disabled = true;
        return false;
    } else if (!emailRegex.test(email)) {
        emailError.textContent = "Invalid email address.";
         document.getElementById("submitButton").disabled = true;
        emailInput.classList.add("error");
        return false;
    } else {
        emailError.textContent = "";
        document.getElementById("submitButton").disabled = false;
        return true;
    }
}


function validatePhoneNumber12() {
    const phoneInput = document.querySelector('input[name="phoneNo"]');
    const phoneError = document.getElementById("phoneError");
    const phoneNumber = phoneInput.value.trim();

    // You can add phone number validation logic here

    if (phoneNumber.length !=10 ) {
        phoneError.textContent = "Invalid Phone number ";
        document.getElementById("submitButton").disabled = true;
        return false;
    } else {
        phoneError.textContent = "";
        document.getElementById("submitButton").disabled = false;
        
        return true;
    }
}

function validateMessage() {
    const messageInput = document.querySelector('input[name="message"]');
    const messageError = document.getElementById("messageError");
    const message = messageInput.value.trim();

    if (message === "") {
        messageError.textContent = "Invalid message";
         document.getElementById("submitButton").disabled = true;
        return false;
    } else {
        messageError.textContent = "";
        document.getElementById("submitButton").disabled = false;
        return true;
    }
}
