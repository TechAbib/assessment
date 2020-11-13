#!/bin/sh
myfile="PokerSimulation"

##directory where jar file is located    
dir=.

##compile java code
javac $myfile.java  > /dev/null

##build jar file and run program
jar -cvmf META-INF/MANIFEST.MF $myfile.jar $myfile.class  > /dev/null 2>&1 && java -cp $myfile.jar $myfile






