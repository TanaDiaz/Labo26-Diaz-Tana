# include <iostream>

using namespace std;

int veoPalabra(string palabra){
int valor;
int L = palabra.size();

    if(palabra[L - 1] == 'e' || palabra[L - 1] == 'i' || palabra[L-1] == 'u'){

        valor = 0;
    }



    else if(palabra[L-1] == 'a'){

        valor = 2;
    }

    else if(palabra[L-1] == 'o'){

        valor = 4;
    }

    else if(palabra[L-1] == 's'){

        if(palabra[L - 2] == 'e' || palabra[L - 2] == 'i' || palabra[L-2] == 'u'){
            valor = 1;
        }
        else if(palabra[L-2] == 'a'){
            valor = 3;
        }
        else if(palabra[L-2] == 'o'){
            valor = 5;
        }
    }

    else if(palabra[L - 1] == 'n'){

        if(palabra[L - 2] == 'e' || palabra[L - 2] == 'i' || palabra[L-2] == 'u'){
            valor = 0;
        }
        else if(palabra[L-2] == 'a'){
            valor = 2;
        }
        else if(palabra[L-2] == 'o'){
            valor = 4;
        }
    }
    else{

        valor = 6;
    }
    return valor;
}