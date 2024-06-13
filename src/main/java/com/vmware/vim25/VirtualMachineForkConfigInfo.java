package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineForkConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineForkConfigInfo", propOrder = {"parentEnabled", "childForkGroupId", "parentForkGroupId", "childType"})
public class VirtualMachineForkConfigInfo extends DynamicData {
  protected Boolean parentEnabled;
  
  protected String childForkGroupId;
  
  protected String parentForkGroupId;
  
  protected String childType;
  
  public Boolean isParentEnabled() {
    return this.parentEnabled;
  }
  
  public void setParentEnabled(Boolean paramBoolean) {
    this.parentEnabled = paramBoolean;
  }
  
  public String getChildForkGroupId() {
    return this.childForkGroupId;
  }
  
  public void setChildForkGroupId(String paramString) {
    this.childForkGroupId = paramString;
  }
  
  public String getParentForkGroupId() {
    return this.parentForkGroupId;
  }
  
  public void setParentForkGroupId(String paramString) {
    this.parentForkGroupId = paramString;
  }
  
  public String getChildType() {
    return this.childType;
  }
  
  public void setChildType(String paramString) {
    this.childType = paramString;
  }
}
