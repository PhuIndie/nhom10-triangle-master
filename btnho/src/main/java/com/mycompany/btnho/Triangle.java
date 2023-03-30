/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btnho;

/**
 *
 * @author Nguyen Le
 */
public class Triangle {
     private double a = 0;
    private double b = 0;
    private double c = 0;

    // Khoi tao tam giac voi chieu dai 3 canh
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phuong thuc kiem tra 3 canh nhap vao co phai chieu dai 3 canh tam giac khong
    public boolean checkTriangleIsValid() {
        if ((a >= b + c) || (b >= a + c) || (c >= a + b)) return false;
        return true;
    }

    // Phuong thuc kiem tra tam giac vuong
    public boolean checkRightTriangle() {
        if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)) return true;
        return false;
    }

    // Phuong thuc kiem tra tam giac can
    public boolean checkIsoscelesTriangle() {
        if ((a == b) || (b == c) || (a == c)) return true;
        return false;
    }

    // Phuong thuc kiem tra tam giac deu
    public boolean checkEquilateralTriangle() {
        if ((a == b) && (b == c)) return true;
        return false;
    }
    
    // Phuong thuc kiem tra tam giac tu
    public boolean checkObtuseTriangle() {
        if ((a*a > b*b + c*c) || (b*b > a*a + c*c) || (c*c > a*a + b*b)) return true;
        return false;
    }

    // Phuong thuc kiem tra tam giac la loai gi, phuong thuc nay se tra ve 1 so tu nhien
        // 0. Tam giac nhon
        // 1. Tam giac deu
        // 2. Tam giac vuong can
        // 3. Tam giac vuong
        // 4. Tam giac can
        // 5. Tam giac tu
    public int checkTriangleType() {
        if (checkEquilateralTriangle()) return 1;
        else if (checkRightTriangle() && checkIsoscelesTriangle()) return 2;
        else if (checkRightTriangle()) return 3;
        else if (checkIsoscelesTriangle()) return 4;
        else if (checkObtuseTriangle()) return 5;
        return 0;
    }

    public String getType()
    {
        int t1 = checkTriangleType();
        String t2 = "";
        
        if(t1 == 1)
        {
            t2 ="Đây là tam giác đều";
        }
        else if (t1 == 3)
        {
            t2 ="Đây là tam giác vuông";
        }
         else if (t1 == 4)
        {
            t2 ="Đây là tam giác cân";
        }
         else{
             t2 = "Không xác định được tam giác";
         }
        return t2;
    }
    
    // Phuong thuc tinh chieu cao theo canh a
    public double getHeightEqualToSideA() {
        double height = 0;
        height = 2*((Math.sqrt((getPerimeter()/2)*(getPerimeter()/2 - a)*(getPerimeter()/2 - b)*(getPerimeter()/2 - c)))/a);
        return height;
    }

    // Phuong thuc tinh chu vi
    public double getPerimeter() {
        return a + b + c;
    }

    // Phuong thuc tinh dien tich
    public double getArea() {
        return 0.5*getHeightEqualToSideA()*a;
    }

    // Setter
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    // Getter
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
}
