package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TacitKnowledgePrinterTest {
    private Printer printer;
    private TacitKnowledgePrinter tacitKnowledgePrinter;

    @Before
    public void setUP() {
        printer = mock(Printer.class);
        tacitKnowledgePrinter = new TacitKnowledgePrinter(printer);
    }

    @Test
    public void testPrintNumbersTimes10() {
        tacitKnowledgePrinter.printNumbers(10);
        verify(printer, times(10)).print(anyString());
    }

    @Test(expected = Exception.class)
    public void testPrintNumbersLimitZero() {
        tacitKnowledgePrinter.printNumbers(0);
    }

    @Test
    public void testVerificarThree() {
        assertEquals(tacitKnowledgePrinter.calculate(9), "Tacit");
    }

    @Test
    public void testVerificarFive() {
        assertEquals(tacitKnowledgePrinter.calculate(10), "Knowledge");
    }

    @Test
    public void testVerificarThreeFive() {
        assertEquals(tacitKnowledgePrinter.calculate(15), "TacitKnowledge");
    }

    @Test
    public void testVerificarOtro() {
        assertEquals(tacitKnowledgePrinter.calculate(2), "2");
    }

}
