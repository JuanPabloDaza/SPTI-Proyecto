FROM openjdk:17

WORKDIR /usrapp/bin

ENV PORT 42000

COPY keystore/ecikeystore.p12 keystore/
COPY keystore/myTrustStore keystore/
COPY /target/classes /usrapp/bin/classes
COPY /target/dependency /usrapp/bin/dependency

CMD ["java","-cp","./classes:./dependency/*","edu.eci.arep.app.Collatz"]