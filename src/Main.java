public static void main(String[] args){
    int num = 15;
    System.out.print(func(num));
}

public static int func (int origin) {
    int cont = 1;
    int vzs = 1;
    int soma = 0;

    for (int i = vzs; i <= origin/2+1; i++) {
        soma += i;
        System.out.println(soma);
        if (soma > origin) {
            i = vzs++;
            soma = 0;
        }
        if (soma == origin){
            cont++;
            i = vzs++;
            soma = 0;
        }
    }

    return cont;
}