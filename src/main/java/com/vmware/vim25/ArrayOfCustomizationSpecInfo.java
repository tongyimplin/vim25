package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCustomizationSpecInfo;
import com.vmware.vim25.CustomizationSpecInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomizationSpecInfo", propOrder = {"customizationSpecInfo"})
public class ArrayOfCustomizationSpecInfo {
  @XmlElement(name = "CustomizationSpecInfo")
  protected List<CustomizationSpecInfo> customizationSpecInfo;
  
  public List<CustomizationSpecInfo> getCustomizationSpecInfo() {
    if (this.customizationSpecInfo == null)
      this.customizationSpecInfo = new ArrayList<>(); 
    return this.customizationSpecInfo;
  }
}
