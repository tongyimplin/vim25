package com.vmware.vim25;

import com.vmware.vim25.CustomizationSpecItem;
import com.vmware.vim25.XmlToCustomizationSpecItemResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "XmlToCustomizationSpecItemResponse")
public class XmlToCustomizationSpecItemResponse {
  @XmlElement(required = true)
  protected CustomizationSpecItem returnval;
  
  public CustomizationSpecItem getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(CustomizationSpecItem paramCustomizationSpecItem) {
    this.returnval = paramCustomizationSpecItem;
  }
}
