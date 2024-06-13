package com.vmware.vim25;

import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.VirtualDiskAntiAffinityRuleSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskAntiAffinityRuleSpec", propOrder = {"diskId"})
public class VirtualDiskAntiAffinityRuleSpec extends ClusterRuleInfo {
  @XmlElement(type = Integer.class)
  protected List<Integer> diskId;
  
  public List<Integer> getDiskId() {
    if (this.diskId == null)
      this.diskId = new ArrayList<>(); 
    return this.diskId;
  }
}
