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
public class Newreduction {
     public void Reduction3by3(double a11,double a12,double a13,double a21,double a22,double a23, double a31, double a32, double a33, double A1,double A2, double A3){
        Scanner input=new Scanner(System.in);

if(a11*a11<a21*a21 && a21*a21<a31*a31){
    double temp11=a11;
    a11=a31;
    a31=temp11;
     double temp12=a12;
    a12=a32;
    a32=temp12;
    double temp13=a13;
    a13=a33;
    a33=temp13;

    double temp1=A1;
    A1=A3;
    A3=temp1;
    
    System.out.println("Here R1 is exchanged by R3");
      System.out.println(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);
    
    }
    else if(a11*a11<a31*a31 && a31*a31<a21*a21){ //Exchanging Rows
        double temp11=a11;
    a11=a21;
    a21=temp11;
     double temp12=a12;
    a12=a22;
    a22=temp12;
    double temp13=a13;
    a13=a23;
    a23=temp13;
    
    double temp1=A1;
    A1=A2;
    A2=temp1;
    System.out.println("Here R1 is exchanged by R2");
      System.out.println(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);
    }
     
     
     if(a11==0 && a21==0 && a31==0){
         double aa_23,aa_33,A_2,A_3,AA_3;
         aa_23=a23-(a22/a12)*a13;
         aa_33=a33-(a32/a12)*a13;
         A_2=A2-(a22/a12)*A1;
         A_3=A3-(a32/a12)*A1;
         AA_3=A_3-(aa_33/aa_23)*A_2;
         System.out.println("New Form ");
         System.out.println("Mulitplying "+a22+"/"+a12+"by R1 and subtracting from R2");
       System.out.println(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);
       System.out.println("New Form ");
         System.out.println("Mulitplying "+a32+"/"+a12+"by R1 and subtracting from R3");
       System.out.println(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+0+ "    "+aa_33
     +" | "+A_3);
       System.out.println("New Form ");
         System.out.println("Mulitplying "+aa_33+"/"+aa_23+"by R2 and subtracting from R3");
       System.out.println(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+0+ "    "+0
     +" | "+AA_3);
        if(aa_23!=0){
        
           double var_3=A_2/aa_23;
           double var_2=(A1/a12)-a13*(A_2/aa_23);
           
           System.out.println("value of Var3= "+var_3);
           System.out.println("Value of Var2= "+var_2);
       }
       else if(aa_23==0){
       double var_2const=(A1/a12);
        double var_2 =-a13/a12;
        double var_3const=(A1/a13);
        double var_3=-a12/a13;
       
        System.out.println("there exists an infinite solution");
        System.out.println("Variable 2 in terms of var3 is \n var2= "+var_2const+" + ("+var_2+" var3)\n          OR ");
         System.out.println("Variable 3 in terms of var2 is \n var3= "+var_3const+" + "+var_3+" var2)");
       }
       else if(aa_23==0 && A_2!=0){
       
           System.out.println("No Solution Exists");
       }
     }
         else
     
    
     { 
           double a_21=a21;
         if(a21!=0){
     double x1=(-1*a11)/a21;
     a21=(a21*x1)+a11;
     a22=(a22*x1)+a12;
     a23=(a23*x1)+a13;
     A2 =(A2*x1)+A1;
      System.out.println("New form:");
     System.out.println("Mulitplying R2 by"+-a11+"/"+a_21+" and adding in R1");
     System.out.println(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);
     }
         
    
     if(a31!=0){
     double x2=(-1*a11)/a31;
     a31=(a31*x2)+a11;
     a32=(a32*x2)+a12;
     a33=(a33*x2)+a13;
     A3=(A3*x2)+A1;
     
     System.out.println("New form:");
     System.out.println("Mulitplying R2 by"+-a11+"/"+a_21+" and adding in R1");
     System.out.println(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);}
     else if(a31==0 && a21==0){
     
         System.out.println("No Row Operation required to make a21 and a31 entries zero as they are already zero "
                 + "\n---------------------------------------------");
     
     }
         double a_32=a32;
     
     
     if(a32!=0){
         
     double x3=(-1*a22)/a32;
     a32=(a32*x3)+a22;
     a33=(a33*x3)+a23;
     A3=(A3*x3)+A2;
             
     
     System.out.println("MY New form:");
      System.out.println("Mulitplying R3 by"+a22+"/"+a_32+"and adding in R2");
     System.out.println(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);}
     else if(a32==0){
     System.out.println("No row operation required to make a32 entry zero  as it is already zero"
             + "\n----------------------------------------------------");}
     if(a33!=0 ){
     double var3=A3/a33;
     double var2=(A2-(a23*var3))/a22;
     double var1=(A1-(a13*var3)-(a12*var2))/a11;
     System.out.println("Values of varibles:variable 1="+var1);
      System.out.println("Values of varibles:variable 2="+var2);
       System.out.println("Values of varibles:variable 3="+var3);
     } 
     
     else if(a33==0 && A3!=0){
          System.out.println("NO Solution Exists");
         }
     else if(a33==0 && A3==0){
     
         System.out.println("Infinite solutions exist");
         if(a22!=0){
     
         double var3=(-a23/a22);
         double AAA2=A2/a22;
         System.out.println("Varible 2 in terms of var3 is var2 =: "+AAA2+"+ 122("+var3+")var3");
         double var2=((a12*a23/a22*a11)-(a13/a11));
         double var2const=((A1/a11)-(a12*A2/a22*a11));
         System.out.println("Varible 1 in terms of var3 is var1 =: "+var2+"var3 + ("+var2const+")");
     }
        
}}}
    
}
