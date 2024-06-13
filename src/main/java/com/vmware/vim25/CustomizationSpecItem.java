package com.vmware.vim25;

import com.vmware.vim25.CustomizationSpec;
import com.vmware.vim25.CustomizationSpecInfo;
import com.vmware.vim25.CustomizationSpecItem;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationSpecItem", propOrder = {"info", "spec"})
public class CustomizationSpecItem extends DynamicData {
  @XmlElement(required = true)
  protected CustomizationSpecInfo info;
  
  @XmlElement(required = true)
  protected CustomizationSpec spec;
  
  public CustomizationSpecInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(CustomizationSpecInfo paramCustomizationSpecInfo) {
    this.info = paramCustomizationSpecInfo;
  }
  
  public CustomizationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(CustomizationSpec paramCustomizationSpec) {
    this.spec = paramCustomizationSpec;
  }
}
