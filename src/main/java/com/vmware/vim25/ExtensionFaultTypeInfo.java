package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionFaultTypeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionFaultTypeInfo", propOrder = {"faultID"})
public class ExtensionFaultTypeInfo extends DynamicData {
  @XmlElement(required = true)
  protected String faultID;
  
  public String getFaultID() {
    return this.faultID;
  }
  
  public void setFaultID(String paramString) {
    this.faultID = paramString;
  }
}
