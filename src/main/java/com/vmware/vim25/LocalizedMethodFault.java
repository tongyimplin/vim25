package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.MethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizedMethodFault", propOrder = {"fault", "localizedMessage"})
public class LocalizedMethodFault extends DynamicData {
  @XmlElement(required = true)
  protected MethodFault fault;
  
  protected String localizedMessage;
  
  public MethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(MethodFault paramMethodFault) {
    this.fault = paramMethodFault;
  }
  
  public String getLocalizedMessage() {
    return this.localizedMessage;
  }
  
  public void setLocalizedMessage(String paramString) {
    this.localizedMessage = paramString;
  }
}
