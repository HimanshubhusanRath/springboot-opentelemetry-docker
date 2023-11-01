#
# Build the images
#

mvn clean package

# Service-a
cd service-a
docker build -t himanshubhusan88/service-a:1.0 .
docker push himanshubhusan88/service-a:1.0

# Service-b
cd ../service-b
docker build -t himanshubhusan88/service-b:1.0 .
docker push himanshubhusan88/service-b:1.0

cd ..