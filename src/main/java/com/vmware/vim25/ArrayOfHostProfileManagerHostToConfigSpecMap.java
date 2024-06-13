package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostProfileManagerHostToConfigSpecMap;
import com.vmware.vim25.HostProfileManagerHostToConfigSpecMap;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProfileManagerHostToConfigSpecMap", propOrder = {"hostProfileManagerHostToConfigSpecMap"})
public class ArrayOfHostProfileManagerHostToConfigSpecMap {
  @XmlElement(name = "HostProfileManagerHostToConfigSpecMap")
  protected List<HostProfileManagerHostToConfigSpecMap> hostProfileManagerHostToConfigSpecMap;
  
  public List<HostProfileManagerHostToConfigSpecMap> getHostProfileManagerHostToConfigSpecMap() {
    if (this.hostProfileManagerHostToConfigSpecMap == null)
      this.hostProfileManagerHostToConfigSpecMap = new ArrayList<>(); 
    return this.hostProfileManagerHostToConfigSpecMap;
  }
}
