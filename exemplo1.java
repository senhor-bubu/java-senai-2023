// Tipos de variáveis em java
/*
 * String-> armazena texto
 * char -> armazena uma unica letra
 * int -> números inteiros
 * float -> números decimais
 * double -> números decimais. mais precisão
 */

 /*
  * toda variavel DEVE começar com letra minúscula
  *não pode haver espaço no nome da variavel
  *nomealuno, enderecocliente
  */



 public class exemplo1{

public static void main(String[]args){
String nome = "bruno rocha";
int idade = 16;
boolean chuva = true; // em variáveis booleanas eu uso true ou false
char letra = 'b';
double salario = 3550.49;
float altura = (float) 2.00;
System.out.println("meu nome é: "+nome);

System.out.println("minha idade é: "+idade);
System.out.println("esta chovendo?"+chuva);
System.out.println("meu salario é" + salario);
System.out.println("eu tenho" + altura+"metros");
}


 }