package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsVnicAllocatedResource;
import com.vmware.vim25.DvsVnicAllocatedResource;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsVnicAllocatedResource", propOrder = {"dvsVnicAllocatedResource"})
public class ArrayOfDvsVnicAllocatedResource {
  @XmlElement(name = "DvsVnicAllocatedResource")
  protected List<DvsVnicAllocatedResource> dvsVnicAllocatedResource;
  
  public List<DvsVnicAllocatedResource> getDvsVnicAllocatedResource() {
    if (this.dvsVnicAllocatedResource == null)
      this.dvsVnicAllocatedResource = new ArrayList<>(); 
    return this.dvsVnicAllocatedResource;
  }
}
