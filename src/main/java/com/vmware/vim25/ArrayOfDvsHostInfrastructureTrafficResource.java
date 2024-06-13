package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsHostInfrastructureTrafficResource;
import com.vmware.vim25.DvsHostInfrastructureTrafficResource;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsHostInfrastructureTrafficResource", propOrder = {"dvsHostInfrastructureTrafficResource"})
public class ArrayOfDvsHostInfrastructureTrafficResource {
  @XmlElement(name = "DvsHostInfrastructureTrafficResource")
  protected List<DvsHostInfrastructureTrafficResource> dvsHostInfrastructureTrafficResource;
  
  public List<DvsHostInfrastructureTrafficResource> getDvsHostInfrastructureTrafficResource() {
    if (this.dvsHostInfrastructureTrafficResource == null)
      this.dvsHostInfrastructureTrafficResource = new ArrayList<>(); 
    return this.dvsHostInfrastructureTrafficResource;
  }
}
