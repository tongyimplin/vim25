package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.NetworkRollbackEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkRollbackEvent", propOrder = {"methodName", "transactionId"})
public class NetworkRollbackEvent extends Event {
  @XmlElement(required = true)
  protected String methodName;
  
  @XmlElement(required = true)
  protected String transactionId;
  
  public String getMethodName() {
    return this.methodName;
  }
  
  public void setMethodName(String paramString) {
    this.methodName = paramString;
  }
  
  public String getTransactionId() {
    return this.transactionId;
  }
  
  public void setTransactionId(String paramString) {
    this.transactionId = paramString;
  }
}
