# include <string>
using namespace std;


string bases(int numero, int base){

string retorno = "";
int resultado = numero;
int resto;
char digito;
while(resultado >= base){
    resto = resultado%base;
    resultado = resultado/base;

    if(resultado < 10){
        digito = '0' + resto;
    }
    else{
        digito = 'A' + resto - 10;
    }
    retorno =  digito + retorno;
}
return retorno;
}









# include <string>
using namespace std;


int reemplazar(string aBuscar, string reemplazo, string texto, string &nuevoTexto) {
nuevoTexto = "";
string palabraActual = "";
int reemplazos;

for(int i = 0){

palabraActual += texto[i];


if(aBuscar == palabraActual){
    nuevoTexto += reemplazo;
    palabraActual = "";
}

else{
    nuevoTexto+=palabraActual;
    palabraActual = "";
}

}

}































string snake_case(string texto){

string snake = "";
int largo = texto.size();

for(int i = 0; largo > i; i++){

    if(texto[i] == ' '){
        snake += '_';
    }
    else{
        snake += tolower(texto[i]);
    }
}
return snake;
}























string camelCase(string texto){

string camel = "";
int largo = texto.size();
bool mayus = false;

for(int i = 0; i < largo; i++)
{
    if(texto[i] == ' '){
        mayus = true;
    }
    else{
        if(mayus == true){
            camel+= toupper(texto[i]);
        }
        else{
            camel+= tolower(texto{i});
        }

        }
    }
}