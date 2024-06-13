package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFeatureCapability;
import com.vmware.vim25.HostOpaqueSwitch;
import com.vmware.vim25.HostOpaqueSwitchPhysicalNicZone;
import com.vmware.vim25.HostVirtualNic;
import com.vmware.vim25.OptionValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostOpaqueSwitch", propOrder = {"key", "name", "pnic", "pnicZone", "status", "vtep", "extraConfig", "featureCapability"})
public class HostOpaqueSwitch extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected String name;
  
  protected List<String> pnic;
  
  protected List<HostOpaqueSwitchPhysicalNicZone> pnicZone;
  
  protected String status;
  
  protected List<HostVirtualNic> vtep;
  
  protected List<OptionValue> extraConfig;
  
  protected List<HostFeatureCapability> featureCapability;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public List<String> getPnic() {
    if (this.pnic == null)
      this.pnic = new ArrayList<>(); 
    return this.pnic;
  }
  
  public List<HostOpaqueSwitchPhysicalNicZone> getPnicZone() {
    if (this.pnicZone == null)
      this.pnicZone = new ArrayList<>(); 
    return this.pnicZone;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public List<HostVirtualNic> getVtep() {
    if (this.vtep == null)
      this.vtep = new ArrayList<>(); 
    return this.vtep;
  }
  
  public List<OptionValue> getExtraConfig() {
    if (this.extraConfig == null)
      this.extraConfig = new ArrayList<>(); 
    return this.extraConfig;
  }
  
  public List<HostFeatureCapability> getFeatureCapability() {
    if (this.featureCapability == null)
      this.featureCapability = new ArrayList<>(); 
    return this.featureCapability;
  }
}
