
// let str = prompt("Enter a Phrase that you would like to reverse");
let str = "This is a sunny day"
let reversed = "";
let result = "";

// reverse the whole string
for(let i=str.length; i>=0; i--){
    if(str.charAt(i) != " "){
        reversed += str.charAt(i);
    }else if(str.charAt(i) == " "){
        reversed += " ";
    }
}
// create an array of reversed string
let wordsArr = reversed.split(" ");

// print the array
for (const word of wordsArr) {

    result = word + " "+ result;

}
console.log(result);

