package com.vmware.vim25;

import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.VirtualDiskRuleSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskRuleSpec", propOrder = {"diskRuleType", "diskId"})
public class VirtualDiskRuleSpec extends ClusterRuleInfo {
  @XmlElement(required = true)
  protected String diskRuleType;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> diskId;
  
  public String getDiskRuleType() {
    return this.diskRuleType;
  }
  
  public void setDiskRuleType(String paramString) {
    this.diskRuleType = paramString;
  }
  
  public List<Integer> getDiskId() {
    if (this.diskId == null)
      this.diskId = new ArrayList<>(); 
    return this.diskId;
  }
}
