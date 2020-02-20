package com.google.zashcode.processors;

import com.google.zashcode.model.SignupProcess;

public interface MagicProcessor {

  void process(SignupProcess process) throws InterruptedException;
}
