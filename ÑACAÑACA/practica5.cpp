
bool esPalindromo (const string palabra){
int L = palabra.size();
int inicio = 0;
int fin = L-1;
bool palindromo = true;


while(inicio < fin){

    if(tolower(palabra[inicio]) == tolower(palabra[fin])){
        inicio++;
        fin--;
    }
    else{
        inicio = fin;
        palindromo = false;
    }
}
return palindromo;
}