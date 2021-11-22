package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.cert.TrustAnchor;

import static org.example.Triangle.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyTest {

    @Test
    @Order(1)
    @DisplayName("Проверка существования треугольника")
    public void triangletest() {
        assertTrue(isTriangle(), "Треугольник существует");

    }


    @Test
    @Order(2)
    @DisplayName("Проверка на равносторонний треугольник")
    void equilateral() {
        assertFalse(a == b && a == c && b == c, "Треугольник не равносторонний");

    }

    @Test
    @Order(3)
    @DisplayName("Проверка на равнобедренность треугольника")
    void equilateral2() {
        assertFalse(a == b && a == c, "Треугольник не равнобедренный");
    }

    @Test
    @Order(4)
    @DisplayName("Проверка на отрицательные стороны")
    void negativsides(){
        assertTrue(a>0 && b>0 && c>0, "У треугольника нет отрицательных сторон");
    }

    @Test
    @Order(5)
    @DisplayName("Проверка на нулевые стороны")
    void zerosides(){
        assertNotNull(a);
        assertNotNull(b);
        assertNotNull(c);

    }
    


}
