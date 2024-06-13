package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsVmVnicResourcePoolConfigSpec;
import com.vmware.vim25.DvsVmVnicResourcePoolConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsVmVnicResourcePoolConfigSpec", propOrder = {"dvsVmVnicResourcePoolConfigSpec"})
public class ArrayOfDvsVmVnicResourcePoolConfigSpec {
  @XmlElement(name = "DvsVmVnicResourcePoolConfigSpec")
  protected List<DvsVmVnicResourcePoolConfigSpec> dvsVmVnicResourcePoolConfigSpec;
  
  public List<DvsVmVnicResourcePoolConfigSpec> getDvsVmVnicResourcePoolConfigSpec() {
    if (this.dvsVmVnicResourcePoolConfigSpec == null)
      this.dvsVmVnicResourcePoolConfigSpec = new ArrayList<>(); 
    return this.dvsVmVnicResourcePoolConfigSpec;
  }
}
