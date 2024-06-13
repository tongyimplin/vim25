package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PrivilegeAvailability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivilegeAvailability", propOrder = {"privId", "isGranted"})
public class PrivilegeAvailability extends DynamicData {
  @XmlElement(required = true)
  protected String privId;
  
  protected boolean isGranted;
  
  public String getPrivId() {
    return this.privId;
  }
  
  public void setPrivId(String paramString) {
    this.privId = paramString;
  }
  
  public boolean isIsGranted() {
    return this.isGranted;
  }
  
  public void setIsGranted(boolean paramBoolean) {
    this.isGranted = paramBoolean;
  }
}
