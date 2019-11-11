/**
 * BaseResultVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class BaseResultVO  implements java.io.Serializable {
    private java.lang.String outFlag;

    private java.lang.String outResult;

    public BaseResultVO() {
    }

    public BaseResultVO(
           java.lang.String outFlag,
           java.lang.String outResult) {
           this.outFlag = outFlag;
           this.outResult = outResult;
    }


    /**
     * Gets the outFlag value for this BaseResultVO.
     * 
     * @return outFlag
     */
    public java.lang.String getOutFlag() {
        return outFlag;
    }


    /**
     * Sets the outFlag value for this BaseResultVO.
     * 
     * @param outFlag
     */
    public void setOutFlag(java.lang.String outFlag) {
        this.outFlag = outFlag;
    }


    /**
     * Gets the outResult value for this BaseResultVO.
     * 
     * @return outResult
     */
    public java.lang.String getOutResult() {
        return outResult;
    }


    /**
     * Sets the outResult value for this BaseResultVO.
     * 
     * @param outResult
     */
    public void setOutResult(java.lang.String outResult) {
        this.outResult = outResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseResultVO)) return false;
        BaseResultVO other = (BaseResultVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outFlag==null && other.getOutFlag()==null) || 
             (this.outFlag!=null &&
              this.outFlag.equals(other.getOutFlag()))) &&
            ((this.outResult==null && other.getOutResult()==null) || 
             (this.outResult!=null &&
              this.outResult.equals(other.getOutResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOutFlag() != null) {
            _hashCode += getOutFlag().hashCode();
        }
        if (getOutResult() != null) {
            _hashCode += getOutResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseResultVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "baseResultVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
