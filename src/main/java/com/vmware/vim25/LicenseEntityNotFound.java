package com.vmware.vim25;

import com.vmware.vim25.LicenseEntityNotFound;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseEntityNotFound", propOrder = {"entityId"})
public class LicenseEntityNotFound extends VimFault {
  @XmlElement(required = true)
  protected String entityId;
  
  public String getEntityId() {
    return this.entityId;
  }
  
  public void setEntityId(String paramString) {
    this.entityId = paramString;
  }
}
