package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HealthUpdate;
import com.vmware.vim25.ManagedEntityStatus;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthUpdate", propOrder = {"entity", "healthUpdateInfoId", "id", "status", "remediation"})
public class HealthUpdate extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected String healthUpdateInfoId;
  
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus status;
  
  @XmlElement(required = true)
  protected String remediation;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public String getHealthUpdateInfoId() {
    return this.healthUpdateInfoId;
  }
  
  public void setHealthUpdateInfoId(String paramString) {
    this.healthUpdateInfoId = paramString;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public ManagedEntityStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.status = paramManagedEntityStatus;
  }
  
  public String getRemediation() {
    return this.remediation;
  }
  
  public void setRemediation(String paramString) {
    this.remediation = paramString;
  }
}
