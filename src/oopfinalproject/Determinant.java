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
public class Determinant {
      public double det2by2(double a11,double a12 ,double a21,double a22){
        double x,y,z;
          double result= (a11*a22)-(a12*a21);
        return result;
      }
        
public double det3by3(double a11,double a12,double a13,double a21,double a22,double a23, double a31, double a32, double a33){
    double result=(a11*((a22*a33)-(a23*a32)))-(a12*((a21*a33)-(a23*a31)))+(a13*((a21*a32)-(a22*a31)));
        return result;}


}
