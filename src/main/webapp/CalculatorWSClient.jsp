<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page
        import="com.myeclipseide.ws.*,org.jboss.jaxws.service.*,javax.xml.ws.WebServiceRef,java.net.URL,javax.xml.namespace.QName,javax.xml.ws.Service" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/xml; charset=windows-1252"/>
    <title>Calculator WS Client</title>
</head>
<body>
<%
    URL wsdlLocation = new URL(
            "http://localhost:8080/jboss-jaxws/CalculatorPort?WSDL");
    QName serviceName = new QName("http://ws.myeclipseide.com/",
            "CalculatorService");
    Service service = Service.create(wsdlLocation, serviceName);

    ICalculator port = service.getPort(com.myeclipseide.ws.ICalculator.class);
    // add
    int result = port.add(1, 1);
    out.println(result);

    // multiply
    out.println(port.multiply(10, 10));
%>
</body>
</html>
