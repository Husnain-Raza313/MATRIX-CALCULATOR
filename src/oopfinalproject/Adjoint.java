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
public class Adjoint extends Determinant {
   public String adj3x3(double a11,double a12,double a13,double a21,double a22,double a23, double a31, double a32, double a33){
        double e11=a22*a33-a23*a32;
        double e12=a32*a13-a33*a12;
        double e13=a12*a23-a13*a22;
        double e21=a23*a31-a21*a33;
        double e22=a33*a11-a31*a13;
        double e23=a13*a21-a11*a22;
        double e31=a21*a32-a22*a31;
        double e32=a31*a12-a32*a11;
        double e33=a11*a22-a12*a21;
        String x=
        ("Final form of Adjoint:")+"\n"+
        (e11+"    "+e12+"    "+e13)+"\n"+
                (e21+"    "+e22+"    "+e23)+"\n"+
                (e31+"    "+e32+"    "+e33);
        return x;
    }
      
    
    public String AdjForms3x3(double a11,double a12,double a13,double a21,double a22,double a23, double a31, double a32, double a33){
        String x="First form:"+"\n"+
  (a11+"    "+a12+"    "+a13+"    "+a11+"    "+a12)+"\n"+
   (a21+"    "+a22+"    "+a23+"    "+a21+"    "+a22)+"\n"+
   (a31+"    "+a32+"    "+a33+"    "+a31+"    "+a32)+"\n"+
   (a11+"    "+a12+"    "+a13+"    "+a11+"    "+a12)+"\n"+
   (a21+"    "+a22+"    "+a23+"    "+a21+"    "+a22)+"\n"+
("Second Form:")+"\n"+
 (a22+"    "+a23+"    "+a21+"    "+a22)+"\n"+
   (a32+"    "+a33+"    "+a31+"    "+a32)+"\n"+
   (a12+"    "+a13+"    "+a11+"    "+a12)+"\n"+
   (a22+"    "+a23+"    "+a21+"    "+a22);
   return x;
    }

    public String adj2x2(double a11,double a12 ,double a21,double a22){
         String x=("Adjoint:")+" \n"+
              (a22+"   -"+a12+"\n-"+a21+"    "+a11);
         return x;
    }
}

    

