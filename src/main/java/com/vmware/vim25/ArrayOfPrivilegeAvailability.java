package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPrivilegeAvailability;
import com.vmware.vim25.PrivilegeAvailability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrivilegeAvailability", propOrder = {"privilegeAvailability"})
public class ArrayOfPrivilegeAvailability {
  @XmlElement(name = "PrivilegeAvailability")
  protected List<PrivilegeAvailability> privilegeAvailability;
  
  public List<PrivilegeAvailability> getPrivilegeAvailability() {
    if (this.privilegeAvailability == null)
      this.privilegeAvailability = new ArrayList<>(); 
    return this.privilegeAvailability;
  }
}
