package com.example.task03;

public class Task03Main {
    public static class Complex {
        private double real;
        private double imaginary;

        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imaginary + other.imaginary);
        }

        public Complex multiply(Complex other) {
            double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
            double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
            return new Complex(newReal, newImaginary);
        }

        @Override
        public String toString() {
            if (imaginary < 0) {
                return real + " - " + (-imaginary) + "i";
            }
            return real + " + " + imaginary + "i";
        }
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(3.0, 2.0); // 3 + 2i
        Complex c2 = new Complex(1.0, 4.0); // 1 + 4i

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);

        System.out.println("Первое число: " + c1);
        System.out.println("Второе число: " + c2);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
