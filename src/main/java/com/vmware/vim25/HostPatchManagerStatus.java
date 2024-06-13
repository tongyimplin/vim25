package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPatchManagerStatus;
import com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPatchManagerStatus", propOrder = {"id", "applicable", "reason", "integrity", "installed", "installState", "prerequisitePatch", "restartRequired", "reconnectRequired", "vmOffRequired", "supersededPatchIds"})
public class HostPatchManagerStatus extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  protected boolean applicable;
  
  protected List<String> reason;
  
  protected String integrity;
  
  protected boolean installed;
  
  protected List<String> installState;
  
  protected List<HostPatchManagerStatusPrerequisitePatch> prerequisitePatch;
  
  protected boolean restartRequired;
  
  protected boolean reconnectRequired;
  
  protected boolean vmOffRequired;
  
  protected List<String> supersededPatchIds;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public boolean isApplicable() {
    return this.applicable;
  }
  
  public void setApplicable(boolean paramBoolean) {
    this.applicable = paramBoolean;
  }
  
  public List<String> getReason() {
    if (this.reason == null)
      this.reason = new ArrayList<>(); 
    return this.reason;
  }
  
  public String getIntegrity() {
    return this.integrity;
  }
  
  public void setIntegrity(String paramString) {
    this.integrity = paramString;
  }
  
  public boolean isInstalled() {
    return this.installed;
  }
  
  public void setInstalled(boolean paramBoolean) {
    this.installed = paramBoolean;
  }
  
  public List<String> getInstallState() {
    if (this.installState == null)
      this.installState = new ArrayList<>(); 
    return this.installState;
  }
  
  public List<HostPatchManagerStatusPrerequisitePatch> getPrerequisitePatch() {
    if (this.prerequisitePatch == null)
      this.prerequisitePatch = new ArrayList<>(); 
    return this.prerequisitePatch;
  }
  
  public boolean isRestartRequired() {
    return this.restartRequired;
  }
  
  public void setRestartRequired(boolean paramBoolean) {
    this.restartRequired = paramBoolean;
  }
  
  public boolean isReconnectRequired() {
    return this.reconnectRequired;
  }
  
  public void setReconnectRequired(boolean paramBoolean) {
    this.reconnectRequired = paramBoolean;
  }
  
  public boolean isVmOffRequired() {
    return this.vmOffRequired;
  }
  
  public void setVmOffRequired(boolean paramBoolean) {
    this.vmOffRequired = paramBoolean;
  }
  
  public List<String> getSupersededPatchIds() {
    if (this.supersededPatchIds == null)
      this.supersededPatchIds = new ArrayList<>(); 
    return this.supersededPatchIds;
  }
}
