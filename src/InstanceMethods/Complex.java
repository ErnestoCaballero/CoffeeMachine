package InstanceMethods;

public class Complex {
    double real;
    double imaginary;

    void add(Complex complex) {
        this.real += complex.real;
        this.imaginary += complex.imaginary;
    }

    void subtract(Complex complex) {
        this.real -= complex.real;
        this.imaginary -= complex.imaginary;
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }
}
