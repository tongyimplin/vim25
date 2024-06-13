package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostStorageArrayTypePolicyOption;
import com.vmware.vim25.HostStorageArrayTypePolicyOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostStorageArrayTypePolicyOption", propOrder = {"hostStorageArrayTypePolicyOption"})
public class ArrayOfHostStorageArrayTypePolicyOption {
  @XmlElement(name = "HostStorageArrayTypePolicyOption")
  protected List<HostStorageArrayTypePolicyOption> hostStorageArrayTypePolicyOption;
  
  public List<HostStorageArrayTypePolicyOption> getHostStorageArrayTypePolicyOption() {
    if (this.hostStorageArrayTypePolicyOption == null)
      this.hostStorageArrayTypePolicyOption = new ArrayList<>(); 
    return this.hostStorageArrayTypePolicyOption;
  }
}
