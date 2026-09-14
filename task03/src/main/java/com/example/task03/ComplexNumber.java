package com.example.task03;

public class ComplexNumber {
    int real_a;
    int real_b;

    public ComplexNumber(int real_a, int real_b){
        this.real_a = real_a;
        this.real_b = real_b;
    }

    public String toString(){
        if (this.real_b > 0) {
            return this.real_a + "+" + this.real_b + "i";
        }
        else if (this.real_b < 0){
            return this.real_a + "" + this.real_b + "i";
        }
        else{
            return this.real_a + "";
        }
    }

    public ComplexNumber summary(ComplexNumber other){
        int new_real_a = this.real_a + other.real_a;
        int new_real_b = this.real_b + other.real_b;
        return new ComplexNumber(new_real_a, new_real_b);
    }

    public ComplexNumber product(ComplexNumber other){
        int new_real_a = this.real_a * other.real_a - this.real_b * other.real_b;
        int new_real_b = this.real_a * other.real_b + other.real_a * this.real_b;
        return new ComplexNumber(new_real_a, new_real_b);
    }
}
