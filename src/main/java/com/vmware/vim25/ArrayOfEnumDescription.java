package com.vmware.vim25;

import com.vmware.vim25.ArrayOfEnumDescription;
import com.vmware.vim25.EnumDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEnumDescription", propOrder = {"enumDescription"})
public class ArrayOfEnumDescription {
  @XmlElement(name = "EnumDescription")
  protected List<EnumDescription> enumDescription;
  
  public List<EnumDescription> getEnumDescription() {
    if (this.enumDescription == null)
      this.enumDescription = new ArrayList<>(); 
    return this.enumDescription;
  }
}
