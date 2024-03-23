package org.example.test;

import org.example.GiaTienKhuVuiChoi;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testGiaTienKhuVuiChoi {
    @Test
    public void testBien(){
        assertEquals("Không hợp lệ", GiaTienKhuVuiChoi.tinhGiaTien(-1));
        assertEquals("Miễn phí", GiaTienKhuVuiChoi.tinhGiaTien(0));
        assertEquals("Miễn phí", GiaTienKhuVuiChoi.tinhGiaTien(6));
        assertEquals("120.000 VNĐ", GiaTienKhuVuiChoi.tinhGiaTien(7));
        assertEquals("120.000 VNĐ", GiaTienKhuVuiChoi.tinhGiaTien(18));
        assertEquals("160.000 VNĐ", GiaTienKhuVuiChoi.tinhGiaTien(19));
        assertEquals("160.000 VNĐ", GiaTienKhuVuiChoi.tinhGiaTien(60));
        assertEquals("60.000 VNĐ", GiaTienKhuVuiChoi.tinhGiaTien(61));
        assertEquals("60.000 VNĐ", GiaTienKhuVuiChoi.tinhGiaTien(100));
        assertEquals("Không hợp lệ", GiaTienKhuVuiChoi.tinhGiaTien(101));
    }
}
