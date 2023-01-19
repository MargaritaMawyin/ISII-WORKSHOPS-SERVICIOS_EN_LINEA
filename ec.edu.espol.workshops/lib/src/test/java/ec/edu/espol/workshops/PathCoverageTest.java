package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class PathCoverageTest {
  @Test
  public void p1() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("60\n1\n1\n".getBytes()));
    
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
    assertEquals(result, "200");
  }
  
  @Test
  public void p2() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("18\n1\n0\n".getBytes()));
    
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
  public void p3() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("18\n0\n1\n".getBytes()));
    
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
  public void p4() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("20\n1\n1\n".getBytes()));
    
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
  public void p5() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("21\n0\n1\n".getBytes()));
    
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
  public void p6() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("50\n1\n0\n".getBytes()));
    
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
    assertEquals(result, "200");
  }
  
  @Test
  public void p7() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("21\n1\n1\n".getBytes()));
    
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
  public void p8() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("21\n0\n0\n".getBytes()));
    
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
  
  @Test
  public void p9() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("70\n1\n0\n".getBytes()));
    
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
  public void p10() {
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
  public void p11() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("15\n1\n1\n".getBytes()));
    
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
  public void p12() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("20\n1\n0\n".getBytes()));
    
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
  public void p13() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("24\n0\n1\n".getBytes()));
    
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
  public void p14() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("46\n0\n0\n".getBytes()));
    
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
    assertEquals(result, "400");
  }
  
  @Test
  public void p15() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("46\n1\n1\n".getBytes()));
    
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
    assertEquals(result, "200");
  }
  
  @Test
  public void p16() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("66\n1\n0\n".getBytes()));
    
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
  public void p17() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("66\n0\n0\n".getBytes()));
    
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
    assertEquals(result, "500");
  }
  
  @Test
  public void p18() {
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
  public void p19() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\n0\n-1\n".getBytes()));
    
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
  public void p20() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("20\n5\n1\n".getBytes()));
    
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
  public void p21() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("130\n0\n0\n".getBytes()));
    
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
  public void p22() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("twelve\n1\n1\n".getBytes()));
    
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
  public void p23() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("1\n1\n1\n".getBytes()));
    
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
  public void p24() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("130\n1\n0\n".getBytes()));
    
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
  public void p25() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\n2\n0\n".getBytes()));
    
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
  public void p26() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\n1\ntwo\n".getBytes()));
    
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
  public void p27() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("-10\n1\n1\n".getBytes()));
    
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
  public void p28() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("45\n1\n0\n".getBytes()));
    
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
    assertEquals(result, "200");
  }
  
  @Test
  public void p29() {
    CarInsurance prima = new CarInsurance();
    System.out.println(prima);
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("-1\n0\n5\n".getBytes()));
    
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
  public void p30() {
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream("22\nvalue\n1\n".getBytes()));
    
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
}