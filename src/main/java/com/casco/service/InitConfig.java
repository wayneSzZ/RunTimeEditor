package com.casco.service;

public interface InitConfig {
   public String readPath();
   void readConfig();

   void readGpc(String filename);
   void readEinty(String filename);
   void readTg(String filename);
   void readEntry(String filename);
   void readRuntime(String filename);

}
