MasterNode is a project for administering databases containing protein molecules from the rcsb pdb website.

It contains of three modules: MasterNode-main, MasterNode-yoink and MasterNode-Clustering.

1) MasterNode-main
MasterNode-main is used to translate pdbml (or pdbxml) files into java objects and store these inside a neo4j
graph database. The database id of the objects will the be transmitted to SlaveNodes via a jms queuing system.
The SlaveNodes will then read the objects from the database and perform a specific task with them (i.e. clustering).
By default the program is looking for pdbml files in ./src/main/resources/org. Put your files inside this folder or
specify your working folder in the commandline (i.e java -jar MasterNode.jar --pdb.file.location=file:/your/path/*.xml).

2) MasterNode-yoink
MasterNode-yoink is a back-up module containing classes for database handling for the yoink project from wallerlab.

3) MasterNode-Clustering
MasterNode-Clustering is a project that uses the phenix.python environment to execute run_finalise.py and
run_clustering.py from qr-core project on protein structures form the rcsb pdb.

