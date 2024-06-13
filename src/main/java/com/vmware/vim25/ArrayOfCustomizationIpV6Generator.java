package com.vmware.vim25;

import com.vmware.vim25.ArrayOfCustomizationIpV6Generator;
import com.vmware.vim25.CustomizationIpV6Generator;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomizationIpV6Generator", propOrder = {"customizationIpV6Generator"})
public class ArrayOfCustomizationIpV6Generator {
  @XmlElement(name = "CustomizationIpV6Generator")
  protected List<CustomizationIpV6Generator> customizationIpV6Generator;
  
  public List<CustomizationIpV6Generator> getCustomizationIpV6Generator() {
    if (this.customizationIpV6Generator == null)
      this.customizationIpV6Generator = new ArrayList<>(); 
    return this.customizationIpV6Generator;
  }
}
