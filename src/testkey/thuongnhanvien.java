/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkey;

/**
 *
 * @author ADMIN
 */
public class thuongnhanvien {

    public static void main(String[] args) {
        Nhanvien ct = new Nhanvien();
        ct.inputInfo();
        ct.printInfo();
        System.out.println("Tiền được thưởng là:");
        ct.tinhThuong();
    }
}
