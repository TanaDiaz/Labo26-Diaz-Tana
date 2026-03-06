string camelCase (string frase){

string Camel = "";
bool mayus = false; 
    Camel += tolower(frase[0]);

    for(int i = 1; i < frase.size(); i++){

        if(frase[i] == ' '){
            mayus = true;
        }
        else{
            if(islower(frase[i]) && mayus == true){
                Camel += toupper(frase[i]);
                mayus = false;
            }
            else if(isupper(frase[i]) && mayus == false){
                Camel += tolower(frase[i]);
            }
            else{
                Camel += frase[i];
                mayus = false;
            }
        }
    }
    return Camel;
}