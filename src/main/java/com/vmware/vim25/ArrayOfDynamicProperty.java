package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDynamicProperty;
import com.vmware.vim25.DynamicProperty;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDynamicProperty", propOrder = {"dynamicProperty"})
public class ArrayOfDynamicProperty {
  @XmlElement(name = "DynamicProperty")
  protected List<DynamicProperty> dynamicProperty;
  
  public List<DynamicProperty> getDynamicProperty() {
    if (this.dynamicProperty == null)
      this.dynamicProperty = new ArrayList<>(); 
    return this.dynamicProperty;
  }
}
