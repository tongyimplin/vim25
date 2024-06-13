package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PerformVsanUpgradeRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformVsanUpgradeRequestType", propOrder = {"_this", "cluster", "performObjectUpgrade", "downgradeFormat", "allowReducedRedundancy", "excludeHosts"})
public class PerformVsanUpgradeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference cluster;
  
  protected Boolean performObjectUpgrade;
  
  protected Boolean downgradeFormat;
  
  protected Boolean allowReducedRedundancy;
  
  protected List<ManagedObjectReference> excludeHosts;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getCluster() {
    return this.cluster;
  }
  
  public void setCluster(ManagedObjectReference paramManagedObjectReference) {
    this.cluster = paramManagedObjectReference;
  }
  
  public Boolean isPerformObjectUpgrade() {
    return this.performObjectUpgrade;
  }
  
  public void setPerformObjectUpgrade(Boolean paramBoolean) {
    this.performObjectUpgrade = paramBoolean;
  }
  
  public Boolean isDowngradeFormat() {
    return this.downgradeFormat;
  }
  
  public void setDowngradeFormat(Boolean paramBoolean) {
    this.downgradeFormat = paramBoolean;
  }
  
  public Boolean isAllowReducedRedundancy() {
    return this.allowReducedRedundancy;
  }
  
  public void setAllowReducedRedundancy(Boolean paramBoolean) {
    this.allowReducedRedundancy = paramBoolean;
  }
  
  public List<ManagedObjectReference> getExcludeHosts() {
    if (this.excludeHosts == null)
      this.excludeHosts = new ArrayList<>(); 
    return this.excludeHosts;
  }
}
