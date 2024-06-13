package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.HostPathSelectionPolicyOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPathSelectionPolicyOption", propOrder = {"policy"})
public class HostPathSelectionPolicyOption extends DynamicData {
  @XmlElement(required = true)
  protected ElementDescription policy;
  
  public ElementDescription getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(ElementDescription paramElementDescription) {
    this.policy = paramElementDescription;
  }
}
