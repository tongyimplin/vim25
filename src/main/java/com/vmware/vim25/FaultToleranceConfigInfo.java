package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceConfigInfo;
import com.vmware.vim25.FaultTolerancePrimaryConfigInfo;
import com.vmware.vim25.FaultToleranceSecondaryConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceConfigInfo", propOrder = {"role", "instanceUuids", "configPaths", "orphaned"})
@XmlSeeAlso({FaultTolerancePrimaryConfigInfo.class, FaultToleranceSecondaryConfigInfo.class})
public class FaultToleranceConfigInfo extends DynamicData {
  protected int role;
  
  @XmlElement(required = true)
  protected List<String> instanceUuids;
  
  @XmlElement(required = true)
  protected List<String> configPaths;
  
  protected Boolean orphaned;
  
  public int getRole() {
    return this.role;
  }
  
  public void setRole(int paramInt) {
    this.role = paramInt;
  }
  
  public List<String> getInstanceUuids() {
    if (this.instanceUuids == null)
      this.instanceUuids = new ArrayList<>(); 
    return this.instanceUuids;
  }
  
  public List<String> getConfigPaths() {
    if (this.configPaths == null)
      this.configPaths = new ArrayList<>(); 
    return this.configPaths;
  }
  
  public Boolean isOrphaned() {
    return this.orphaned;
  }
  
  public void setOrphaned(Boolean paramBoolean) {
    this.orphaned = paramBoolean;
  }
}
