package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMultipathInfoLogicalUnit;
import com.vmware.vim25.HostMultipathInfoLogicalUnitPolicy;
import com.vmware.vim25.HostMultipathInfoLogicalUnitStorageArrayTypePolicy;
import com.vmware.vim25.HostMultipathInfoPath;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfoLogicalUnit", propOrder = {"key", "id", "lun", "path", "policy", "storageArrayTypePolicy"})
public class HostMultipathInfoLogicalUnit extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String lun;
  
  @XmlElement(required = true)
  protected List<HostMultipathInfoPath> path;
  
  @XmlElement(required = true)
  protected HostMultipathInfoLogicalUnitPolicy policy;
  
  protected HostMultipathInfoLogicalUnitStorageArrayTypePolicy storageArrayTypePolicy;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getLun() {
    return this.lun;
  }
  
  public void setLun(String paramString) {
    this.lun = paramString;
  }
  
  public List<HostMultipathInfoPath> getPath() {
    if (this.path == null)
      this.path = new ArrayList<>(); 
    return this.path;
  }
  
  public HostMultipathInfoLogicalUnitPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(HostMultipathInfoLogicalUnitPolicy paramHostMultipathInfoLogicalUnitPolicy) {
    this.policy = paramHostMultipathInfoLogicalUnitPolicy;
  }
  
  public HostMultipathInfoLogicalUnitStorageArrayTypePolicy getStorageArrayTypePolicy() {
    return this.storageArrayTypePolicy;
  }
  
  public void setStorageArrayTypePolicy(HostMultipathInfoLogicalUnitStorageArrayTypePolicy paramHostMultipathInfoLogicalUnitStorageArrayTypePolicy) {
    this.storageArrayTypePolicy = paramHostMultipathInfoLogicalUnitStorageArrayTypePolicy;
  }
}
