package com.vmware.vim25;

import com.vmware.vim25.ArrayOfElementDescription;
import com.vmware.vim25.ElementDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfElementDescription", propOrder = {"elementDescription"})
public class ArrayOfElementDescription {
  @XmlElement(name = "ElementDescription")
  protected List<ElementDescription> elementDescription;
  
  public List<ElementDescription> getElementDescription() {
    if (this.elementDescription == null)
      this.elementDescription = new ArrayList<>(); 
    return this.elementDescription;
  }
}
