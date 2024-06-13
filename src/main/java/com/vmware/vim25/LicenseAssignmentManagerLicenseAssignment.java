package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment;
import com.vmware.vim25.LicenseManagerLicenseInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseAssignmentManagerLicenseAssignment", propOrder = {"entityId", "scope", "entityDisplayName", "assignedLicense", "properties"})
public class LicenseAssignmentManagerLicenseAssignment extends DynamicData {
  @XmlElement(required = true)
  protected String entityId;
  
  protected String scope;
  
  protected String entityDisplayName;
  
  @XmlElement(required = true)
  protected LicenseManagerLicenseInfo assignedLicense;
  
  protected List<KeyAnyValue> properties;
  
  public String getEntityId() {
    return this.entityId;
  }
  
  public void setEntityId(String paramString) {
    this.entityId = paramString;
  }
  
  public String getScope() {
    return this.scope;
  }
  
  public void setScope(String paramString) {
    this.scope = paramString;
  }
  
  public String getEntityDisplayName() {
    return this.entityDisplayName;
  }
  
  public void setEntityDisplayName(String paramString) {
    this.entityDisplayName = paramString;
  }
  
  public LicenseManagerLicenseInfo getAssignedLicense() {
    return this.assignedLicense;
  }
  
  public void setAssignedLicense(LicenseManagerLicenseInfo paramLicenseManagerLicenseInfo) {
    this.assignedLicense = paramLicenseManagerLicenseInfo;
  }
  
  public List<KeyAnyValue> getProperties() {
    if (this.properties == null)
      this.properties = new ArrayList<>(); 
    return this.properties;
  }
}
