package controller;

public class Ops {
    public Ops(){
        super();
    }

    public String verificaMaiorNum(int n1, int n2){
        if(n1 > n2){
            return Integer.toString(n1);
        }
        else{
            return Integer.toString(n2);
        }
    }

    public String calculaSomaImpar(int n1, int n2){
        int soma = 0, menor = 0, maior = 0;

        if(n1 > n2){
             maior = n1;
             menor = n2;
        }
        else{
            maior = n2;
            menor = n1;
        }

        for(int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        return Integer.toString(soma);
    }
}
