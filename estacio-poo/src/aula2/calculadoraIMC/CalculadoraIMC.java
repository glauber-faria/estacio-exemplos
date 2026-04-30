package aula2.calculadoraIMC;

public class CalculadoraIMC {
    int peso;
    float altura;

    public CalculadoraIMC(int peso,  float altura){
       this.peso = peso;
       this.altura = altura;
    }

    public double calcular(){
        return this.peso / (this.altura * this.altura);
    }

    public String classificar(){
        double result = this.calcular();
        if(result < 18.5){
            return "Magreza";
        } else if (result >= 18.5 && result <= 24.9) {
            return "Normal";
        } else if (result >= 25 && result <= 29.9) {
            return "Sobrepeso";
        }else if(result >= 30 && result <=34.9){
            return "Obesidade grau I";
        }else if(result >=35 && result <= 39.9){
            return "Obesidade grau II";
        }
        else{
            return "Obesidade grau III";
        }
    }

}
