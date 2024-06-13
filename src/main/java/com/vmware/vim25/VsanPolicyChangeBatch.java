package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanPolicyChangeBatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanPolicyChangeBatch", propOrder = {"uuid", "policy"})
public class VsanPolicyChangeBatch extends DynamicData {
  protected List<String> uuid;
  
  protected String policy;
  
  public List<String> getUuid() {
    if (this.uuid == null)
      this.uuid = new ArrayList<>(); 
    return this.uuid;
  }
  
  public String getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(String paramString) {
    this.policy = paramString;
  }
}
