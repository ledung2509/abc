/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkey;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Sohoc {

    private int number1;
    private int number2;

    public Sohoc() {
    }

    public Sohoc(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập number1:");
        number1 = scanner.nextInt();
        System.out.print("Nhập number2:");
        number2 = scanner.nextInt();
    }

    public void printInfo() {
        System.out.println(number1);
        System.out.println(number2);
    }
    
    public void Tong(){
        System.out.println("Tổng của number1 và number2:" +(number1 + number2));
    }
    
    public void Hieu(){
        System.out.println("Hiệu của number1 và number2:"+(number1-number2));
    }
    
    public void Tich(){
        System.out.println("Tích của number1 và number2:"+(number1*number2));
    }
    
    public void Thuong(){
        System.out.println("Thương của number1 và number2:"+((float)number1/number2));
    }
}
