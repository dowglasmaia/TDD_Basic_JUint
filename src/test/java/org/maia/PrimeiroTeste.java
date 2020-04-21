package org.maia;

import java.math.BigDecimal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PrimeiroTeste {

    Calculadora calculadora;

    @BeforeEach
    public void setUp(){
        this.calculadora = new Calculadora();
    }

    @DisplayName("Deve Somar 02 Números")
    @Test
    public void deveSomar2Nuemros(){
        // cenário
    int numero1 =10, numero2 = 5;

        //execução
    int resultado = calculadora.somar(numero1, numero2);

        //verificação
        //Assert.assertEquals(15, resultado);
        Assertions.assertThat(resultado).isEqualTo(15);
    }


    @DisplayName("Não Deve Somar Núemros Negativos")
    @Test
    public void naoDeveSomarNumerosNegativos(){
        //senario
        int num1 = -20, num2 = 10;

        //execução
        //int resultado = calculadora.somar(num1, num2);
        org.junit.jupiter.api.Assertions
                .assertThrows(RuntimeException.class, ()-> calculadora.somar(num1, num2));
    }


    @Test
    public void deveSubritarir2Numeros(){
        //senario
        int num1 = 50, num2= 100;

        //execução
        int resultado = 50;

        //verificação
        Assertions.assertThat(num2 - num1).isEqualTo(resultado);
    }

    @Test
    public void nãoDeveSubritairNumeroNegativos(){
        //senario
        int num1 = -50, num2= 100;

        //execução
       // int resultado = calculadora.subitrair( num2 , num1);
       // Assertions.assertThat(resultado).isBetween(10,40);
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, ()-> calculadora.subitrair(num2,num1));
    }

    @Test
    public void deveMultiplicarDoisNumeros() {
    	
    	double resultado = calculadora.multiplicar(10.0, 50.0);
    	
    	Assertions.assertThat(resultado).isEqualTo(500.0);
    	System.out.println("RESULTADO: "+ resultado);  	  
    	
    }
    

 
}

	
/* CLASS*/

class Calculadora{

    public int somar(int num, int num2){
        if(num < 0 || num2 < 0){
            throw  new RuntimeException(" Não é permitido realizar esta operação com números negativos.");
        }
        return num + num2;
    }

    public int subitrair(int num1, int num2){
        if(num1 < 0 || num2 < 0){
            throw  new RuntimeException(" Não é permitido realizar esta operação com números negativos.");
        }
        return num1-num1;
    }

    public Double multiplicar(Double num1, Double num2){
        return num1 * num2;
    }

    public Double dividir(Double num1, Double num2){
        return num1 / num2;
    }

    public BigDecimal dividirComBigDecimal(BigDecimal num1, BigDecimal num2){
        return  num1.divide(num2);
    }

}
