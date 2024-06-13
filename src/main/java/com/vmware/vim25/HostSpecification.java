package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSpecification;
import com.vmware.vim25.HostSubSpecification;
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
@XmlType(name = "HostSpecification", propOrder = {"createdTime", "lastModified", "host", "subSpecs", "changeID"})
public class HostSpecification extends DynamicData {
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createdTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastModified;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected List<HostSubSpecification> subSpecs;
  
  protected String changeID;
  
  public XMLGregorianCalendar getCreatedTime() {
    return this.createdTime;
  }
  
  public void setCreatedTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createdTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getLastModified() {
    return this.lastModified;
  }
  
  public void setLastModified(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastModified = paramXMLGregorianCalendar;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<HostSubSpecification> getSubSpecs() {
    if (this.subSpecs == null)
      this.subSpecs = new ArrayList<>(); 
    return this.subSpecs;
  }
  
  public String getChangeID() {
    return this.changeID;
  }
  
  public void setChangeID(String paramString) {
    this.changeID = paramString;
  }
}
