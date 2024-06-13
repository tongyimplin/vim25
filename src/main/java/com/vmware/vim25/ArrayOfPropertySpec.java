package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPropertySpec;
import com.vmware.vim25.PropertySpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropertySpec", propOrder = {"propertySpec"})
public class ArrayOfPropertySpec {
  @XmlElement(name = "PropertySpec")
  protected List<PropertySpec> propertySpec;
  
  public List<PropertySpec> getPropertySpec() {
    if (this.propertySpec == null)
      this.propertySpec = new ArrayList<>(); 
    return this.propertySpec;
  }
}
