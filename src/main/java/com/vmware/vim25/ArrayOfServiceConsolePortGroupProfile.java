package com.vmware.vim25;

import com.vmware.vim25.ArrayOfServiceConsolePortGroupProfile;
import com.vmware.vim25.ServiceConsolePortGroupProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServiceConsolePortGroupProfile", propOrder = {"serviceConsolePortGroupProfile"})
public class ArrayOfServiceConsolePortGroupProfile {
  @XmlElement(name = "ServiceConsolePortGroupProfile")
  protected List<ServiceConsolePortGroupProfile> serviceConsolePortGroupProfile;
  
  public List<ServiceConsolePortGroupProfile> getServiceConsolePortGroupProfile() {
    if (this.serviceConsolePortGroupProfile == null)
      this.serviceConsolePortGroupProfile = new ArrayList<>(); 
    return this.serviceConsolePortGroupProfile;
  }
}
