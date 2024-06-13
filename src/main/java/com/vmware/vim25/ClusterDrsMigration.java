package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsMigration;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsMigration", propOrder = {"key", "time", "vm", "cpuLoad", "memoryLoad", "source", "sourceCpuLoad", "sourceMemoryLoad", "destination", "destinationCpuLoad", "destinationMemoryLoad"})
public class ClusterDrsMigration extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar time;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  protected Integer cpuLoad;
  
  protected Long memoryLoad;
  
  @XmlElement(required = true)
  protected ManagedObjectReference source;
  
  protected Integer sourceCpuLoad;
  
  protected Long sourceMemoryLoad;
  
  @XmlElement(required = true)
  protected ManagedObjectReference destination;
  
  protected Integer destinationCpuLoad;
  
  protected Long destinationMemoryLoad;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public XMLGregorianCalendar getTime() {
    return this.time;
  }
  
  public void setTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.time = paramXMLGregorianCalendar;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public Integer getCpuLoad() {
    return this.cpuLoad;
  }
  
  public void setCpuLoad(Integer paramInteger) {
    this.cpuLoad = paramInteger;
  }
  
  public Long getMemoryLoad() {
    return this.memoryLoad;
  }
  
  public void setMemoryLoad(Long paramLong) {
    this.memoryLoad = paramLong;
  }
  
  public ManagedObjectReference getSource() {
    return this.source;
  }
  
  public void setSource(ManagedObjectReference paramManagedObjectReference) {
    this.source = paramManagedObjectReference;
  }
  
  public Integer getSourceCpuLoad() {
    return this.sourceCpuLoad;
  }
  
  public void setSourceCpuLoad(Integer paramInteger) {
    this.sourceCpuLoad = paramInteger;
  }
  
  public Long getSourceMemoryLoad() {
    return this.sourceMemoryLoad;
  }
  
  public void setSourceMemoryLoad(Long paramLong) {
    this.sourceMemoryLoad = paramLong;
  }
  
  public ManagedObjectReference getDestination() {
    return this.destination;
  }
  
  public void setDestination(ManagedObjectReference paramManagedObjectReference) {
    this.destination = paramManagedObjectReference;
  }
  
  public Integer getDestinationCpuLoad() {
    return this.destinationCpuLoad;
  }
  
  public void setDestinationCpuLoad(Integer paramInteger) {
    this.destinationCpuLoad = paramInteger;
  }
  
  public Long getDestinationMemoryLoad() {
    return this.destinationMemoryLoad;
  }
  
  public void setDestinationMemoryLoad(Long paramLong) {
    this.destinationMemoryLoad = paramLong;
  }
}
