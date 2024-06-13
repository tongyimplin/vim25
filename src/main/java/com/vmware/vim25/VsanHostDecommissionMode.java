package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostDecommissionMode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDecommissionMode", propOrder = {"objectAction"})
public class VsanHostDecommissionMode extends DynamicData {
  @XmlElement(required = true)
  protected String objectAction;
  
  public String getObjectAction() {
    return this.objectAction;
  }
  
  public void setObjectAction(String paramString) {
    this.objectAction = paramString;
  }
}
