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
public class Bai3 {

    private int maSinhVien;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public Bai3() {

    }

    public Bai3(int maSinhVien, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = sc.nextInt();
        System.out.print("Nhap ho ten: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhap diem ly: ");
        diemLy = sc.nextDouble();
        System.out.print("Nhap diem hoa: ");
        diemHoa = sc.nextDouble();
    }

    public void xuat() {
        System.out.printf("%-15d %-30s %-10.1f %-10.1f %-10.1f %-10.1f %n", maSinhVien, hoTen, diemToan, diemLy, diemHoa, diemTB());
    }

    public double diemTB() {
        double diemTB = (diemToan + diemLy + diemHoa) / 3;
        return diemTB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        Bai3[] sl = new Bai3[n];
        for (int i = 0; i < n; i++) {
            Bai3 sv = new Bai3();
            System.out.println("Nhap thong tin sinh vien " + (i + 1));
            sv.nhap(sc);
            sl[i] = sv;
        }
        System.out.printf("%-15s %-30s %-10s %-10s %-10s %-10s %n", "Ma sinh vien", "Ho ten", "Diem toan", "Diem ly", "Diem hoa", "Diem TB");
        for (int i = 0; i < n; i++) {
            sl[i].xuat();
        }
    }
}
