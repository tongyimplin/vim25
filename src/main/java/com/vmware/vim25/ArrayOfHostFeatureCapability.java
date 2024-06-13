package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostFeatureCapability;
import com.vmware.vim25.HostFeatureCapability;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFeatureCapability", propOrder = {"hostFeatureCapability"})
public class ArrayOfHostFeatureCapability {
  @XmlElement(name = "HostFeatureCapability")
  protected List<HostFeatureCapability> hostFeatureCapability;
  
  public List<HostFeatureCapability> getHostFeatureCapability() {
    if (this.hostFeatureCapability == null)
      this.hostFeatureCapability = new ArrayList<>(); 
    return this.hostFeatureCapability;
  }
}
