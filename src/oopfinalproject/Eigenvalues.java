/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfinalproject;
import java.util.Scanner;
/**
 * 
 * @author Toshiba
 */
public class Eigenvalues extends Determinant {
    String x;
    public String FindingLambda(double a11,double a12,double a13,double a21,double a22,double a23, double a31, double a32, double a33){
        Scanner input=new Scanner(System.in);
     double e1,e2,e3,ctr=0;
     double Trace=a11+a22+a33;
     Determinant d=new Determinant();
     double Det=d.det3by3(a11, a12, a13, a21, a22, a23, a31, a32, a33);
     for(e1=1;e1<20;e1++){
     for(e2=1;e2<20;e2++){
     
         for(e3=1;e3<20;e3++){
         
            if(e1+e2+e3==Trace && e1*e2*e3==Det){
                ctr++;
            if(ctr==1){x=("Possible combinations are \n");}
           x=x+("Lambda1 is = "+e1+"Lamda2 is ="+e2+"Lambda 3 is = "+e3
           +"\n---------------------------------------");
            break;
            }
             if(e1+e2+e3==Trace && e1*e2*e3==Det){
                 
             break;}
         }
     
     }
         }

return x;    }
}

