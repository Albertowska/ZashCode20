package com.google.zashcode;

import com.google.zashcode.model.SignupProcess;
import com.google.zashcode.processors.MagicProcessor;
import com.google.zashcode.processors.Processor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) throws IOException, InterruptedException {

    System.out.println("Wer are Acquisition Hackers!!!");

    System.out.println("Processing a_example");

    List<String> filesToProcess = new ArrayList<>();
    filesToProcess.add("a_example.txt");
    filesToProcess.add("b_read_on.txt");
    filesToProcess.add("c_incunabula.txt");
    filesToProcess.add("d_tough_choices.txt");
    filesToProcess.add("e_so_many_books.txt");
    filesToProcess.add("f_libraries_of_the_world.txt");

   for(String file: filesToProcess){
     System.out.println(file);
     SignupProcess process = new DataLoader(file).getProcess();
     new Processor().process(process);

   }



  }

}
