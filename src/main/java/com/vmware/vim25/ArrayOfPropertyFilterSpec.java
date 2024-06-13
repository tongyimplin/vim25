package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPropertyFilterSpec;
import com.vmware.vim25.PropertyFilterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropertyFilterSpec", propOrder = {"propertyFilterSpec"})
public class ArrayOfPropertyFilterSpec {
  @XmlElement(name = "PropertyFilterSpec")
  protected List<PropertyFilterSpec> propertyFilterSpec;
  
  public List<PropertyFilterSpec> getPropertyFilterSpec() {
    if (this.propertyFilterSpec == null)
      this.propertyFilterSpec = new ArrayList<>(); 
    return this.propertyFilterSpec;
  }
}
