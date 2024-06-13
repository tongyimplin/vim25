package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetworkResourceRuntime;
import com.vmware.vim25.HostPnicNetworkResourceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkResourceRuntime", propOrder = {"pnicResourceInfo"})
public class HostNetworkResourceRuntime extends DynamicData {
  @XmlElement(required = true)
  protected List<HostPnicNetworkResourceInfo> pnicResourceInfo;
  
  public List<HostPnicNetworkResourceInfo> getPnicResourceInfo() {
    if (this.pnicResourceInfo == null)
      this.pnicResourceInfo = new ArrayList<>(); 
    return this.pnicResourceInfo;
  }
}
