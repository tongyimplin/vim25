package com.vmware.vim25;

import com.vmware.vim25.DVSMacLearningPolicy;
import com.vmware.vim25.DVSMacManagementPolicy;
import com.vmware.vim25.InheritablePolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSMacManagementPolicy", propOrder = {"allowPromiscuous", "macChanges", "forgedTransmits", "macLearningPolicy"})
public class DVSMacManagementPolicy extends InheritablePolicy {
  protected Boolean allowPromiscuous;
  
  protected Boolean macChanges;
  
  protected Boolean forgedTransmits;
  
  protected DVSMacLearningPolicy macLearningPolicy;
  
  public Boolean isAllowPromiscuous() {
    return this.allowPromiscuous;
  }
  
  public void setAllowPromiscuous(Boolean paramBoolean) {
    this.allowPromiscuous = paramBoolean;
  }
  
  public Boolean isMacChanges() {
    return this.macChanges;
  }
  
  public void setMacChanges(Boolean paramBoolean) {
    this.macChanges = paramBoolean;
  }
  
  public Boolean isForgedTransmits() {
    return this.forgedTransmits;
  }
  
  public void setForgedTransmits(Boolean paramBoolean) {
    this.forgedTransmits = paramBoolean;
  }
  
  public DVSMacLearningPolicy getMacLearningPolicy() {
    return this.macLearningPolicy;
  }
  
  public void setMacLearningPolicy(DVSMacLearningPolicy paramDVSMacLearningPolicy) {
    this.macLearningPolicy = paramDVSMacLearningPolicy;
  }
}
