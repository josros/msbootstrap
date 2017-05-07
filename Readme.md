# Microservice bootstrap

The [gradle build file](ms-bootstrap/build.gradle) within the ms-bootstrap folder contains various tasks to be utilized in a microservice context.
At the moment gradle tasks are provided for:

* New microservice project creation based on a template (see: ./ms-template)
* More tasks are coming soon ...

## Executive Summary

### Prerequisites

1. Install gradle

### Execution

#### Microservice creation based on template

1. Open a shell in the ```./ms-bootstrap``` directory
1. Execute ```gradle -Ptld=<used-tld> -Psubdomain=<your-subdomain> -Pscope=<your-scope> -Pproductname=<your-product-name> 
-Pmsname=<your-ms-name> -Ptemplate=<the-template-you-want-to-use> create```

Subsequently it exists a new microservice here: ```./<your-ms-name>```

_Note_: At the moment it exists only one template called: ms-template
_Example_: ```gradle -Ptld=io -Psubdomain=github -Pscope=tutorials -Pproductname=classbooking
           -Pmsname=students -Ptemplate=ms-template create```

The service created will use the following package structure:
@tld@.@subdomain@.@scope@.@productname@.@msname@
