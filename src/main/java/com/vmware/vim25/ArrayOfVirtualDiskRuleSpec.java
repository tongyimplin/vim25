package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualDiskRuleSpec;
import com.vmware.vim25.VirtualDiskRuleSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDiskRuleSpec", propOrder = {"virtualDiskRuleSpec"})
public class ArrayOfVirtualDiskRuleSpec {
  @XmlElement(name = "VirtualDiskRuleSpec")
  protected List<VirtualDiskRuleSpec> virtualDiskRuleSpec;
  
  public List<VirtualDiskRuleSpec> getVirtualDiskRuleSpec() {
    if (this.virtualDiskRuleSpec == null)
      this.virtualDiskRuleSpec = new ArrayList<>(); 
    return this.virtualDiskRuleSpec;
  }
}
