/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfinalproject;

/**
 *
 * @author Toshiba
 */
public class Eigenvectors extends Eigenvalues {
    Determinant d=new Determinant();
    
    
    public String EigenVectors(double a11,double a12,double a13,double a21,double a22,double a23, double a31, double a32, double a33, double A1,double A2, double A3)
    {String x=" ";
             double e1,e2,e3,ctr=0;
     double Trace=a11+a22+a33;
     double Det=d.det3by3(a11, a12, a13, a21, a22, a23, a31, a32, a33);
     for(e1=1;e1<20;e1++){
     for(e2=1;e2<20;e2++){
     
         for(e3=1;e3<20;e3++){
         
            if(e1+e2+e3==Trace && e1*e2*e3==Det){
                ctr++;
            if(ctr==1){x=x+"\n"+("Possible combinations are \n");}
           x=x+"\n"+("Lambda1 is = "+e1+"Lamda2 is ="+e2+"Lambda 3 is = "+e3
           +"\n---------------------------------------");
            break;
            }
             if(e1+e2+e3==Trace && e1*e2*e3==Det){
                 
             break;}
         }
     
     }
         }
     e1=7;
    x=x+"\n"+("For Lambda 1 = "+e1+" Matrix is : ");
    x=x+"\n"+(a11+" - "+e1+"   "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+" - "+e1+"   "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33+" - "+e1+" | "+A3);
    
    double La_11=a11-e1;//a11 after subtracted by Lambda1(L1)
    double La_22=a22-e1;//a22 after subtracted by Lambda1(L1)
    double La_33=a33-e1;//a33 after subtracted by Lambda1(L1)
    x=x+"\n"+("After Subtraction Matrix is ");
    x=x+"\n"+(La_11+"   "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+La_22+"   "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+La_33+" | "+A3);
     Reduction3by3(La_11,a12,a13,a21,La_22,a23,a31,a32,La_33,A1,A2,A3);
return x;    }
    public String Reduction3by3(double a11,double a12,double a13,double a21,double a22,double a23,double a31,double a32,double a33,double A1,double A2,double A3){
    x=x+"\n"+("You have entered the following matrix:");
     x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3+"\n");
     //Exchanging Rows
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
    
    x=x+"\n"+("Here R1 is exchanged by R3");
      x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
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
    x=x+"\n"+("Here R1 is exchanged by R2");
      x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);
    }
     
     
     if(a11==0 && a21==0 && a31==0){
         double aa_23,aa_33,A_2,A_3,AA_3;
         aa_23=a23-(a22/a12)*a13;
         aa_33=a33-(a32/a12)*a13;
         A_2=A2-(a22/a12)*A1;
         A_3=A3-(a32/a12)*A1;
         AA_3=A_3-(aa_33/aa_23)*A_2;
         x=x+"\n"+("New Form ");
         x=x+"\n"+("Mulitplying "+a22+"/"+a12+" by R1 and subtracting from R2");
       x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);
       x=x+"\n"+("New Form ");
         x=x+"\n"+("Mulitplying "+a32+"/"+a12+" by R1 and subtracting from R3");
       x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+0+ "    "+aa_33
     +" | "+A_3);
       x=x+"\n"+("New Form ");
         x=x+"\n"+("Mulitplying "+aa_33+"/"+aa_23+" by R2 and subtracting from R3");
       x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+0+"    "+aa_23+" | "+A_2+"\n"+a31+"    "+0+ "    "+0
     +" | "+AA_3);
      /* if(AA_3!=0){
       
           x=x+"\n"+("no Solution Exists because of "+AA_3);
       
       
       }*/
        if(aa_23!=0){
        
           double var_3=A_2/aa_23;
           double var_2=(A1/a12)-a13*(A_2/aa_23);
           
           x=x+"\n"+("value of Var3= "+var_3);
           x=x+"\n"+("Value of Var2= "+var_2);
       }
       else if(aa_23==0){
       double var_2const=(A1/a12);
        double var_2 =-a13/a12;
        double var_3const=(A1/a13);
        double var_3=-a12/a13;
       
        x=x+"\n"+("there exists an infinite solution");
        x=x+"\n"+("Variable 2 in terms of var3 is \n var2= "+var_2const+" + ("+var_2+" var3)\n          OR ");
         x=x+"\n"+("Variable 3 in terms of var2 is \n var3= "+var_3const+" + "+var_3+" var2)");
       }
       else if(aa_23==0 && A_2!=0){
       
           x=x+"\n"+("No Solution Exists");
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
      x=x+"\n"+("New form:");
     x=x+"\n"+("Mulitplying R2 by "+-a11+"/"+a_21+" and adding in R1");
     x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);
     }
         
    
     if(a31!=0){
     double x2=(-1*a11)/a31;
     a31=(a31*x2)+a11;
     a32=(a32*x2)+a12;
     a33=(a33*x2)+a13;
     A3=(A3*x2)+A1;
     
     x=x+"\n"+("New form:");
     x=x+"\n"+("Mulitplying R2 by "+-a11+"/"+a_21+" and adding in R1");
     x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);}
     else if(a31==0 && a21==0){
     
         x=x+"\n"+("No Row Operation required to make a21 and a31 entries zero as they are already zero "
                 + "\n---------------------------------------------");
     
     }
         double a_32=a32;
     
     
     if(a32!=0){
         
     double x3=(-1*a22)/a32;
     a32=(a32*x3)+a22;
     a33=(a33*x3)+a23;
     A3=(A3*x3)+A2;
             
     
     x=x+"\n"+("New form:");
      x=x+"\n"+("Mulitplying R3 by"+a22+"/"+a_32+"and adding in R2");
     x=x+"\n"+(a11+"    "+a12+"    "+a13+" | "+A1+"\n"+a21+"    "+a22+"    "+a23+" | "+A2+"\n"+a31+"    "+a32+ "    "+a33
     +" | "+A3);}
     else if(a32==0){
     x=x+"\n"+("No row operation required to make a32 entry zero  as it is already zero"
             + "\n----------------------------------------------------");}
     if(a33!=0 ){
     double var3=A3/a33;
     double var2=(A2-(a23*var3))/a22;
     double var1=(A1-(a13*var3)-(a12*var2))/a11;
     x=x+"\n"+("Values of varibles:variable 1= "+var1);
      x=x+"\n"+("Values of varibles:variable 2= "+var2);
       x=x+"\n"+("Values of varibles:variable 3= "+var3);
     } 
     
     else if(a33==0 && A3!=0){
          x=x+"\n"+("No Solution Exists");
         }
     else if(a33==0 && A3==0){
     
         x=x+"\n"+("There exists an infinite solution");
         if(a22!=0){
           
             double var3=1;
         double var2=(-a23/a22)*var3;
         double AAA2=A2/a22;                   
        
         double var1=(-a12*(-a23*var3/a22)-a13*var3)/a11;
         double var1const=((A1/a11)-(a12*A2/a22*a11));
         
         
         x=x+"\n"+("Eigen Vectors are :  ");
         x=x+"\n"+("["+var1+","+var2+","+var3+"]T");
     }
        
}}
    return x;}
   
}
