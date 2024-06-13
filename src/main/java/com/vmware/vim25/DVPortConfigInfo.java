package com.vmware.vim25;

import com.vmware.vim25.DVPortConfigInfo;
import com.vmware.vim25.DVPortSetting;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortConfigInfo", propOrder = {"name", "scope", "description", "setting", "configVersion"})
public class DVPortConfigInfo extends DynamicData {
  protected String name;
  
  protected List<ManagedObjectReference> scope;
  
  protected String description;
  
  protected DVPortSetting setting;
  
  @XmlElement(required = true)
  protected String configVersion;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public List<ManagedObjectReference> getScope() {
    if (this.scope == null)
      this.scope = new ArrayList<>(); 
    return this.scope;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public DVPortSetting getSetting() {
    return this.setting;
  }
  
  public void setSetting(DVPortSetting paramDVPortSetting) {
    this.setting = paramDVPortSetting;
  }
  
  public String getConfigVersion() {
    return this.configVersion;
  }
  
  public void setConfigVersion(String paramString) {
    this.configVersion = paramString;
  }
}
