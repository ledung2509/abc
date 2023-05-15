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
public class Nhanvien {

    private String name;
    private int age;
    private String id;
    private double luong;
    private int time;

    public Nhanvien() {
    }

    public Nhanvien(String name, int age, String id, double luong, int time) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.luong = luong;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên nhân viên:");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi của nhân viên:");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập địa chỉ của nhân viên:");
        id = scanner.nextLine();
        System.out.print("Tiền lương của nhân viên hằng tháng:");
        luong = scanner.nextDouble();
        System.out.print("Tổng thời gian làm việc của nhân viên đó:");
        time = scanner.nextInt();
    }

    public void printInfo() {
        System.out.println("OUTPUT:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
        System.out.println(luong);
        System.out.println(time);
    }

    public void tinhThuong() {
        float thuong;
        if (time >= 200) {
             thuong = (float) (luong * 0.2);
             System.out.println(thuong);
        } else if (time < 200 && time >= 100) {
             thuong = (float) (luong * 0.1);
             System.out.println(thuong);
        } else if (time < 100) {
          thuong = time * 0;
            System.out.println(thuong);
        }
    }
}
