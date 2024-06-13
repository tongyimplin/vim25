package com.vmware.vim25;

import com.vmware.vim25.ArrayOfMissingProperty;
import com.vmware.vim25.MissingProperty;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMissingProperty", propOrder = {"missingProperty"})
public class ArrayOfMissingProperty {
  @XmlElement(name = "MissingProperty")
  protected List<MissingProperty> missingProperty;
  
  public List<MissingProperty> getMissingProperty() {
    if (this.missingProperty == null)
      this.missingProperty = new ArrayList<>(); 
    return this.missingProperty;
  }
}
