package com.vmware.vim25;

import com.vmware.vim25.ApplyHostProfileConfigurationResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
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
@XmlType(name = "ApplyHostProfileConfigurationResult", propOrder = {"startTime", "completeTime", "host", "status", "errors"})
public class ApplyHostProfileConfigurationResult extends DynamicData {
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar startTime;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar completeTime;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String status;
  
  protected List<LocalizedMethodFault> errors;
  
  public XMLGregorianCalendar getStartTime() {
    return this.startTime;
  }
  
  public void setStartTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.startTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getCompleteTime() {
    return this.completeTime;
  }
  
  public void setCompleteTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.completeTime = paramXMLGregorianCalendar;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public List<LocalizedMethodFault> getErrors() {
    if (this.errors == null)
      this.errors = new ArrayList<>(); 
    return this.errors;
  }
}
