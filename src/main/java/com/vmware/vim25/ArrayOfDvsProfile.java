package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsProfile;
import com.vmware.vim25.DvsProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsProfile", propOrder = {"dvsProfile"})
public class ArrayOfDvsProfile {
  @XmlElement(name = "DvsProfile")
  protected List<DvsProfile> dvsProfile;
  
  public List<DvsProfile> getDvsProfile() {
    if (this.dvsProfile == null)
      this.dvsProfile = new ArrayList<>(); 
    return this.dvsProfile;
  }
}
