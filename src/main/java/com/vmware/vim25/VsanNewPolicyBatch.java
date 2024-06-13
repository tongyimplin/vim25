package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanNewPolicyBatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanNewPolicyBatch", propOrder = {"size", "policy"})
public class VsanNewPolicyBatch extends DynamicData {
  @XmlElement(type = Long.class)
  protected List<Long> size;
  
  protected String policy;
  
  public List<Long> getSize() {
    if (this.size == null)
      this.size = new ArrayList<>(); 
    return this.size;
  }
  
  public String getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(String paramString) {
    this.policy = paramString;
  }
}
