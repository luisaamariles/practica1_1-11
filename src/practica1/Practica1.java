
package practica1;
import java.util.Scanner;
/**
 * @author Luisa Maria Amariles
 */
public class Practica1 {
    
    public static void main(String[] args) {
      Scanner scanf= new Scanner(System.in);
      int Opcion;
      double Area;
      double Volumen;
      double Lado;
      double Cateto1;
      double Cateto2;
      double Hipotenusa;
      double Lado_equilatero;
      double Perimetro_equilatero;
      double Area_equilatero;
      double Altura_equilatero;
      double Seguimiento;
      double Parcial1;
      double Parcial2;
      double Nota_definitiva;
      double Quices;
      double Lab;
      double Expo;
      double Proyecto1;
      double Proyecto_final;
      double Nota_definitiva2;
      int Precio;
      int Numero_personas;
      int Cont=0;
      int Año;
      int Sexo;
      int Registro;
      int Cont25=0;
      int Edad;
      int Cont_Mujeres=0;
      int Cont_Reg=0;
      double P_25;
      double P_Mujeres;
      double P_Reg;
      int Numero1;
      int Numero2;
      int Cont10=11;
      int U_digito;
      int Suma;
      int Resta;
      int Multiplicacion;
      int Division;
      double Raiz;
      int Divisible1;
      int Divisible2;
      double Numero_factorial;     
      double Factorial=1;
      int Num_per_curso;
      int Cont_curso=0;
      int Cod_estudiante;
      double Nota1;
      double Nota2;
      double Nota3;
      double Nota4;
       
      System.out.println("Ingrese el ejercicio que quiere realizar:");
      System.out.println("1. Punto 1");
      System.out.println("2. Punto 2");
      System.out.println("3. Punto 3");
      System.out.println("4. Punto 4");
      System.out.println("5. Punto 5");
      System.out.println("6. Punto 6");
      System.out.println("7. Punto 7");
      System.out.println("8. Punto 8");
      System.out.println("9. Punto 9");
      System.out.println("10. Punto 10");
      System.out.println("11. Punto 11");
      System.out.println("12. Punto 12");
      Opcion=scanf.nextInt();
      System.out.println(Opcion);
      switch(Opcion){
          case 1://área y volumen de un cubo
            System.out.print("Ingrese la medida de la arista del cubo:");
            Lado=scanf.nextDouble();
            Area=6*Lado;
            System.out.println("El Area del cubo es:"+Area);
            Volumen=Math.pow(Lado,3);
            System.out.println("El volumen del cubo es:"+Volumen);
           break; 
          case 2://Hipotenusa de un triangulo rectangulo
            System.out.print("Ingrese la medida del cateto 1:");   
            Cateto1=scanf.nextDouble();
            System.out.print("Ingrese la medida del cateto 2:");   
            Cateto2=scanf.nextDouble();
            Hipotenusa=Math.sqrt(Math.pow(Cateto1,2)+Math.pow(Cateto2,2));
            System.out.println("La hipotenusa del triangulo rectangulo es:"+Hipotenusa);
          break;
          case 3://Altura, área y perimetro de un triangulo equilatero
            System.out.print("Ingrese la medida del lado del triangulo equilatero:");  
            Lado_equilatero=scanf.nextDouble();
            Perimetro_equilatero=3*Lado_equilatero;
            System.out.println("El perimetro del triangulo equilatero es:"+Perimetro_equilatero);
            Area_equilatero=(Math.pow(Lado_equilatero,2))*((Math.sqrt(3))/4);
            System.out.println("El area del triangulo equilatero es:"+Area_equilatero);
            Altura_equilatero=Lado_equilatero*((Math.sqrt(3))/2);
            System.out.println("La altura del triangulo equilatero es:"+Altura_equilatero);
          break;
          case 4://Nota definitiva de una asignatura
            System.out.print("Ingrese la nota del seguimiento:");   
            Seguimiento=scanf.nextDouble();
            System.out.print("Ingrese la nota del parcial 1:");   
            Parcial1=scanf.nextDouble();
            System.out.print("Ingrese la nota del parcial 2:");   
            Parcial2=scanf.nextDouble();
            Nota_definitiva=(0.5*Seguimiento)+(0.25*Parcial1)+(0.25*Parcial2);
            System.out.print("La nota definitiva es:"+Nota_definitiva);   
          break;
          case 5://Nota definitiva con mensajes clasificatorios
            System.out.println("Ingrese la nota de los quices y el seguimiento:");   
            Quices=scanf.nextDouble();
            System.out.println("Ingrese la nota del laboratorio:");   
            Lab=scanf.nextDouble();
            System.out.println("Ingrese la nota de las exposiciones:");   
            Expo=scanf.nextDouble(); 
            System.out.println("Ingrese la nota del proyecto 1:");   
            Proyecto1=scanf.nextDouble();
            System.out.println("Ingrese la nota del proyecto final:");   
            Proyecto_final=scanf.nextDouble(); 
            Nota_definitiva2=(0.2*Quices)+(0.3*Lab)+(0.1*Expo)+(0.15*Proyecto1)+(0.25*Proyecto_final);
            System.out.println("Su nota final es:"+Nota_definitiva2); 
            if(Nota_definitiva2<=1){
                System.out.println("Estas en el lugar equivocado"); 
            }else if(Nota_definitiva2>1 && Nota_definitiva2<=2){
                System.out.println("Remal"); 
            }else if(Nota_definitiva2>2 && Nota_definitiva2<=3){
                System.out.println("Es posible recuperarse"); 
            }else if(Nota_definitiva2>3 && Nota_definitiva2<=4){
                System.out.println("Normalito"); 
            }else if(Nota_definitiva2>4 && Nota_definitiva2<=4.5){
                System.out.println("Muy bien"); 
            }else if(Nota_definitiva2>4.5 && Nota_definitiva2<=5){
                System.out.println("Excelente estudiante"); 
            }
          break;
          case 6://Maquina dispensadora
            System.out.println("Ingrese el numero del producto que desea"); 
            Precio=scanf.nextInt();
            switch(Precio){
               case 1:
                System.out.println("El precio del producto es $500");
               break;
               case 2:
                System.out.println("El precio del producto es $800"); 
               break;
               case 3:
                System.out.println("El precio del producto es $300");
               break;
               case 4:
                System.out.println("El precio del producto es $900");
               break;
               default:
                System.out.println("El producto no esta disponible");
               break;
            }    
          break;
          case 7://Oficina de seguros
            System.out.println("Ingrese el numero de personas que desea ingresar");
            Numero_personas=scanf.nextInt();
            while(Cont < Numero_personas){
               System.out.println("Ingrese el año de nacimiento:");
               Año=scanf.nextInt();
               System.out.println("Ingrese el sexo: \n 1.Femenino \n 2.Masculino");
               Sexo=scanf.nextInt();
               System.out.println("Ingrese el registro: \n 1.Medellin \n 2.Otras ciudades");
               Registro=scanf.nextInt();
               Cont++;          
               Edad=2016-Año;
               if(Edad < 25){
                Cont25++;
               }
               if(Sexo==1){
                Cont_Mujeres++;
               }
               if(Registro==2){
                Cont_Reg++;
               }
            }
            P_25=(Cont25*100)/Numero_personas;
            P_Mujeres=(Cont_Mujeres*100)/Numero_personas;
            P_Reg=(Cont_Reg*100)/Numero_personas;
            System.out.println("El porcentaje de conductores menores de 25 años es:"+P_25);
            System.out.println("El porcentaje de conductores de sexo femenino es:"+P_Mujeres);
            System.out.println("El porcentaje de conductores con registro en otro ciudad es:"+P_Reg);
          break;
          case 8://Operaciones con números de dos cifras
            System.out.println("Ingrese un numero de dos cifras:");  
            Numero1=scanf.nextInt();  
            System.out.println("Ingrese otro numero de dos cifras:");  
            Numero2=scanf.nextInt();
            U_digito=Numero1%10;
            switch(U_digito){
                case 0:
                  if(Numero1>Numero2){
                    System.out.println("El numero mayor es el:"+Numero1);  
                  }else if(Numero2>Numero1){
                    System.out.println("El numero mayor es el:"+Numero2);  
                  }
                break;
                case 1:
                  if(Numero1<Numero2){
                    System.out.println("El numero menor es el:"+Numero1);  
                  }else if(Numero2<Numero1){
                    System.out.println("El numero menor es el:"+Numero2);  
                  }
                break;
                case 2:
                  Suma=Numero1+Numero2;
                  System.out.println("La suma es:"+Suma);
                break;
                case 3:
                  Resta=Numero1-Numero2; 
                  System.out.println("La resta es:"+Resta);
                break;
                case 4:
                  Multiplicacion=Numero1*Numero2; 
                  System.out.println("La multiplicacion es:"+Multiplicacion);
                break;
                case 5:
                  Division=Numero1/Numero2; 
                  System.out.println("La division es:"+Division);
                break;
                case 6:
                   Divisible1=Numero1%Numero2;
                   if(Divisible1==0){
                    System.out.println("El numero 1 es divisible por el numero 2");   
                   }else{
                    System.out.println("El numero 1 no es divisible por el numero 2");   
                   }
                break;
                case 7:
                   Divisible2=Numero2%Numero1;
                   if(Divisible2==0){
                    System.out.println("El numero 2 es divisible por el numero 1");   
                   }else{
                    System.out.println("El numero 2 no es divisible por el numero 1");   
                   } 
                break;
                case 8:
                   Raiz=Math.sqrt(Numero1);
                   System.out.println("La raiz cuadrada del numero 1 es:"+Raiz);
                break;
                case 9:
                 System.out.println("Que punto tan facil parce...");   
                break;
                default:
                    
                break;
            }
          break;
          case 9://Generar los números del 1 al 10
             while(Cont10 > 0){
                 Cont10--;
                 System.out.println("Numero:"+Cont10);
             }              
          break;
          case 10:
              
          break;
          case 11://Factorial de números enteros
            System.out.println("Ingrese un número");  
            Numero_factorial=scanf.nextInt();            
            if(Numero_factorial%1==0){
                for(int i=1;i<=Numero_factorial+1;i++){
                    for(int j=1;j<i;j++){
                        Factorial=Factorial*j;                       
                    }
                    System.out.println("El factorial de número"+(i-1)+" es:"+Factorial);
                    Factorial=1;
                }
            }
          break;
          case 12://Promedio de las notas del curso
            System.out.println("Ingrese el numero de personas del curso:");
            Num_per_curso=scanf.nextInt();
            while(Cont_curso < Num_per_curso){  
               System.out.println("Ingrese el código del estudiante:");
               Cod_estudiante=scanf.nextInt();
               System.out.println("Ingrese la evaluación 1");
               Nota1=scanf.nextDouble();
               System.out.println("Ingrese la evaluación 2");
               Nota2=scanf.nextDouble();
               System.out.println("Ingrese la evaluación 3");
               Nota3=scanf.nextDouble();
               System.out.println("Ingrese la evaluación 4");
               Nota4=scanf.nextDouble();
            }
          break;
          default:
             System.out.println("Ejercicio no disponible!");
          break;
    
      }
    }
    
}
