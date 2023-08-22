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
public class Bai1 {

    private String MaSach;
    private String TenSach;
    private String TacGia;
    private String NXB;
    private int NamXuatBan;

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public Bai1() {

    }

    public Bai1(String MaSach, String TenSach, String TacGia, String NXB, int NamXuatBan) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TacGia = TacGia;
        this.NXB = NXB;
        this.NamXuatBan = NamXuatBan;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        MaSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        TenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        TacGia = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        NXB = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        NamXuatBan = sc.nextInt();
        sc.nextLine();
    }

    public void xuat() {
        System.out.printf("%-20s %-30s %-30s %-30s %-20d %n", MaSach, TenSach, TacGia, NXB, NamXuatBan);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();
        sc.nextLine();

        Bai1[] sl = new Bai1[n];
        for (int i = 0; i < n; i++) {
            Bai1 sach = new Bai1();
            System.out.println("Quyen " + (i + 1) + ": ");
            sach.nhap(sc);
            sl[i] = sach;
        }

        System.out.printf("%-20s %-30s %-30s %-30s %-20s %n", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban", "Nam xuat ban");
        for (int i = 0; i < n; i++) {
            sl[i].xuat();
        }
    }
}
