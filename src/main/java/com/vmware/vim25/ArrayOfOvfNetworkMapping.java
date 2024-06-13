package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfNetworkMapping;
import com.vmware.vim25.OvfNetworkMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfNetworkMapping", propOrder = {"ovfNetworkMapping"})
public class ArrayOfOvfNetworkMapping {
  @XmlElement(name = "OvfNetworkMapping")
  protected List<OvfNetworkMapping> ovfNetworkMapping;
  
  public List<OvfNetworkMapping> getOvfNetworkMapping() {
    if (this.ovfNetworkMapping == null)
      this.ovfNetworkMapping = new ArrayList<>(); 
    return this.ovfNetworkMapping;
  }
}
