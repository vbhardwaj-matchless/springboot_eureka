cd ebay-eureka-server

mvn clean install -DskipTest

java -jar target/ebay-eureka-server-0.0.1-SNAPSHOT.jar

cd ebay-eureka-product-client

mvn clean install -DskipTest
java -jar target/ebay-eureka-product-client-0.0.1-SNAPSHOT.jar


cd ebay-eureka-user-client

mvn clean install -DskipTest
java -jar target/ebay-eureka-user-client-0.0.1-SNAPSHOT.jar


Access Services:

http://localhost:8761/