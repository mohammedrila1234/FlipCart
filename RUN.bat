@echo off
set PROJECT_DIR="/FlipkartTaskRila"
set TESTNG_XML="/FlipkartTaskRila/testng.xml"

cd %PROJECT_DIR%
echo Running TestNG...
java -cp ".;lib\*;bin" org.testng.TestNG %TESTNG_XML%
