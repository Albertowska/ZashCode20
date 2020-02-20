package com.google.zashcode.processors;

import com.google.zashcode.DataOutput;
import com.google.zashcode.model.Library;
import com.google.zashcode.model.SignupProcess;

public class Processor implements MagicProcessor {


    @Override
    public void process(SignupProcess process) throws InterruptedException {
        for (Library library : process.getLibraryList()) {
            library.setBooksToProcess(library.getBookList());
        }
        process.setLibrariesToProcess(process.getLibraryList());
        generateResult(process);
    }


    private void generateResult(SignupProcess process){
        DataOutput.write("result_"+process.getFilename(),process.getLibrariesToProcess());
    }
}
