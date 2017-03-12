# Microservice bootstrap

The [gradle build file](ms-bootstrap/build.gradle) within the ms-bootstrap folder contains various tasks to be utilized in a microservice context.
At the moment gradle tasks are provided for:

* New microservice project creation based on a template (see: /ms-template)
* More tasks are coming soon ...

## Executive Summary

### Prerequisites

1. Install gradle

### Execution

#### Microservice creation based on template

1. Open a shell in the ```./ms-bootstrap``` directory
1. Execute ```gradle -Pmsname=<your-ms-name> -Pproductname=<your-product-name> create```

Subsequently it exists a new microservice here: ```./<your-ms-name>```
