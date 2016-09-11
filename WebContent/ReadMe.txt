axis 1 server client 
Axis 1 is an jax-rpc implemetation provided by Apache

how to create Webservice using Axis1 Amplementation of jax-rpc provided by Apache foundation, without Eclipse
1  create a DWP
2  Create a CalculatorService.java
3  we need a Skeleton( it is a AxisServlet provided by Axis1 impl) which is configured in web.xml, it maps the wsdl service request to a Specific CalculatorService.java
4  Skeleton impl also needs server-config.wsdd config file , which it refers to locate which Specific Service to Call and invoke methods by passing parameters to its arguments
5  we also need java2WSDL.java provided by Axis1 impl, this creates WSDL file so that can be provided to Client
6  As we need WSDL generation Class and Skeleton Class , we need to download Axis1 Jars and add those in lib folder.


Webservices-First Webservice Example Using Axis1 Implementation Using Eclipse Part 1
same as step 1
same as step 2
Eclipse will perform java2WSDL operation  (Eclipse already has Axis1 jars as plugin)
Eclipse will map the Skeleton Configuration and server-confg.wsdd to map the incoming wsdl request(endpoint) to a specific Service Class
here no need to download these Jars as Eclipse comes with Axis1 plugin which has jars included.

http://localhost:8080/soapserviceaxis1/services/CalculatorService?wsdl
