javac *.java
jar cfm EconomySim.jar manifest.txt *.class
pause
del *.class
java -jar EconomySim.jar
pause