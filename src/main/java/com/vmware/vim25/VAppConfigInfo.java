package com.vmware.vim25;

import com.vmware.vim25.ManagedByInfo;
import com.vmware.vim25.VAppConfigInfo;
import com.vmware.vim25.VAppEntityConfigInfo;
import com.vmware.vim25.VmConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppConfigInfo", propOrder = {"entityConfig", "annotation", "instanceUuid", "managedBy"})
public class VAppConfigInfo extends VmConfigInfo {
  protected List<VAppEntityConfigInfo> entityConfig;
  
  @XmlElement(required = true)
  protected String annotation;
  
  protected String instanceUuid;
  
  protected ManagedByInfo managedBy;
  
  public List<VAppEntityConfigInfo> getEntityConfig() {
    if (this.entityConfig == null)
      this.entityConfig = new ArrayList<>(); 
    return this.entityConfig;
  }
  
  public String getAnnotation() {
    return this.annotation;
  }
  
  public void setAnnotation(String paramString) {
    this.annotation = paramString;
  }
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
  
  public ManagedByInfo getManagedBy() {
    return this.managedBy;
  }
  
  public void setManagedBy(ManagedByInfo paramManagedByInfo) {
    this.managedBy = paramManagedByInfo;
  }
}
