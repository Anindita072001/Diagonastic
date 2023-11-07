function validateName() {
    const nameInput = document.getElementById("patient_name");
    const nameError = document.getElementById("nameError");
    const name = nameInput.value.trim();

    if (name.length <= 5) {
        nameError.textContent = "Invalid Name.";
        return false; 
    } else {
        nameError.textContent = "";
        return true;
    }
}

function validateGender() {
    const genderInput = document.querySelector('select[name="gender"]');
    const genderError = document.getElementById("genderError");
    const selectedGender = genderInput.value;

    if (selectedGender === "") {
        genderError.textContent = "Gender is required.";
        
        return false;
    } else {
        genderError.textContent = "";
 
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
        return false;
    } else {
        ageError.textContent = "";
        ageInput.classList.remove("error");
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
       
        return false;
    } else {
        phoneError.textContent = "";
        
        return true;
    }
}


function validateEmail() {
    const emailInput = document.querySelector('input[name="email_id"]');
    const emailError = document.getElementById("emailError");
    const email = emailInput.value.trim();

    const emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

    if (email === "") {
        emailError.textContent = "Email is required.";
        return false;
    } else if (!emailRegex.test(email)) {
        emailError.textContent = "Invalid email address.";
        emailInput.classList.add("error");
        return false;
    } else {
        emailError.textContent = "";
        return true;
    }
}


function validateAddress() {
    const addressInput = document.querySelector('input[name="address"]');
    const addressError = document.getElementById("addressError");
    const address = addressInput.value.trim();

    if (address === "") {
        addressError.textContent = "Invalid Address";
        return false;
    } else {
        addressError.textContent = "";
        return true;
    }
}


function validatePassword() {
    const passwordInput = document.querySelector('input[name="password"]');
    const passwordError = document.getElementById("passwordError");
    const password = passwordInput.value.trim();

    if (password.length<6) {
        passwordError.textContent = "Invalid password";

        return false;
    } else {
        passwordError.textContent = "";
      
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

    const isFormValid = isNameValid && isGenderValid && isAgeValid && isPhoneNumberValid && isEmailValid && isAddressValid && isPasswordValid;

    const submitButton = document.getElementById("submitButton");

    if (isFormValid) {
        submitButton.disabled = false; 
    } else {
        submitButton.disabled = true; 
    }

    return isFormValid;
}


document.getElementById("submitButton").addEventListener("click", function(){
	alert("Signup Successfully");
});




