string snake_case(string palabra){

string snake = "";



for(int i = 0; i < palabra.size(); i++){

    if(palabra[i] == ' '){
        snake += '_';
    }
    else if(isupper(palabra[i])){
        snake += tolower(palabra[i]);
    }

    else{
        snake += palabra[i];
    }

}
return snake;
}