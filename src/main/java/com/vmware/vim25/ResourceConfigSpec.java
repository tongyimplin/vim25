package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResourceAllocationInfo;
import com.vmware.vim25.ResourceConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceConfigSpec", propOrder = {"entity", "changeVersion", "lastModified", "cpuAllocation", "memoryAllocation", "scaleDescendantsShares"})
public class ResourceConfigSpec extends DynamicData {
  protected ManagedObjectReference entity;
  
  protected String changeVersion;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastModified;
  
  @XmlElement(required = true)
  protected ResourceAllocationInfo cpuAllocation;
  
  @XmlElement(required = true)
  protected ResourceAllocationInfo memoryAllocation;
  
  protected String scaleDescendantsShares;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public String getChangeVersion() {
    return this.changeVersion;
  }
  
  public void setChangeVersion(String paramString) {
    this.changeVersion = paramString;
  }
  
  public XMLGregorianCalendar getLastModified() {
    return this.lastModified;
  }
  
  public void setLastModified(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastModified = paramXMLGregorianCalendar;
  }
  
  public ResourceAllocationInfo getCpuAllocation() {
    return this.cpuAllocation;
  }
  
  public void setCpuAllocation(ResourceAllocationInfo paramResourceAllocationInfo) {
    this.cpuAllocation = paramResourceAllocationInfo;
  }
  
  public ResourceAllocationInfo getMemoryAllocation() {
    return this.memoryAllocation;
  }
  
  public void setMemoryAllocation(ResourceAllocationInfo paramResourceAllocationInfo) {
    this.memoryAllocation = paramResourceAllocationInfo;
  }
  
  public String getScaleDescendantsShares() {
    return this.scaleDescendantsShares;
  }
  
  public void setScaleDescendantsShares(String paramString) {
    this.scaleDescendantsShares = paramString;
  }
}
