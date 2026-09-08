package com.example.task03;


public class ComplexNumber {
    private final double real;      // Действительная часть
    private final double imaginary; // Мнимая часть

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Возвращает действительную часть
     */
    public double getReal() {
        return real;
    }

    /**
     * Возвращает мнимую часть
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * (a + bi) + (c + di) = (a + c) + (b + d)i
     */
    public ComplexNumber add(ComplexNumber other) {
        if (other == null) {
            return this;
        }
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    /**
     * (a + bi) - (c + di) = (a - c) + (b - d)i
     */
    public ComplexNumber subtract(ComplexNumber other) {
        if (other == null) {
            return this;
        }
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    /**
     * (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
     */
    public ComplexNumber multiply(ComplexNumber other) {
        if (other == null) {
            return this;
        }
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    /**
     * (a + bi) / (c + di) = ((ac + bd) / (c² + d²)) + ((bc - ad) / (c² + d²))i
     */
    public ComplexNumber divide(ComplexNumber other) {
        if (other == null) {
            return this;
        }
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    /**
     * |a + bi| = √(a² + b²)
     */
    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    /**
     * Аргумент комплексного числа (угол в радианах)
     */
    public double argument() {
        return Math.atan2(imaginary, real);
    }

    /**
     * Сопряженное комплексное число
     * conjugate(a + bi) = a - bi
     */
    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imaginary);
    }

    @Override
    public String toString() {
        if (imaginary == 0) {
            return String.format("%.2f", real);
        } else if (real == 0) {
            return String.format("%.2fi", imaginary);
        } else if (imaginary > 0) {
            return String.format("%.2f + %.2fi", real, imaginary);
        } else {
            return String.format("%.2f - %.2fi", real, -imaginary);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber that = (ComplexNumber) obj;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(real) ^ Double.hashCode(imaginary);
    }
}