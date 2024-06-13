package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PerfMetricId;
import com.vmware.vim25.PerfQuerySpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfQuerySpec", propOrder = {"entity", "startTime", "endTime", "maxSample", "metricId", "intervalId", "format"})
public class PerfQuerySpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar startTime;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar endTime;
  
  protected Integer maxSample;
  
  protected List<PerfMetricId> metricId;
  
  protected Integer intervalId;
  
  protected String format;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public XMLGregorianCalendar getStartTime() {
    return this.startTime;
  }
  
  public void setStartTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.startTime = paramXMLGregorianCalendar;
  }
  
  public XMLGregorianCalendar getEndTime() {
    return this.endTime;
  }
  
  public void setEndTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.endTime = paramXMLGregorianCalendar;
  }
  
  public Integer getMaxSample() {
    return this.maxSample;
  }
  
  public void setMaxSample(Integer paramInteger) {
    this.maxSample = paramInteger;
  }
  
  public List<PerfMetricId> getMetricId() {
    if (this.metricId == null)
      this.metricId = new ArrayList<>(); 
    return this.metricId;
  }
  
  public Integer getIntervalId() {
    return this.intervalId;
  }
  
  public void setIntervalId(Integer paramInteger) {
    this.intervalId = paramInteger;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public void setFormat(String paramString) {
    this.format = paramString;
  }
}
