package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCustomizationAdapterMapping;
import com.vmware.vim25.CustomizationAdapterMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomizationAdapterMapping", propOrder = {"customizationAdapterMapping"})
public class ArrayOfCustomizationAdapterMapping {
  @XmlElement(name = "CustomizationAdapterMapping")
  protected List<CustomizationAdapterMapping> customizationAdapterMapping;
  
  public List<CustomizationAdapterMapping> getCustomizationAdapterMapping() {
    if (this.customizationAdapterMapping == null)
      this.customizationAdapterMapping = new ArrayList<>(); 
    return this.customizationAdapterMapping;
  }
}
