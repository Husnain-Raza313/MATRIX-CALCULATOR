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
public class Inverse extends Adjoint{
     public String inv3x3(double a11,double a12,double a13,double a21,double a22,double a23, double a31, double a32, double a33){
         String x;
        double e11=a22*a33-a23*a32;
        double e12=a32*a13-a33*a12;
        double e13=a12*a23-a13*a22;
        double e21=a23*a31-a21*a33;
        double e22=a33*a11-a31*a13;
        double e23=a13*a21-a11*a22;
        double e31=a21*a32-a22*a31;
        double e32=a31*a12-a32*a11;
        double e33=a11*a22-a12*a21;
        
        
        double InvDet=super.det3by3(a11, a12, a13, a21, a22, a23, a31, a32, a33);
        
        if(InvDet==0){
            x=("Inverse can't be calculated as the determinant is equal to zero!");
        }
        else{
        System.out.println("Inverse:");
         
        x=(e11/InvDet+"    "+e12/InvDet+"    "+e13/InvDet)+"\n"+
                (e21/InvDet+"    "+e22/InvDet+"    "+e23/InvDet)+"\n"+
                (e31/InvDet+"    "+e32/InvDet+"    "+e33/InvDet);
        
}return x;
}
     public String inv2x2(double a11,double a12 ,double a21,double a22){
        double e11=a22;
        double e12=-1*a12;
        double e21=-1*a21;
        double e22=a11;
        String x;
        double InvDet2=super.det2by2(a11, a12, a21, a22);
        System.out.println("Determinant of the entered matrix="+InvDet2);
        if(InvDet2==0){
            x=("Inverse can't be calculated as the determinant is equal to zero!");
        }
        else{
        System.out.println("Inverse:");
        x=(e11/InvDet2+"    "+e12/InvDet2)+"\n"+
        (e21/InvDet2+"    "+e22/InvDet2); 
     }return x;
}
}
