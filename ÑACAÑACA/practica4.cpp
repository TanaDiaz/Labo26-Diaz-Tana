
bool convNumero (int valor, int base, string& resu){
bool retorno;
resu = "";
int resto;
char c;
    if(base != 2 && base != 8 && base != 10 && base != 16){

        retorno = false;
    }

    else{  

        while(valor > 0){
           
        resto = valor%base;

        if (resto < 10) {
            c = resto + '0';

}
        else {

            c = (resto - 10) + 'A';
        }     
            valor = valor/base;
            resu = c + resu;

        }
    retorno = true;
    return retorno;
    }
}