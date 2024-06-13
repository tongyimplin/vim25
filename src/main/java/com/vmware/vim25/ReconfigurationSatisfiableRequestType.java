package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigurationSatisfiableRequestType;
import com.vmware.vim25.VsanPolicyChangeBatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigurationSatisfiableRequestType", propOrder = {"_this", "pcbs", "ignoreSatisfiability"})
public class ReconfigurationSatisfiableRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<VsanPolicyChangeBatch> pcbs;
  
  protected Boolean ignoreSatisfiability;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<VsanPolicyChangeBatch> getPcbs() {
    if (this.pcbs == null)
      this.pcbs = new ArrayList<>(); 
    return this.pcbs;
  }
  
  public Boolean isIgnoreSatisfiability() {
    return this.ignoreSatisfiability;
  }
  
  public void setIgnoreSatisfiability(Boolean paramBoolean) {
    this.ignoreSatisfiability = paramBoolean;
  }
}
