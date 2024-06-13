package com.vmware.vim25;

import com.vmware.vim25.RestrictedByAdministrator;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedByAdministrator", propOrder = {"details"})
public class RestrictedByAdministrator extends RuntimeFault {
  @XmlElement(required = true)
  protected String details;
  
  public String getDetails() {
    return this.details;
  }
  
  public void setDetails(String paramString) {
    this.details = paramString;
  }
}
