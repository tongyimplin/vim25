package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.MissingProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingProperty", propOrder = {"path", "fault"})
public class MissingProperty extends DynamicData {
  @XmlElement(required = true)
  protected String path;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault fault;
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
