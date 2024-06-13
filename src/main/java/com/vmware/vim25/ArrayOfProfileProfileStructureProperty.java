package com.vmware.vim25;

import com.vmware.vim25.ArrayOfProfileProfileStructureProperty;
import com.vmware.vim25.ProfileProfileStructureProperty;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfileProfileStructureProperty", propOrder = {"profileProfileStructureProperty"})
public class ArrayOfProfileProfileStructureProperty {
  @XmlElement(name = "ProfileProfileStructureProperty")
  protected List<ProfileProfileStructureProperty> profileProfileStructureProperty;
  
  public List<ProfileProfileStructureProperty> getProfileProfileStructureProperty() {
    if (this.profileProfileStructureProperty == null)
      this.profileProfileStructureProperty = new ArrayList<>(); 
    return this.profileProfileStructureProperty;
  }
}
