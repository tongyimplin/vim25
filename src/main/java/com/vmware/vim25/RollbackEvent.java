package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.RollbackEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RollbackEvent", propOrder = {"hostName", "methodName"})
public class RollbackEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String hostName;
  
  protected String methodName;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public String getMethodName() {
    return this.methodName;
  }
  
  public void setMethodName(String paramString) {
    this.methodName = paramString;
  }
}
