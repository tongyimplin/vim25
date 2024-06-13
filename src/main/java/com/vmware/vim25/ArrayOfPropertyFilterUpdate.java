package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPropertyFilterUpdate;
import com.vmware.vim25.PropertyFilterUpdate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropertyFilterUpdate", propOrder = {"propertyFilterUpdate"})
public class ArrayOfPropertyFilterUpdate {
  @XmlElement(name = "PropertyFilterUpdate")
  protected List<PropertyFilterUpdate> propertyFilterUpdate;
  
  public List<PropertyFilterUpdate> getPropertyFilterUpdate() {
    if (this.propertyFilterUpdate == null)
      this.propertyFilterUpdate = new ArrayList<>(); 
    return this.propertyFilterUpdate;
  }
}
