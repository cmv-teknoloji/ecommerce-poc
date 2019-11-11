/**
 * ShippingCancelDetailVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingCancelDetailVO  implements java.io.Serializable {
    private java.lang.String cargoKey;

    private long docId;

    private java.lang.Integer errCode;

    private java.lang.String errMessage;

    private java.lang.String invoiceKey;

    private long jobId;

    private java.lang.Integer operationCode;

    private java.lang.String operationMessage;

    private java.lang.String operationStatus;

    public ShippingCancelDetailVO() {
    }

    public ShippingCancelDetailVO(
           java.lang.String cargoKey,
           long docId,
           java.lang.Integer errCode,
           java.lang.String errMessage,
           java.lang.String invoiceKey,
           long jobId,
           java.lang.Integer operationCode,
           java.lang.String operationMessage,
           java.lang.String operationStatus) {
           this.cargoKey = cargoKey;
           this.docId = docId;
           this.errCode = errCode;
           this.errMessage = errMessage;
           this.invoiceKey = invoiceKey;
           this.jobId = jobId;
           this.operationCode = operationCode;
           this.operationMessage = operationMessage;
           this.operationStatus = operationStatus;
    }


    /**
     * Gets the cargoKey value for this ShippingCancelDetailVO.
     * 
     * @return cargoKey
     */
    public java.lang.String getCargoKey() {
        return cargoKey;
    }


    /**
     * Sets the cargoKey value for this ShippingCancelDetailVO.
     * 
     * @param cargoKey
     */
    public void setCargoKey(java.lang.String cargoKey) {
        this.cargoKey = cargoKey;
    }


    /**
     * Gets the docId value for this ShippingCancelDetailVO.
     * 
     * @return docId
     */
    public long getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this ShippingCancelDetailVO.
     * 
     * @param docId
     */
    public void setDocId(long docId) {
        this.docId = docId;
    }


    /**
     * Gets the errCode value for this ShippingCancelDetailVO.
     * 
     * @return errCode
     */
    public java.lang.Integer getErrCode() {
        return errCode;
    }


    /**
     * Sets the errCode value for this ShippingCancelDetailVO.
     * 
     * @param errCode
     */
    public void setErrCode(java.lang.Integer errCode) {
        this.errCode = errCode;
    }


    /**
     * Gets the errMessage value for this ShippingCancelDetailVO.
     * 
     * @return errMessage
     */
    public java.lang.String getErrMessage() {
        return errMessage;
    }


    /**
     * Sets the errMessage value for this ShippingCancelDetailVO.
     * 
     * @param errMessage
     */
    public void setErrMessage(java.lang.String errMessage) {
        this.errMessage = errMessage;
    }


    /**
     * Gets the invoiceKey value for this ShippingCancelDetailVO.
     * 
     * @return invoiceKey
     */
    public java.lang.String getInvoiceKey() {
        return invoiceKey;
    }


    /**
     * Sets the invoiceKey value for this ShippingCancelDetailVO.
     * 
     * @param invoiceKey
     */
    public void setInvoiceKey(java.lang.String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }


    /**
     * Gets the jobId value for this ShippingCancelDetailVO.
     * 
     * @return jobId
     */
    public long getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this ShippingCancelDetailVO.
     * 
     * @param jobId
     */
    public void setJobId(long jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the operationCode value for this ShippingCancelDetailVO.
     * 
     * @return operationCode
     */
    public java.lang.Integer getOperationCode() {
        return operationCode;
    }


    /**
     * Sets the operationCode value for this ShippingCancelDetailVO.
     * 
     * @param operationCode
     */
    public void setOperationCode(java.lang.Integer operationCode) {
        this.operationCode = operationCode;
    }


    /**
     * Gets the operationMessage value for this ShippingCancelDetailVO.
     * 
     * @return operationMessage
     */
    public java.lang.String getOperationMessage() {
        return operationMessage;
    }


    /**
     * Sets the operationMessage value for this ShippingCancelDetailVO.
     * 
     * @param operationMessage
     */
    public void setOperationMessage(java.lang.String operationMessage) {
        this.operationMessage = operationMessage;
    }


    /**
     * Gets the operationStatus value for this ShippingCancelDetailVO.
     * 
     * @return operationStatus
     */
    public java.lang.String getOperationStatus() {
        return operationStatus;
    }


    /**
     * Sets the operationStatus value for this ShippingCancelDetailVO.
     * 
     * @param operationStatus
     */
    public void setOperationStatus(java.lang.String operationStatus) {
        this.operationStatus = operationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingCancelDetailVO)) return false;
        ShippingCancelDetailVO other = (ShippingCancelDetailVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cargoKey==null && other.getCargoKey()==null) || 
             (this.cargoKey!=null &&
              this.cargoKey.equals(other.getCargoKey()))) &&
            this.docId == other.getDocId() &&
            ((this.errCode==null && other.getErrCode()==null) || 
             (this.errCode!=null &&
              this.errCode.equals(other.getErrCode()))) &&
            ((this.errMessage==null && other.getErrMessage()==null) || 
             (this.errMessage!=null &&
              this.errMessage.equals(other.getErrMessage()))) &&
            ((this.invoiceKey==null && other.getInvoiceKey()==null) || 
             (this.invoiceKey!=null &&
              this.invoiceKey.equals(other.getInvoiceKey()))) &&
            this.jobId == other.getJobId() &&
            ((this.operationCode==null && other.getOperationCode()==null) || 
             (this.operationCode!=null &&
              this.operationCode.equals(other.getOperationCode()))) &&
            ((this.operationMessage==null && other.getOperationMessage()==null) || 
             (this.operationMessage!=null &&
              this.operationMessage.equals(other.getOperationMessage()))) &&
            ((this.operationStatus==null && other.getOperationStatus()==null) || 
             (this.operationStatus!=null &&
              this.operationStatus.equals(other.getOperationStatus())));
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
        if (getCargoKey() != null) {
            _hashCode += getCargoKey().hashCode();
        }
        _hashCode += new Long(getDocId()).hashCode();
        if (getErrCode() != null) {
            _hashCode += getErrCode().hashCode();
        }
        if (getErrMessage() != null) {
            _hashCode += getErrMessage().hashCode();
        }
        if (getInvoiceKey() != null) {
            _hashCode += getInvoiceKey().hashCode();
        }
        _hashCode += new Long(getJobId()).hashCode();
        if (getOperationCode() != null) {
            _hashCode += getOperationCode().hashCode();
        }
        if (getOperationMessage() != null) {
            _hashCode += getOperationMessage().hashCode();
        }
        if (getOperationStatus() != null) {
            _hashCode += getOperationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingCancelDetailVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "shippingCancelDetailVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationStatus"));
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
