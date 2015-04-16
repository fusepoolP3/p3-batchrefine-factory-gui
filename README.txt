
A GUI to configure a batchrefine-transfomer.

Compile with

    mvn install


and start with

    cd target
    java -jar p3-batchrefine-transformer-factory-gui-*-jar-with-dependencies.jar


Now you should be able to access the service at:

    http://localhost:8203/?transformerBase=http://hetzy1.spaziodati.eu:7100/&transformerRegistry=http://sandbox.fusepool.info:8181/ldp/tr-ldpc#
