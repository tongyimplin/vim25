package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.VsanPolicyCost;
import com.vmware.vim25.VsanPolicySatisfiability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanPolicySatisfiability", propOrder = {"uuid", "isSatisfiable", "reason", "cost"})
public class VsanPolicySatisfiability extends DynamicData {
  protected String uuid;
  
  protected boolean isSatisfiable;
  
  protected LocalizableMessage reason;
  
  protected VsanPolicyCost cost;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public boolean isIsSatisfiable() {
    return this.isSatisfiable;
  }
  
  public void setIsSatisfiable(boolean paramBoolean) {
    this.isSatisfiable = paramBoolean;
  }
  
  public LocalizableMessage getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizableMessage paramLocalizableMessage) {
    this.reason = paramLocalizableMessage;
  }
  
  public VsanPolicyCost getCost() {
    return this.cost;
  }
  
  public void setCost(VsanPolicyCost paramVsanPolicyCost) {
    this.cost = paramVsanPolicyCost;
  }
}
