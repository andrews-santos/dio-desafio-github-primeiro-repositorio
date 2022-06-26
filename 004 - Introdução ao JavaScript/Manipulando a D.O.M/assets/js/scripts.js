function changeMode(){
    changeClasses();
    changeText();
}

function changeClasses() {
    Button.classList.toggle(darkModeClass);
    h1.classList.toggle(darkModeClass);
    body.classList.toggle(darkModeClass);
    footer.classList.toggle(darkModeClass);
}

function changeText() {
    const lightMode = "Light Mode";
    const darkMode = "Dark Mode";

    if (body.classList.contains(darkModeClass)) {
        Button.innerHTML = lightMode;
        h1.innerHTML = darkMode + ' ON';
            return;
    }
    Button.innerHTML = darkMode;
    h1.innerHTML = lightMode + ' ON';
}


const darkModeClass = 'dark-mode';
const Button = document.getElementById('mode-selector');
const h1 = document.getElementById('page-title');
const body = document.getElementsByTagName('body')[0];
const footer = document.getElementsByTagName('footer')[0];

Button.addEventListener('click', changeMode);