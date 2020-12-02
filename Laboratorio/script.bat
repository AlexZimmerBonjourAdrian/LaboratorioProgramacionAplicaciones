@echo off
COLOR 0E
mode con cols=50 lines=20

echo HOLAAAAAAAAA
cd Laboratorio\Jar
call mvn package -PotherOutputDir
cd ..\..\Archivos
RD /S /Q archive-tmp
RD /S /Q classes
RD /S /Q generated-sources
RD /S /Q maven-archiver
RD /S /Q maven-status
DEL /Q Jar-1.0.jar
PAUSE