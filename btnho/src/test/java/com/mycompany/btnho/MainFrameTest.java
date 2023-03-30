/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.btnho;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nguyen Le
 */
public class MainFrameTest {
    
    
    
    public MainFrameTest() {
    }
 
    @Test
    public void testChuVi() {
        Triangle t = new Triangle(3,4,5);
        Double expect = 12.0;
        Double actual = t.getPerimeter();       
        assertEquals(actual,expect);
        System.out.println("Chu vi tam giác với các cạnh có độ dài là : 3, 4, 5 = " + actual);
    }

    @Test
    public void testDienTich() {
        Triangle t = new Triangle(3,4,5);
        Double expect = 6.0;
        Double actual = t.getArea();       
        assertEquals(actual,expect);
        System.out.println("Diện tích tam giác với các cạnh có độ dài là : 3, 4, 5 = " + actual);
    }

    @Test
    public void testTamGiacCan() {
        Triangle t = new Triangle(3,3,5);
        String expect = "Đây là tam giác cân";
        String actual = t.getType();       
        assertEquals(actual,expect);
        System.out.println("\n" + actual + " Với độ dài các cạnh là : 3, 3, 5");
    }
     
    @Test
    public void testTamGiacVuong() {
        Triangle t = new Triangle(3,4,5);
        String expect = "Đây là tam giác vuông";
        String actual = t.getType();       
        assertEquals(actual,expect);
        System.out.println("\n" + actual + " với độ dài các cạnh là : 3, 4, 5");
    }
    
     @Test
    public void testTamGiacDeu() {
        Triangle t = new Triangle(3,3,3);
        String expect = "Đây là tam giác đều";
        String actual = t.getType();              
        assertEquals(actual,expect);
        System.out.println("\n" + actual + " với độ dài các cạnh là : 3, 3, 3");

    }
    
}
