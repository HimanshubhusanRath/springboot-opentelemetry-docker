# Spring Boot with Open Telemetry using OTEL collector, Jaeger, Prometheus and Grafana (in Docker)


## Architecture Diagram
<<<<< TODO >>>>>

## Steps to run this project:
* Requirements: JDK-17
* `./build.sh` - Build the Spring boot applications, create and push the docker images to repository.
* `docker-compose up` - Create the below instances
  * Spring boot applications (service-a & service-b)
  * OTEL collector
  * Jaeger
  * Prometheus
  * Grafana
* Once the services are up, access the service-a:
  * `http://localhost:9094/getRemoteMessage` - Service-a's endpoint which internally connects to Service-b to get data.
  * `http://localhost:9095/getMessage` - Service-b's endpoint to get data.
  * `http://localhost:9090` - Prometheus application to check the metrices
  * `http://localhost:16686/` - Jaeger UI to see the traces for Service-a and Service-b.
  * `http://localhost:3000` - Grafana application to see the metrics graph

### Points to note:
* Prometheus:
  * No need of scrapping jobs for Prometheus as we are using OTLP exporter to send the metrics to Prometheus. 
  * So, Prometheus doesn't need to pull the same data as we are already pushing that.
* Spring Boot applications:
  * No dependency for open-telemetry is needed for Spring boot applications as we are relying on the auto-configurations and not using any manual configuration. 
  * Only the OTEL Collector endpoint is configured.
  * The open-telemetry javaagent will take care of collecting and exporting the open telemetry data to OTEL collector.


#### References:
* https://github.com/open-telemetry/opentelemetry-demo
* https://github.com/cyrille-leclerc/my-shopping-cart/tree/dependabot/npm_and_yarn/frontend-java/src/main/js/async-2.6.4