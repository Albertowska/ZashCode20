package com.google.zashcode;

import com.google.zashcode.model.SignupProcess;

import java.io.IOException;
import java.util.List;

public class Application {

  public static void main(String[] args) throws IOException, InterruptedException {

    System.out.println("Wer are Acquisition Hackers!!!");

    SignupProcess process = new DataLoader("a_example.txt").getProcess();

  }

}
