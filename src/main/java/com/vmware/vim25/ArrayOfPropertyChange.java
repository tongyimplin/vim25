package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPropertyChange;
import com.vmware.vim25.PropertyChange;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPropertyChange", propOrder = {"propertyChange"})
public class ArrayOfPropertyChange {
  @XmlElement(name = "PropertyChange")
  protected List<PropertyChange> propertyChange;
  
  public List<PropertyChange> getPropertyChange() {
    if (this.propertyChange == null)
      this.propertyChange = new ArrayList<>(); 
    return this.propertyChange;
  }
}
