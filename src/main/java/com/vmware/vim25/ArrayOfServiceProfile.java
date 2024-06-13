package com.vmware.vim25;

import com.vmware.vim25.ArrayOfServiceProfile;
import com.vmware.vim25.ServiceProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceProfile", propOrder = {"serviceProfile"})
public class ArrayOfServiceProfile {
  @XmlElement(name = "ServiceProfile")
  protected List<ServiceProfile> serviceProfile;
  
  public List<ServiceProfile> getServiceProfile() {
    if (this.serviceProfile == null)
      this.serviceProfile = new ArrayList<>(); 
    return this.serviceProfile;
  }
}
