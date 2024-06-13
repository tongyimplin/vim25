package com.vmware.vim25;

import com.vmware.vim25.ArrayOfTypeDescription;
import com.vmware.vim25.TypeDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTypeDescription", propOrder = {"typeDescription"})
public class ArrayOfTypeDescription {
  @XmlElement(name = "TypeDescription")
  protected List<TypeDescription> typeDescription;
  
  public List<TypeDescription> getTypeDescription() {
    if (this.typeDescription == null)
      this.typeDescription = new ArrayList<>(); 
    return this.typeDescription;
  }
}
