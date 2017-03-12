# @msname@

The purpose of @msname@ is ...

## Executive Summary

### Prerequisites

1. Install gradle
1. Install java >= 1.8

### Execution

1. Execute ```gradle clean build```
1. Execute ```java -jar -Dspring.profiles.active=local ./build/@msname@-0.1.0-SNAPSHOT.jar```
1. Open a browser and go to: http://localhost:9999/swagger-ui.html

Don't worry, the application shows exceptions because it expects an eureka running on port 8761. However, it should work anyway.
