package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineConfigOptionDescriptor;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConfigOptionDescriptor", propOrder = {"key", "description", "host", "createSupported", "defaultConfigOption", "runSupported", "upgradeSupported"})
public class VirtualMachineConfigOptionDescriptor extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected String description;
  
  protected List<ManagedObjectReference> host;
  
  protected Boolean createSupported;
  
  protected Boolean defaultConfigOption;
  
  protected Boolean runSupported;
  
  protected Boolean upgradeSupported;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
  
  public Boolean isCreateSupported() {
    return this.createSupported;
  }
  
  public void setCreateSupported(Boolean paramBoolean) {
    this.createSupported = paramBoolean;
  }
  
  public Boolean isDefaultConfigOption() {
    return this.defaultConfigOption;
  }
  
  public void setDefaultConfigOption(Boolean paramBoolean) {
    this.defaultConfigOption = paramBoolean;
  }
  
  public Boolean isRunSupported() {
    return this.runSupported;
  }
  
  public void setRunSupported(Boolean paramBoolean) {
    this.runSupported = paramBoolean;
  }
  
  public Boolean isUpgradeSupported() {
    return this.upgradeSupported;
  }
  
  public void setUpgradeSupported(Boolean paramBoolean) {
    this.upgradeSupported = paramBoolean;
  }
}
