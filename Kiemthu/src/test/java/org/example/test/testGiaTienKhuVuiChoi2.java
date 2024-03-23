package org.example.test;

import org.example.GiaTienKhuVuiChoi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testGiaTienKhuVuiChoi2 {
    @Test
    public void testGiaTien_MienPhi() {
        int tuoi = 4;
        String giaTien = GiaTienKhuVuiChoi.tinhGiaTien(tuoi);
        assertEquals("Miễn phí", giaTien);
    }
    @Test
    public void testGiaTien_120000() {
        int tuoi = 12;
        String giaTien = GiaTienKhuVuiChoi.tinhGiaTien(tuoi);
        assertEquals("120.000 VNĐ", giaTien);
    }
    @Test
    public void testGiaTien_160000() {
        int tuoi = 30;
        String giaTien = GiaTienKhuVuiChoi.tinhGiaTien(tuoi);
        assertEquals("160.000 VNĐ", giaTien);
    }
    @Test
    public void testGiaTien_60000() {
        int tuoi = 70;
        String giaTien = GiaTienKhuVuiChoi.tinhGiaTien(tuoi);
        assertEquals("60.000 VNĐ", giaTien);
    }
    @Test
    public void testGiaTien_KhongHopLe() {
        int tuoi = -5;
        String giaTien = GiaTienKhuVuiChoi.tinhGiaTien(tuoi);
        assertEquals("Không hợp lệ", giaTien);
    }
}
