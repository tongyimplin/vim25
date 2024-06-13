package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLowLevelProvisioningManagerVmMigrationStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerVmMigrationStatus", propOrder = {"migrationId", "type", "source", "consideredSuccessful"})
public class HostLowLevelProvisioningManagerVmMigrationStatus extends DynamicData {
  protected long migrationId;
  
  @XmlElement(required = true)
  protected String type;
  
  protected boolean source;
  
  protected boolean consideredSuccessful;
  
  public long getMigrationId() {
    return this.migrationId;
  }
  
  public void setMigrationId(long paramLong) {
    this.migrationId = paramLong;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public boolean isSource() {
    return this.source;
  }
  
  public void setSource(boolean paramBoolean) {
    this.source = paramBoolean;
  }
  
  public boolean isConsideredSuccessful() {
    return this.consideredSuccessful;
  }
  
  public void setConsideredSuccessful(boolean paramBoolean) {
    this.consideredSuccessful = paramBoolean;
  }
}
