package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ExtensionPrivilegeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionPrivilegeInfo", propOrder = {"privID", "privGroupName"})
public class ExtensionPrivilegeInfo extends DynamicData {
  @XmlElement(required = true)
  protected String privID;
  
  @XmlElement(required = true)
  protected String privGroupName;
  
  public String getPrivID() {
    return this.privID;
  }
  
  public void setPrivID(String paramString) {
    this.privID = paramString;
  }
  
  public String getPrivGroupName() {
    return this.privGroupName;
  }
  
  public void setPrivGroupName(String paramString) {
    this.privGroupName = paramString;
  }
}
