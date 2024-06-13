package com.vmware.vim25;

import com.vmware.vim25.ComplianceFailure;
import com.vmware.vim25.ComplianceResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceResult", propOrder = {"profile", "complianceStatus", "entity", "checkTime", "failure"})
public class ComplianceResult extends DynamicData {
  protected ManagedObjectReference profile;
  
  @XmlElement(required = true)
  protected String complianceStatus;
  
  protected ManagedObjectReference entity;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar checkTime;
  
  protected List<ComplianceFailure> failure;
  
  public ManagedObjectReference getProfile() {
    return this.profile;
  }
  
  public void setProfile(ManagedObjectReference paramManagedObjectReference) {
    this.profile = paramManagedObjectReference;
  }
  
  public String getComplianceStatus() {
    return this.complianceStatus;
  }
  
  public void setComplianceStatus(String paramString) {
    this.complianceStatus = paramString;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public XMLGregorianCalendar getCheckTime() {
    return this.checkTime;
  }
  
  public void setCheckTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.checkTime = paramXMLGregorianCalendar;
  }
  
  public List<ComplianceFailure> getFailure() {
    if (this.failure == null)
      this.failure = new ArrayList<>(); 
    return this.failure;
  }
}
