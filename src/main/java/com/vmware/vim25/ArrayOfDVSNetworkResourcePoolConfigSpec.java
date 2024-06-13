package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDVSNetworkResourcePoolConfigSpec;
import com.vmware.vim25.DVSNetworkResourcePoolConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDVSNetworkResourcePoolConfigSpec", propOrder = {"dvsNetworkResourcePoolConfigSpec"})
public class ArrayOfDVSNetworkResourcePoolConfigSpec {
  @XmlElement(name = "DVSNetworkResourcePoolConfigSpec")
  protected List<DVSNetworkResourcePoolConfigSpec> dvsNetworkResourcePoolConfigSpec;
  
  public List<DVSNetworkResourcePoolConfigSpec> getDVSNetworkResourcePoolConfigSpec() {
    if (this.dvsNetworkResourcePoolConfigSpec == null)
      this.dvsNetworkResourcePoolConfigSpec = new ArrayList<>(); 
    return this.dvsNetworkResourcePoolConfigSpec;
  }
}
