package com.vmware.vim25;

import com.vmware.vim25.ArrayOfResourceConfigSpec;
import com.vmware.vim25.ResourceConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResourceConfigSpec", propOrder = {"resourceConfigSpec"})
public class ArrayOfResourceConfigSpec {
  @XmlElement(name = "ResourceConfigSpec")
  protected List<ResourceConfigSpec> resourceConfigSpec;
  
  public List<ResourceConfigSpec> getResourceConfigSpec() {
    if (this.resourceConfigSpec == null)
      this.resourceConfigSpec = new ArrayList<>(); 
    return this.resourceConfigSpec;
  }
}
