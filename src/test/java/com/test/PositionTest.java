package com.test;

import com.test.model.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {

    @Test
    public void testPositionPrezesName() {
        assertEquals("Prezes", Position.PREZES.getName());
    }

    @Test
    public void testPositionPrezesSalary() {
        assertEquals(25000, Position.PREZES.getSalary());
    }

    @Test
    public void testPositionWiceprezesName() {
        assertEquals("Wiceprezes", Position.WICEPREZES.getName());
    }

    @Test
    public void testPositionWiceprezesSalary() {
        assertEquals(18000, Position.WICEPREZES.getSalary());
    }

    @Test
    public void testPositionManagerName(){
        assertEquals("Manager", Position.MANAGER.getName());
    }

    @Test
    public void testPositionManagerSalary(){
        assertEquals(12000, Position.MANAGER.getSalary());
    }

    @Test
    public void testPositionPrgramistaName(){
        assertEquals("Programista", Position.PROGRAMISTA.getName());
    }

    @Test
    public void testPositionProgramistaSalary() {
        assertEquals(8000, Position.PROGRAMISTA.getSalary());
    }

    @Test
    public void testPositionStazystaName(){
        assertEquals("Stażysta", Position.STAZYSTA.getName());
    }

    @Test
    public void testPositionStazystaSalary() {
        assertEquals(3000, Position.STAZYSTA.getSalary());
    }
}
