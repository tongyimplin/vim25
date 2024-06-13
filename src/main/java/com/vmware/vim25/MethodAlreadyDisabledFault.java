package com.vmware.vim25;

import com.vmware.vim25.MethodAlreadyDisabledFault;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodAlreadyDisabledFault", propOrder = {"sourceId"})
public class MethodAlreadyDisabledFault extends RuntimeFault {
  @XmlElement(required = true)
  protected String sourceId;
  
  public String getSourceId() {
    return this.sourceId;
  }
  
  public void setSourceId(String paramString) {
    this.sourceId = paramString;
  }
}
