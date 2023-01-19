package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class BranchCoverageTest {
  @Test
  public void b1() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\n1\n1\n".getBytes()));
    
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
  public void b2() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("ten\n1\n0\n".getBytes()));
    
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
  public void b3() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\none\n0\n".getBytes()));
    
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
  public void b4() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\n1\none\n".getBytes()));
    
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
  public void b5() {
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
  public void b6() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\n-1\n0\n".getBytes()));
    
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
  public void b7() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\n1\n-1\n".getBytes()));
    
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
  public void b8() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("132\n1\n1\n".getBytes()));
    
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
  public void b9() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\n0\n0\n".getBytes()));
    
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
    assertEquals(result, "2000");
  }
}
