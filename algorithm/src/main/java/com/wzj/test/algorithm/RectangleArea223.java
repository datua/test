package com.wzj.test.algorithm;

public class RectangleArea223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int overLapLengthStart = Math.max(A, E);
        int overLapLengthEnd = Math.max(Math.min(C, G), overLapLengthStart);
        int overLapWidthStart = Math.max(B, F);
        int overLapWidthEnd = Math.max(Math.min(D, H), overLapWidthStart);


        int allArea = (C - A) * (D - B) + (G - E) * (H - F);
        int overLapArea = (overLapLengthEnd - overLapLengthStart) * (overLapWidthEnd - overLapWidthStart);

        return allArea - overLapArea;
    }
}
