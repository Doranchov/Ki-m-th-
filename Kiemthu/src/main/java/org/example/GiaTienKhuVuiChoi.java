package org.example;

public class GiaTienKhuVuiChoi {
    public static String tinhGiaTien(int tuoi) {
        if (tuoi < 0 || tuoi > 100) {
            return "Không hợp lệ";
        } else if (tuoi <= 6) {
            return "Miễn phí";
        } else if (tuoi <= 18) {
            return "120.000 VNĐ";
        } else if (tuoi <= 60) {
            return "160.000 VNĐ";
        } else {
            return "60.000 VNĐ";
        }
    }
}
