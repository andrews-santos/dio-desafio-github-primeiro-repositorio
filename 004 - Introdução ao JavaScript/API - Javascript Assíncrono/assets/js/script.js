

const BASE_URL = 'https://dog.ceo/api/breeds/image/random';



const catBtn = document.getElementById('change-dog');

const getDog = async () => {
	try{
		const data = await fetch(BASE_URL);
		const json = await data.json();
		return json.message;
	} catch(e){
        console.log(e.message);
    }
};


const loadImg = async () => {
	const catImg = document.getElementById('dog');
	catImg.src= await getDog();
};


catBtn.addEventListener('click', loadImg);

loadImg();
console.log(getDog())


