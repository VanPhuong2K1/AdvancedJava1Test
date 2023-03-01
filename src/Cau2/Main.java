package Cau2;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        KyThuat ng1 = new KyThuat("2019602294","NguyenVanPhuong","2001","ThaiNguyen","DienTuVienThong");
        KyThuat ng2 = new KyThuat();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten:");
        ng2.setHoTen(scanner.nextLine());
        System.out.print("Nhap nam sinh:");
        ng2.setNamSinh(scanner.nextLine());
        System.out.print("Nhap dia chi:");
        ng2.setDiaChi(scanner.nextLine());
        System.out.print("Nhap chuyen nganh:");
        ng2.setChuyenNganh(scanner.nextLine());
        System.out.println(ng1.toString());
        System.out.println(ng2.toString());
    }
}
