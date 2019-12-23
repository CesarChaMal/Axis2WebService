/**
 * HelloServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.example.client;


/*
 *  HelloServiceTest Junit test case
 */
public class HelloServiceTest extends junit.framework.TestCase {
    /**
     * Auto generated test method
     */
    public void testadd() throws java.lang.Exception {
        com.example.client.HelloServiceStub stub = new com.example.client.HelloServiceStub(); //the default implementation should point to the right endpoint

        org.apache.ws.axis2.Add add4 = (org.apache.ws.axis2.Add) getTestObject(org.apache.ws.axis2.Add.class);
        // TODO : Fill in the add4 here
        assertNotNull(stub.add(add4));
    }

    /**
     * Auto generated test method
     */
    public void testStartadd() throws java.lang.Exception {
        com.example.client.HelloServiceStub stub = new com.example.client.HelloServiceStub();
        org.apache.ws.axis2.Add add4 = (org.apache.ws.axis2.Add) getTestObject(org.apache.ws.axis2.Add.class);
        // TODO : Fill in the add4 here
        stub.startadd(add4, new tempCallbackN1000C());
    }

    //Create an object and provide it as the test object
    public Object getTestObject(java.lang.Class type)
        throws java.lang.Exception {
        return type.newInstance();
    }

    private class tempCallbackN1000C extends com.example.client.HelloServiceCallbackHandler {
        public tempCallbackN1000C() {
            super(null);
        }

        public void receiveResultadd(org.apache.ws.axis2.AddResponse result) {
        }

        public void receiveErroradd(java.lang.Exception e) {
            fail();
        }
    }
}
