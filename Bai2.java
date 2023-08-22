/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi4;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Bai2 {

    private int D;
    private int R;

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public Bai2() {

    }

    public Bai2(int D, int R) {
        this.D = D;
        this.R = R;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap do dai chieu dai: ");
        D = sc.nextInt();
        System.out.print("Nhap do dai chieu rong: ");
        R = sc.nextInt();
    }

    public void veHCN() {
        for (int i = 0; i < D; i++) {
            for (int j = 0; j < R; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public float chuVi() {
        return (float) (2 * (D + R));
    }

    public float dienTich() {
        return (float) D * R;
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bai2 HCN = new Bai2();
        HCN.nhap(sc);
        System.out.println("Ve HCN: ");
        HCN.veHCN();
        System.out.println("Chu vi HCN la: " + HCN.chuVi());
        System.out.println("Dien tich HCN la: " + HCN.dienTich());
    }
}
