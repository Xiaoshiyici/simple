package com.mycompany.mandelbrot;

/**
 *
 * @author Ziyu Guo
 * @version 14 April 2020
 */
public class Complex {
    final double real;
    final double imag;
    
    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    } //Complex(double, double)
     public Complex add(Complex z){
        return new Complex(this.real + z.real, this.imag + z.imag);
    } //add(Complex)
    
    public Complex multiply(Complex z){
        double first = this.real * z.real;
        double outside = this.real * z.imag;
        double inside = this.imag * z.real;
        double last = this.imag * z.imag;
        
        return new Complex(first - last, outside + inside);
    } //multiply(Complex) public Complex add(Complex z){
        
    public double magnitude(){
        return Math.sqrt(this. real * this.real + this.imag * this.imag);
    } //magnitude()
    public double magnitudeSquared() {
        
//        double realSquared = this.real * this.real;
//        double imaginarySquared = this.imaginary * this.imaginary;
//        return realSquared + imaginarySquared;

        return Math.pow(this.magnitude(), 2);
    } // magnitudeSquared()
    @Override
    public String toString(){
        if (this.imag < 0){
            return this.real + " - " + Math.abs(this.imag) + "i";
        }
        else{
            return this.real + " + " + this.imag + "i";
        }
    }
    
    public static void main(String[] args) {
        
    }
    
}
