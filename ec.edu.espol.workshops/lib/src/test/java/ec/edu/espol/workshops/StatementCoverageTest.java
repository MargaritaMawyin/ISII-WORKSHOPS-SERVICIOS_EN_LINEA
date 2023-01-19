package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class StatementCoverageTest {

  @Test
  public void s1() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("18\n1\n1\n".getBytes()));
    
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(byteArrayOutputStream);
    PrintStream stdout = System.out;
    System.setOut(ps);

    CarInsurance.main(null);

    System.setIn(stdin);
    System.setOut(stdout);
    
    final var outputText = byteArrayOutputStream.toString();
    final var output = outputText.trim().split("\n");
    final var result = output[output.length-1];
    System.out.println(result);
    assertEquals(result, "300");
  }
  
  @Test
  public void s2() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("5\n1\n0\n".getBytes()));
    
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(byteArrayOutputStream);
    PrintStream stdout = System.out;
    System.setOut(ps);

    CarInsurance.main(null);

    System.setIn(stdin);
    System.setOut(stdout);
    
    final var outputText = byteArrayOutputStream.toString();
    final var output = outputText.trim().split("\n");
    final var result = output[output.length-1];
    System.out.println(result);
    assertEquals(result, "Input only number between 18 and 120");
  }
  
  @Test
  public void s3() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("20\nmale\n0\n".getBytes()));
    
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(byteArrayOutputStream);
    PrintStream stdout = System.out;
    System.setOut(ps);

    CarInsurance.main(null);

    System.setIn(stdin);
    System.setOut(stdout);
    
    final var outputText = byteArrayOutputStream.toString();
    final var output = outputText.trim().split("\n");
    final var result = output[output.length-1];
    System.out.println(result);
    assertEquals(result, "Input only 0 or 1");
  }
  
  @Test
  public void s4() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("25\n1\nsingle\n".getBytes()));
    
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(byteArrayOutputStream);
    PrintStream stdout = System.out;
    System.setOut(ps);

    CarInsurance.main(null);

    System.setIn(stdin);
    System.setOut(stdout);
    
    final var outputText = byteArrayOutputStream.toString();
    final var output = outputText.trim().split("\n");
    final var result = output[output.length-1];
    System.out.println(result);
    assertEquals(result, "Input only 0 or 1");
  }
  
  @Test
  public void s5() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("90\n1\n1\n".getBytes()));
    
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(byteArrayOutputStream);
    PrintStream stdout = System.out;
    System.setOut(ps);

    CarInsurance.main(null);

    System.setIn(stdin);
    System.setOut(stdout);
    
    final var outputText = byteArrayOutputStream.toString();
    final var output = outputText.trim().split("\n");
    final var result = output[output.length-1];
    System.out.println(result);
    assertEquals(result, "-1");
  }
  
}
