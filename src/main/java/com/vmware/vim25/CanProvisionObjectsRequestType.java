package com.vmware.vim25;

import com.vmware.vim25.CanProvisionObjectsRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VsanNewPolicyBatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanProvisionObjectsRequestType", propOrder = {"_this", "npbs", "ignoreSatisfiability"})
public class CanProvisionObjectsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<VsanNewPolicyBatch> npbs;
  
  protected Boolean ignoreSatisfiability;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<VsanNewPolicyBatch> getNpbs() {
    if (this.npbs == null)
      this.npbs = new ArrayList<>(); 
    return this.npbs;
  }
  
  public Boolean isIgnoreSatisfiability() {
    return this.ignoreSatisfiability;
  }
  
  public void setIgnoreSatisfiability(Boolean paramBoolean) {
    this.ignoreSatisfiability = paramBoolean;
  }
}
